package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	WebDriver driver;
	@BeforeMethod
	public void openapp(){
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@Test
public void app() {
	driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
	driver.findElement(By.xpath("//li[text()='Accounts']")).click();
	driver.findElement(By.xpath("//a[text()='Select Product']")).click();
	driver.findElement(By.xpath("//li[text()='Select Product']")).click();
	}
		
}
