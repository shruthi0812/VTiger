package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage {
@FindBy(name="firstname")
private WebElement firstnameTextField;

@FindBy(name="lastname")
private WebElement lastnameTextField;

@FindBy(name="company")
private WebElement companyTextField;

@FindBy(name="designation")
private WebElement titleTextField;

@FindBy(name="leadsource")
private WebElement leadSourceTextField;

@FindBy(name="noofemployees")
private WebElement noOfEmpTextField;

@FindBy(name="mobile")
private WebElement mobileTextField;

@FindBy(name="email")
private WebElement emailTextField;

@FindBy(name="city")
private WebElement cityTextField;

@FindBy(name="state")
private WebElement stateTextField;


@FindBy(name="country")
private WebElement countryTextField;


@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveButton;

public CreatingNewLeadPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public WebElement getFirstnameTextField() {
	return firstnameTextField;
}


public WebElement getLastnameTextField() {
	return lastnameTextField;
}


public WebElement getCompanyTextField() {
	return companyTextField;
}


public WebElement getTitleTextField() {
	return titleTextField;
}


public WebElement getLeadSourceTextField() {
	return leadSourceTextField;
}


public WebElement getNoOfEmpTextField() {
	return noOfEmpTextField;
}


public WebElement getMobileTextField() {
	return mobileTextField;
}


public WebElement getEmailTextField() {
	return emailTextField;
}


public WebElement getCityTextField() {
	return cityTextField;
}


public WebElement getStateTextField() {
	return stateTextField;
}


public WebElement getCountryTextField() {
	return countryTextField;
}


public WebElement getSaveButton() {
	return saveButton;
}
/**
 * This is a business library to create new lead
 * @param firstName
 * @param lastName
 * @param company
 */
public void createNewLead(String firstName,String lastName,String company)
{
	getFirstnameTextField().sendKeys(firstName);
	getLastnameTextField().sendKeys(lastName);
	getCompanyTextField().sendKeys(company);
	getSaveButton().click();

}
/**
 * This is a business library to create new lead
 * @param lastName
 * @param company
 * @param title
 * @param leadSource
 * @param noOfEmp
 */
public void createNewLead(String lastName,String company,String title,String leadSource,String noOfEmp)

{
	getLastnameTextField().sendKeys(lastName);
	getCompanyTextField().sendKeys(company);
	getTitleTextField().sendKeys(title);
	getLeadSourceTextField().sendKeys(leadSource);
	getNoOfEmpTextField().sendKeys(noOfEmp);
	getSaveButton().click();


}
/**
 * This is a business library to create new lead
 * @param lastName
 * @param company
 * @param mobile
 * @param email
 * @param city
 * @param state
 * @param country
 */
public void createNewLead(String lastName,String company,String mobile,String email,String city,String state,String country)
{
	getLastnameTextField().sendKeys(lastName);
	getCompanyTextField().sendKeys(company);
	 getMobileTextField().sendKeys(mobile);
	 getEmailTextField().sendKeys(email);
	 getCityTextField().sendKeys(city);
	 getStateTextField().sendKeys(state);
	 getCountryTextField().sendKeys(country);
	 getSaveButton().click();
}

}
