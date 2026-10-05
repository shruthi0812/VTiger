package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass{
	@Test
	public void LE_003() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp=new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lastName=eutil.getDataFromEXcel("Leads", 7, 1);
		String company=eutil.getDataFromEXcel("Leads", 7, 2);
		String mobile=eutil.getDataFromEXcel("Leads", 7, 3);
		String email=eutil.getDataFromEXcel("Leads", 7, 4);
		String city=eutil.getDataFromEXcel("Leads", 7, 5);
		String state=eutil.getDataFromEXcel("Leads", 7, 6);
		String country=eutil.getDataFromEXcel("Leads", 7, 7);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lastName, company, mobile, email, city, state, country);
		
	}
	

}
