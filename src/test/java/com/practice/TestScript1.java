package com.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.objectrepo.Homepage;
import com.objectrepo.Loginpage;

import genrics.BaseClass;

public class TestScript1 extends BaseClass
{

	@Test
	public void Tsc1() throws FileNotFoundException, IOException {
		Loginpage lp=new Loginpage(driver);
		lp.getTextusername().sendKeys(prop.read("un"));
		lp.getTextpassword().sendKeys(prop.read("pwd"));
		lp.getLoginbtn().click();

		Homepage hp=new Homepage(driver);
        hp.getOppertunity().click();
//		CreatOperchunityPage op=new CreatOperchunityPage(driver);
//		op.getPlusbtn().click();
//
//		CreatnewOperchunityPage nop=new CreatnewOperchunityPage(driver);
//		nop.getOperchunitynamefild().sendKeys(prop.read("oppname"));
//
//		nop.getOrgsplusbtn().click();
//
//		WebDriver_Utility wdu=new WebDriver_Utility();
//		wdu.Switchtowindow(driver, "Accounts&action");
//		nop.searchbtn.sendKeys("Rahul");
//		nop.getGroupbtn().click();
//		nop.getGroupdroupdown().click();

	}
}