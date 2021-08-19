package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatnewContectPage {
	public CreatnewContectPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	@FindBy(name="firstname")
	private WebElement firstnamefild;
	
	public WebElement getFirstnamefild() {
		return firstnamefild;
	}
		@FindBy(name="lastname")
		private WebElement lastnamefild;

		public WebElement getLastnamefild() {
			return lastnamefild;
		}
		@FindBy(xpath="//input[@src='themes/images/clear_field.gif']")
		private WebElement plusbtn;

		public WebElement getPlusbtn() {
			return plusbtn;
		}
		public void Creratnewcontactpage(String firstname,String lastname) {
			firstnamefild.sendKeys(firstname);
			lastnamefild.sendKeys(lastname);
			plusbtn.click();
			savebtn.click();
		}
	
}
