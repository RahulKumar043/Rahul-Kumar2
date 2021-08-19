package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creatorgpage {
	public Creatorgpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement plusbtn;
	
	@FindBy(name="lastname")
	private WebElement orgname;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getOrgname() {
		return orgname;
	}
	public WebElement getPlusbtn() {
		return plusbtn;
	}
	public void creatorgpage(String text) {
		plusbtn.click();
		orgname.sendKeys(text);
		savebtn.click();
	}
	
}
