package com.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger2 {
	WebDriver driver;
	@BeforeMethod
	public void openapp(){
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
}
	@Test
	 public void app1()
	 {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("Rahul");
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		Set<String> WindowIDS = driver.getWindowHandles();
		Iterator<String> iterator=WindowIDS.iterator();
		String parentId=iterator.next();
		String childId=iterator.next();
		
		driver.switchTo().window(childId);
			driver.findElement(By.name("search_text")).sendKeys("Rahul");
			driver.findElement(By.name("search")).click();
			//driver.findElement(By.xpath("//a[text()='abc']")).click();
			
			
			
	 }
}