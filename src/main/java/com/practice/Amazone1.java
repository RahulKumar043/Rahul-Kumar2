package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazone1 {

	WebDriver driver;
	@BeforeMethod
	public void openapp(){
		//WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	@Test
	public void Searchmobile() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile under 15000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//ul[@aria-labelledby='p_89-title']//i[@class='a-icon a-icon-checkbox']")).click();
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
		
		String text = driver.findElement(By.xpath("//span[@cel_widget_id='MAIN-SEARCH_RESULTS-0']//span[@class='a-price-whole']")).getText();
		StringBuffer sb=new StringBuffer(text);
		sb.deleteCharAt(2);
		String price=new String(sb);
		int actualprice=Integer.parseInt(price);
		int expectedprice=15000;
		
		if(actualprice<expectedprice) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		
		
				}
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
