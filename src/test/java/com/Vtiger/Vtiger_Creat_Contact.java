package com.Vtiger;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.objectrepo.CreatContectpage;
import com.objectrepo.CreatnewContectPage;
import com.objectrepo.Homepage;

import genrics.BaseClass;

public class Vtiger_Creat_Contact extends BaseClass {
	@Test(groups="Smoke Test")
	public void Creatcontact() throws FileNotFoundException, IOException {
		Homepage hp=new Homepage(driver);
		hp.getContectbtn().click();
		
		CreatContectpage ccp=new CreatContectpage(driver);
		ccp.getCreatcontactbtn().click();
		
		CreatnewContectPage ccnp=new CreatnewContectPage(driver);
		ccnp.getFirstnamefild().sendKeys(prop.read("firstname"));
		ccnp.getLastnamefild().sendKeys(prop.read("lastname"));
		ccnp.getSavebtn().click();
	}
	

}
