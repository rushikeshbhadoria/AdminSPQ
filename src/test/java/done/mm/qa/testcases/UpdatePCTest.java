package done.mm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.CreateNewPCPage;
import done.mm.qa.pages.LaunchPCOffering;
import done.mm.qa.pages.UpdatePlayerCounter;
import done.mm.qa.pages.LoginPages;

public class UpdatePCTest extends TestBase {
	UpdatePlayerCounter pco;
	LoginPages loginPages;
	CreateNewPCPage po;

	public UpdatePCTest() {
		super();
	}

//	@BeforeMethod
//	public void setup() throws InterruptedException {
//		initialization();
//		loginPages = new LoginPages();
//		pco = new UpdatePlayerCounter();
//	}

	@Test(invocationCount = 4)
	public void UpdateTest() throws Exception {
//		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
//
//		pco.Update();
		


		po.CreatePC();

	}

//	@AfterClass
//	public void tearDown() throws InterruptedException {
//		driver.quit();
//		Thread.sleep(2000);
//	}
}
