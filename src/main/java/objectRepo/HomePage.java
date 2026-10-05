package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsMenu;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutOption;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	/**
	 * This is abusiness library to click on LeadsMenu
	 */
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	/**
	 * This is a business library to click on ContactsMenu
	 */
	public void clickOnContactsMenu()
	{
		getContactsMenu().click();
	}
	/**
	 * This is a business library to performLogout operation
	 * @param driver
	 */
	public void logoutOperation(WebDriver driver)
	{
	new SeleniumUtility().mouseHoveringAction(driver, getAccountsIcon());	
		getSignoutOption().click();
	}



}
