package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		driver.switchTo().frame("iframeResult");
		String name = driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]")).getText();
		System.out.println(name);
}

}
