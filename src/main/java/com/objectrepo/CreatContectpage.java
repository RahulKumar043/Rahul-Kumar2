package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatContectpage {

	public CreatContectpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
}
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contectbtn;
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement creatcontactbtn;

	public WebElement getContectbtn() {
		return contectbtn;
	}

	public WebElement getCreatcontactbtn() {
		return creatcontactbtn;
	}
	public void Creatcotectpage() {
		contectbtn.click();
		creatcontactbtn.click();
	}
	
}