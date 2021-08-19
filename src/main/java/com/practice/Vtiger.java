package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import genrics.Getdata;

public class Vtiger {
	WebDriver driver;
	@BeforeMethod
	public void openapp(){
		//WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	@Test
	public void app() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Getdata gt=new Getdata();
		int random=gt.data();
		driver.findElement(By.name("accountname")).sendKeys("Rahul"+random);
		Select s=new Select(driver.findElement(By.name("industry")));
		s.selectByValue("Construction");
		Select sc=new Select(driver.findElement(By.name("accounttype")));
		sc.selectByValue("Integrator");
		Select st=new Select(driver.findElement(By.name("rating")));
		st.selectByValue("Active");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	}
}
