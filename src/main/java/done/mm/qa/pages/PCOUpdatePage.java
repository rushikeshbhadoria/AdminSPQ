package done.mm.qa.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import done.mm.qa.base.TestBase;

public class PCOUpdatePage extends TestBase {

	@FindBy(how = How.XPATH, using = "//button[text()='PCO Tracker']")
	WebElement PCOTracker;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Pause/Resume']")
	WebElement clickAction;
	
	@FindBy(how = How.XPATH, using = "//*[@data-rowindex='0']//*[@data-testid='EditIcon']")
	WebElement update;
	
	@FindBy(how = How.XPATH, using = "//input[@name='offeredCounters']")
	WebElement offcounters;
	
	@FindBy(how = How.XPATH, using = "//input[@name='offerPrice']")
	WebElement offerprice;
	
	@FindBy(how = How.XPATH, using = "//input[@name='buyMaxQuantityPerUser']")
	WebElement maxbuy;
	
	@FindBy(how = How.XPATH, using = "//input[@name='buyMinQuantityPerUser']")
	WebElement minbuy;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Update PC Offering']")
	WebElement updatepcbutton;
	
	public PCOUpdatePage() {
		PageFactory.initElements(driver, this);

	}

	public void UpdatePCO() throws Exception {
		      
        Thread.sleep(10000);
		clickOn(driver, PCOTracker, 10);
		Thread.sleep(10000);
		minimizeScreen(3);
		clickOn(driver, clickAction, 10);
		Thread.sleep(5000);
		
		clickOn(driver, clickAction, 10);
		Thread.sleep(2000);
		
		clickOn(driver, update, 10);
		Thread.sleep(2000);
		
		
		clearMethod(offcounters);
		sendKey(driver, offcounters, "4000", 5);
		
		clearMethod(offerprice);
		sendKey(driver, offerprice, "15", 5);
		
		
		clearMethod(maxbuy);
		sendKey(driver, maxbuy, "50", 5);
		
		clearMethod(minbuy);
		sendKey(driver, minbuy, "1", 5);
		

		Thread.sleep(2000);
		clickOn(driver, updatepcbutton, 10);
		readMessege("Player Token Offering Updated Successfully.");
		

	}

}