package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is a login Webpage POM class
 * @author Admin
 * @version 26-09-11
 */
public class LoginPage {
	
	// 1.Declaring the WebElements
	
  @FindBy(name="user_name")
  private WebElement usernameTextField;
  @FindBy(xpath="//input[@type='password']")
  private WebElement passwordTextField;
   @FindBy(id="submitButton")
  private WebElement loginButton;
     
   
   //2.Initializing the webelements
   public LoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
	   
   }
   //getter methods
   public WebElement getUsernameTextField()
   {
	   return usernameTextField;
   }
   public WebElement getPaawordTextField()
   {
	   return passwordTextField;
   }
   public WebElement getLoginButton()
   {
	   return loginButton;
   }
   
   //3.Utilizing the webelements
   /**
    * This is a business library to perform login to application
    * @param UN
    * @param PWD
    */
   
   public void loginToApplication(String UN,String PWD)
   {
	   getUsernameTextField().sendKeys(UN);
	   getPaawordTextField().sendKeys(PWD);
	   getLoginButton().click();
   }
   
   
   
   
   
}
