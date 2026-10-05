package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002 extends BaseClass{
	@Test(groups={"Smoke"})
	
	public void LE_002() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp=new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lastName=eutil.getDataFromEXcel("Leads", 4, 1);
		String company=eutil.getDataFromEXcel("Leads", 4, 2);
		String title=eutil.getDataFromEXcel("Leads", 4, 3);
		String leadsSource=eutil.getDataFromEXcel("Leads", 4, 4);
		String noOfEmp=eutil.getDataFromEXcel("Leads", 4, 5);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lastName, company, title, leadsSource, noOfEmp);
	}

}
