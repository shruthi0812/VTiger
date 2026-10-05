package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass{
	public WebDriver driver;
	public static WebDriver sDriver;
	public SeleniumUtility sutil=new SeleniumUtility();
	public PropertiesUtility putil=new PropertiesUtility();
	public ExcelUtility eutil=new ExcelUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void bsConfig() {
		System.out.println("DB connection created");
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void bcConfig(@Optional("chrome")String Browser) throws IOException
	{
		String browser=System.getProperty("browser");
		if(browser!=null)
		{
			Browser=browser;
		}
		if(Browser.equals("chrome"))
		driver=new ChromeDriver();
		else if(Browser.equals("edge"))
			driver=new EdgeDriver();
		else if(Browser.equals("firefox"))
			driver=new FirefoxDriver();
		else if(Browser.equals("safari"))
			driver=new SafariDriver();
		else
			driver=new ChromeDriver();
		sutil.maximizeWindow(driver);
		sDriver=driver;
		sutil.implictwait(driver,15);
		String URL=putil.getDataFromProperties("url");
		sutil.accessApplication(driver, URL);
		System.out.println("Browser launched successfully");
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void bmConfig() throws IOException {
		String UN=putil.getDataFromProperties("username");
		String PWD=putil.getDataFromProperties("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		System.out.println("Login done successfully");

		}
	@AfterMethod(alwaysRun = true)
	public void amConfig()
	{
		HomePage hp=new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("Logout done successfully");
		
	}
	@AfterClass(alwaysRun = true)
	public void acConfig() 
	{
		sutil.closeBrowser(driver);
		System.out.println("Browser closed successfully");
		
	}
	@AfterSuite(alwaysRun = true)
	public void asConfig()
	{
		System.out.println("DB connection closed");
	}
	
	

}
