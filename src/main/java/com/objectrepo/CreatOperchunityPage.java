package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatOperchunityPage {
	
	public CreatOperchunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement plusbtn;
	
	public WebElement getPlusbtn() {
		return plusbtn;
	}
	public void creatoperchunitypage() {
		plusbtn.click();
	}

}
