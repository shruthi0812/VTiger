package practicepackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
import objectRepo.LoginPage;

public class TC_001Practice {
@Test
public void demo() throws IOException
{
	WebDriver driver=new ChromeDriver();
	SeleniumUtility sutil=new SeleniumUtility();
	PropertiesUtility putil=new PropertiesUtility();
	ExcelUtility eutil=new ExcelUtility();
	sutil.maximizeWindow(driver);
	sutil.implictwait(driver, 15);
	String URL=putil.getDataFromProperties("url");
	sutil.accessApplication(driver,URL);
	
	String UN=putil.getDataFromProperties("username");
	String PWD=putil.getDataFromProperties("password");
	LoginPage lpage=new LoginPage(driver);
	lpage.loginToApplication(UN,PWD);
	HomePage homepage=new HomePage(driver);
	homepage.clickOnLeadsMenu();
	LeadsPage leadspage=new LeadsPage(driver);
	leadspage.clickOnCreateNewLeadIcon();
	String FN=eutil.getDataFromEXcel("Leads", 1, 1);
	String LN=eutil.getDataFromEXcel("Leads", 1, 2);
	String COMPANY=eutil.getDataFromEXcel("Leads", 1, 3);
	CreatingNewLeadPage cpage=new CreatingNewLeadPage(driver);
	cpage.createNewLead(FN,LN,COMPANY);
	



}

}
