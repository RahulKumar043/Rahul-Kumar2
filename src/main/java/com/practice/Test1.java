package com.practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import genrics.ReaddatausingPropfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	WebDriver driver;
	ReaddatausingPropfile gm=new ReaddatausingPropfile();
	@BeforeMethod
	public void setup() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(gm.read("url"));
	}
	@Test
	public void TestCase() throws FileNotFoundException, IOException {
		driver.findElement(By.name("user_name")).sendKeys(gm.read("un"));
		driver.findElement(By.name("user_password")).sendKeys(gm.read("pwd"));
		driver.findElement(By.id("submitButton")).click();
	}
	@AfterMethod
	public void end() {
		driver.close();
	}
}
