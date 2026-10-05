package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
/**
 * This is the utility class whic has functionality from Selenium library
 * @author Admin
 * @version 26-09-09
 */
public class SeleniumUtility {
	/**
	 * This is a generic method to access a web application
	 * @param driver
	 * @param url
	 */
	public void accessApplication(WebDriver driver,String url)
	{
		driver.get(url);
		
	}
	/**
	 * This is a generic method to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
		
	}
	/**
	 * This is a generic method to refresh the webpage
	 * @param driver
	 */
	public void refershWepage(WebDriver driver)
	{
		driver.navigate().refresh();
		
	}
	/**
	 * This is a generic method to close the browser
	 * @param driver
	 */
	public void closeBrowser(WebDriver driver)
	{
		driver.quit();
		
	}
	/**
	 * This is a generic method to provide implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implictwait(WebDriver driver,int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
		
	}
	////////*******Handling DropDown********/////////////
	/**
	 * This is a generic method to select an option in dropdown using value attribute
	 * @param dropdownELe
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropdownELe,String value)
	{
		Select sel = new Select(dropdownELe);
		sel.selectByValue(value);
		
	}
	/**
	 * This is a generic method to select an option in dropdown using index
	 * @param dropdownELe
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownELe, int index)
	{
		Select sel = new Select(dropdownELe);
		sel.selectByIndex(index);
		
	}
	/**
	 * This is a generic method to select an option in dropdown using value visibe text
	 * @param dropdownELe
	 * @param visibleText
	 */
	public void selectOptionByVisibleText(WebElement dropdownELe,String visibleText)
	{
		Select sel = new Select(dropdownELe);
		sel.selectByVisibleText(visibleText);
		
	}
//////////*****Handling Mouse Actions*****///////
/**
 * This is a generic method to perform mouse hovering action
 * @param driver
 * @param element
 */
public void mouseHoveringAction(WebDriver driver,WebElement element)
{
	new Actions(driver).moveToElement(element).perform();

}
/**
 * This is a generic method to perform right click action
 * @param driver
 * @param element
 */
public void rightClickAction(WebDriver driver,WebElement element)
{
	new Actions(driver).contextClick(element).perform();

}
/**
 * This is a generic method to perform drag and drop action
 * @param driver
 * @param draggableEle
 * @param dropELe
 */
public void dragAndDropAction(WebDriver driver,WebElement draggableEle,WebElement dropELe)
{
	new Actions(driver).dragAndDrop(draggableEle,dropELe).perform();

}
//////////*******Handling Alert popup*******////////////
/**
 * This is a generic method to accept alert popup
 * @param driver
 */
public void acceptAlert(WebDriver driver)
{
	driver.switchTo().alert().accept();
	}
/**
 * This is a generic method to cancel alert popup
 * @param driver
 */
public void cancelAlert(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
	}
/////******Handling Frames********/////////
/**
 * This is a generic method to switch to frame using frame index
 * @param driver
 * @param index
 */
public void switchToFrameUsingIndex(WebDriver driver,int index)
{
	driver.switchTo().frame(index);
}
/**
 * This is a generic method to switch to a frame using frame webelement
 * @param driver
 * @param frameEle
 */
public void switchToFrameUsingFrameElement(WebDriver driver,WebElement frameEle)
{
	driver.switchTo().frame(frameEle);
}
////////******Take webpage screenshot*******///////
/**
 * This is a generic method to capture webpage screenshot
 * @param driver
 * @param fileName
 * @return
 * @throws IOException
 */
public String takeWebpageScreenshot(WebDriver driver,String fileName) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(".\\ScreenShots\\"+fileName+".png");
	Files.copy(src, dest);
	return dest.getAbsolutePath();
}



}
