package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(name="user_name")
private WebElement textusername;

@FindBy(name="user_password")
private WebElement textpassword;

@FindBy(id="submitButton")
private WebElement loginbtn;

public WebElement getTextusername() {
	return textusername;
}

public WebElement getTextpassword() {
	return textpassword;
}

public WebElement getLoginbtn() {
	return loginbtn;
}
public void login(String username,String password) {
	
	textusername.sendKeys(username);
	textpassword.sendKeys(password);
	loginbtn.click();
	
}
}
