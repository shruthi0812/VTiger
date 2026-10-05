package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass
{
	@Test
	
	public void CON_002() throws EncryptedDocumentException, IOException
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		 cp.clickOncreateNewContactIcon();
		String lastName=eutil.getDataFromEXcel("Contacts", 4, 1);
		String department=eutil.getDataFromEXcel("Contacts", 4, 2);
		String email=eutil.getDataFromEXcel("Contacts", 4, 3);
		String mobile=eutil.getDataFromEXcel("Contacts", 4, 4);
		 CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		 cncp.CreateNewContact(lastName, department, email, mobile);

		
	}

}
