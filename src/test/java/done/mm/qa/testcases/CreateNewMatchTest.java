package done.mm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.CreateNewMatch;
import done.mm.qa.pages.CreateNewPCPage;

import done.mm.qa.pages.LaunchPCOffering;
import done.mm.qa.pages.UpdatePlayerCounter;
import done.mm.qa.pages.LoginPages;

public class CreateNewMatchTest extends TestBase {
	CreateNewMatch cnm;
	LoginPages loginPages;

	public CreateNewMatchTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		cnm = new CreateNewMatch();
	}

	@Test(invocationCount = 1)
	public void createNewMatchTest() throws Exception {
		
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));

	    cnm.CreateMatch();

	}

//	@AfterClass
//	public void tearDown() throws InterruptedException {
//		driver.quit();
//		Thread.sleep(2000);
//	}
}
