package com.objectrepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genrics.WebDriver_Utility;

public class CreatnewOperchunityPage {
	public CreatnewOperchunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="potentialname")
	private WebElement operchunitynamefild;
	
	public WebElement getOperchunitynamefild() {
		return operchunitynamefild;
	}	
		@FindBy(name="assigntype")
			public WebElement assignedbtn;

		public WebElement getAssignedbtn() {
			return assignedbtn;
		}
		@FindBy(xpath="//select[@name='assigned_user_id']")
		private WebElement groupdroupdown;

		public WebElement getGroupdroupdown() {
			return groupdroupdown;
		}
		@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
		private WebElement orgsplusbtn;

		public WebElement getOrgsplusbtn() {
			return orgsplusbtn;
		}
		public WebElement getUserbtn() {
			return userbtn;
		}
		
		@FindBy(xpath="//input[@value='U']")
		private WebElement userbtn;
		
		public WebElement getGroupbtn() {
			return groupbtn;
		}
		@FindBy(xpath="//input[@value='T']")
		private WebElement groupbtn;
		

		@FindBy(name="CreatnewOperchunityPage.java")
		private WebElement salesstagebtn;

		public WebElement getSalesstagebtn() {
			return salesstagebtn;
		}
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement savebtn;

		public WebElement getSavebtn() {
			return savebtn;
		}	
			@FindBy(id="search_txt")
			private WebElement Childwinsearchtext;
			
		@FindBy(name="search")
		public WebElement searchbtn;
		
		public WebElement getChildwinsearchtext() {
			return Childwinsearchtext;
		}
		public WebElement getSearchbtn() {
			return searchbtn;
		}
		public void Creatnewoppertunity(WebDriver driver) {
		
			WebDriver_Utility wdu=new WebDriver_Utility();
			wdu.Dropdown(ele, text);
		}

		}	
		
		
		
		