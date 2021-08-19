package com.Vtiger;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.objectrepo.CreatnewOrgPage;
import com.objectrepo.Creatorgpage;
import com.objectrepo.Homepage;

import genrics.BaseClass;

public class Vtiger_Creat_Org extends BaseClass{
	@Test(groups="Regression Test")
	public void creatorg () throws FileNotFoundException, IOException {
		Homepage hp=new Homepage(driver);
		hp.getCreatorgbtn().click();
		
		Creatorgpage cog=new Creatorgpage(driver);
		cog.getPlusbtn().click();
		
		CreatnewOrgPage conp=new CreatnewOrgPage(driver);
		conp.getOrgname().sendKeys(prop.read("orgname"));
		conp.getSavebtn().click();
		
		
	}
	

}
