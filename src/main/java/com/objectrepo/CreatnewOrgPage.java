package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatnewOrgPage {
	public CreatnewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgnameTxt;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getOrgname() {
	return orgnameTxt;
}
	public void Creatneworgpage(String orgnname) {
		orgnameTxt.sendKeys(orgnname);
		savebtn.click();
	}
}