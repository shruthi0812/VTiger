package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001 extends BaseClass{
@Test(groups = {"Smoke","Sanity"},retryAnalyzer=genericUtility.RetryAnalyzerImplementation.class)
public void LE_001() throws EncryptedDocumentException, IOException
{
	HomePage hp=new HomePage(driver);
	hp.clickOnLeadsMenu();
	LeadsPage lp=new LeadsPage(driver);
	lp.clickOnCreateNewLeadIcon();
	//Assert.fail();
	String firstName=eutil.getDataFromEXcel("Leads", 1, 1);
	String lastName=eutil.getDataFromEXcel("Leads", 1, 2);
	String company=eutil.getDataFromEXcel("Leads", 1, 3);
	CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
	cnlp.createNewLead(firstName, lastName, company);
	}


}
