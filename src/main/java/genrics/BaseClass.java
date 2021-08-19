package genrics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.objectrepo.Homepage;
import com.objectrepo.Loginpage;

public class BaseClass {
	
	public WebDriver driver;
	public WebDriver_Utility wdu=new WebDriver_Utility();
	public ReaddatausingPropfile prop=new ReaddatausingPropfile();
	
	
	@BeforeSuite(groups= {"Smoke Test","Regression Test"})
	public void setup_JDBC_Report() {
		System.out.println("setup of jdbc and report is done");
	}
	@AfterSuite(groups= {"Smoke Test","Regression Test"})
	public void setup_JDBC_Close() {
		System.out.println("setup of jdbc and report is closed");
	}
	@BeforeClass(groups= {"Smoke Test","Regression Test"})
	public void launch_Browser() throws FileNotFoundException, IOException {
		if(prop.read("Browser").equalsIgnoreCase("Chrome")) 
		{
			driver= new ChromeDriver();
			System.out.println(" Chrome Browser is launched");
		}
		else {
			driver= new FirefoxDriver();
			System.out.println("Firefoxdriver is launched");
		}
		driver.manage().window().maximize();
		driver.get(prop.read("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterClass(groups= {"Smoke Test","Regression Test"})
	public void Close_Browser()	{
		driver.close();
	System.out.println("Browser is closed");
	}
	@BeforeMethod(groups= {"Smoke Test","Regression Test"})
	public void loginVtiger() throws FileNotFoundException, IOException {
		Loginpage lp=new Loginpage(driver);
		lp.login(prop.read("un"), prop.read("pwd"));
		
	}
	@AfterMethod(groups= {"Smoke Test","Regression Test"})
	public void logoutVtiger() {
		Homepage hp=new Homepage(driver);
		hp.getSignoutlogo();
		hp.getSignoutbtn();
	}
	
}
