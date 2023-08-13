package done.mm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import done.mm.qa.base.TestBase;
import done.mm.qa.pages.CreateNewPCPage;
import done.mm.qa.pages.LoginPages;

public class CreateNewPCTest extends TestBase {
	CreateNewPCPage po;
	LoginPages loginPages;

	public CreateNewPCTest() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initialization();
		loginPages = new LoginPages();
		po = new CreateNewPCPage();
		loginPages.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(invocationCount = 40)
	public void createNewPc() throws Exception {
		

		po.CreatePC();

	}

//	@AfterClass
//	public void tearDown() throws InterruptedException {
//		driver.quit();
//		Thread.sleep(2000);
//	}
}
