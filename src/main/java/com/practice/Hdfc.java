package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='btn-primary dropdown-toggle btn-block']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		int count = ele.size();
		System.out.println(count);
		for(int i = 0;i<ele.size();i++) {
			String trxt = ele.get(i).getText();
			System.out.println(trxt);
		//ele.get(2).click();
		//driver.findElement(By.xpath("//a[@class='btn-primary dropdown-toggle btn-block']")).click();
		//List<WebElement> ele1 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		//int counts = ele1.size();
	//	System.out.println(counts);
		//for(int j = 0;j<ele1.size();j++) {
			//String text = ele1.get(j).getText();
			//System.out.println(text);
			//ele1.get(3).click();
			
		}
}

}

