package practicepackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class POMParctice2 {
	public static void main(String[] args) throws IOException {
		
	
	WebDriver driver=new ChromeDriver();
	SeleniumUtility sutil=new SeleniumUtility();
	sutil.maximizeWindow(driver);
	sutil.implictwait(driver, 15);
	PropertiesUtility putil=new PropertiesUtility();
	String URL=putil.getDataFromProperties("url");
	sutil.accessApplication(driver,URL);
	String UN=putil.getDataFromProperties("username");
	WebElement usernameTF=driver.findElement(By.name("user_name"));
	usernameTF.sendKeys(UN);
	sutil.refershWepage(driver);
	usernameTF.sendKeys(UN);
	}
}
