package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {
@FindBy(name="firstname")
private WebElement firstNameTextField;

@FindBy(name="lastname")
private WebElement lastNameTextField;

@FindBy(name="title")
private WebElement titleTextField;

@FindBy(name="department")
private WebElement departmentTextField;

@FindBy(name="email")
private WebElement emailTextField;

@FindBy(name="mobile")
private WebElement mobileTextField;

@FindBy(name="mailingcity")
private WebElement mailingCityTextField;

@FindBy(name="mailingstate")
private WebElement mailingStateTextField;

@FindBy(name="mailingcountry")
private WebElement mailingCountryTextField;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveButton;

public CreatingNewContactPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getFirstNameTextField() {
	return firstNameTextField;
}

public WebElement getLastNameTextField() {
	return lastNameTextField;
}

public WebElement getTitleTextField() {
	return titleTextField;
}

public WebElement getDepartmentTextField() {
	return departmentTextField;
}

public WebElement getEmailTextField() {
	return emailTextField;
}

public WebElement getMobileTextField() {
	return mobileTextField;
}

public WebElement getMailingCityTextField() {
	return mailingCityTextField;
}

public WebElement getMailingStateTextField() {
	return mailingStateTextField;
}

public WebElement getMailingCountryTextField() {
	return mailingCountryTextField;
}

public WebElement getSaveButton() {
	return saveButton;
}
public void CreateNewContact(String firstName,String lastName,String title) {
	getFirstNameTextField().sendKeys(firstName);
	getLastNameTextField().sendKeys(lastName);
	getTitleTextField().sendKeys(title);
	getSaveButton().click();
}
public void CreateNewContact(String lastName,String department,String email,String mobile) {
	getLastNameTextField().sendKeys(lastName);
	getDepartmentTextField().sendKeys(department);
	getEmailTextField().sendKeys(email);
	getMobileTextField().sendKeys(mobile);
	getSaveButton().click();
}
public void CreateNewContact(String lastName,String title,String email,String mailingCity,String mailingState, String mailingCountry) 
{
	getLastNameTextField().sendKeys(lastName);
	getTitleTextField().sendKeys(title);
	getEmailTextField().sendKeys(email);
	getMailingCityTextField().sendKeys(mailingCity);
	getMailingStateTextField().sendKeys(mailingState);
	getMailingCountryTextField().sendKeys(mailingCountry);
	getSaveButton().click();
	}
}
