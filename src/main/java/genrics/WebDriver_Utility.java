package genrics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	/**
	 * This method is used to handle DropDown
	 * @param ele
	 * @param text
	 */
	public void Dropdown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	/**
	 * This method is handle to MouseHover 
	 * @param driver
	 * @param ele
	 */
	public void MoudeHover(WebDriver driver,WebElement ele) {
		

		 
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	/**
	 * This method is handle DoubleClick
	 * @param driver
	 * @param ele
	 */
	public void DoubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	/**
	 * This method is handle to RightClick
	 * @param driver
	 * @param ele
	 */
	public void RightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.clickAndHold(ele).perform();
	}
	/**
	 * This method is handle to DragDroup
	 * @param driver
	 * @param sorc
	 * @param dest
	 
	public void Drag_Drop(WebDriver driver,WebElement sorc,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(sorc,dest).perform();
	}
	/**
	 * This method is handle to Switch the Frame
	 * @param driver
	 */
	public void FrameSwitch(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	/**
	 * This method is handle to go bact defaut Frme
	 * @param driver
	 */
	public void FrameSwitchBack(WebDriver driver ) {
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is handle to ScrollBar
	 * @param driver
	 */
	public void ScrollBar(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy(x,y)");
	}
	/**
	 * This method is handle to Alart_Poup
	 * @param driver
	 */
	public void Alart_poup(WebDriver driver ) {
		driver.switchTo().alert().accept();
	}
	public void Switchtowindow(WebDriver driver,String title)
	{
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> it = allwh.iterator();
		while(it.hasNext())
		{
			String window = it.next();
			String currenttitle = driver.switchTo().window(window).getTitle();
			if(currenttitle.contains(title))
			{
				break;
			}
		}
	}
}
