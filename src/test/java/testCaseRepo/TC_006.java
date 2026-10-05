package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_006 extends BaseClass{
	@Test
	
	public void CON_003() throws EncryptedDocumentException, IOException
	{

		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		 cp.clickOncreateNewContactIcon();
		 String lastName=eutil.getDataFromEXcel("Contacts", 7, 1);
			String title=eutil.getDataFromEXcel("Contacts", 7, 2);
			String email=eutil.getDataFromEXcel("Contacts", 7, 3);
			String mailingCity=eutil.getDataFromEXcel("Contacts", 7, 4);
			String mailingState=eutil.getDataFromEXcel("Contacts", 7, 5);
			String mailingCountry=eutil.getDataFromEXcel("Contacts", 7, 6);
			 CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
			 cncp.CreateNewContact(lastName, title, email, mailingCity, mailingState, mailingCountry);
	}
	
	@Test
	public void m1()
	{
		System.out.println("hello selenium");
	}
	

}
