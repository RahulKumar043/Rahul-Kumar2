package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genrics.WebDriver_Utility;

public class Homepage {
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement oppertunity;
	
	public WebElement getOppertunity() {
		return oppertunity;
	}
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement creatorgbtn;
	
	
	public WebElement getCreatorgbtn() {
		return creatorgbtn;
	}
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
			private WebElement signoutlogo;
	
	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement signoutbtn;

	public WebElement getSignoutlogo() {
		return signoutlogo;
	}

	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
	public WebElement getContectbtn() {
		return contectbtn;
	}
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contectbtn;
	
	public void homepage() {
		signoutbtn.click();
		creatorgbtn.click();
		contectbtn.click();
		oppertunity.click();
	}
	public void gotosignout(WebDriver driver) {
		WebDriver_Utility wdu=new WebDriver_Utility();
		wdu.MoudeHover(driver, signoutlogo);
	}
			
}

