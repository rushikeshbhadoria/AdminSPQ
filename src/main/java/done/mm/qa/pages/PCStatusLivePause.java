package done.mm.qa.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import done.mm.qa.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PCStatusLivePause extends TestBase {

	@FindBy(how = How.XPATH, using = "//button[text()='PCO Tracker']")
	WebElement PCOTracker;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Pause/Resume']")
	WebElement clickAction;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Action']")
	WebElement clickOnAction;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Sarfraj Khan']")
	WebElement PC;
	
	@FindBy(how = How.XPATH, using = "//*[@data-rowindex='0']//*[@data-testid='PauseCircleOutlineIcon']")
	WebElement clickOnPause;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Live']")
	WebElement live;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Paused']")
	WebElement pause;
	
	

	
	public PCStatusLivePause() {
		PageFactory.initElements(driver, this);

	}

	public void ChangeStaus() throws Exception {
		
               
		minimizeScreen(3);
        Thread.sleep(3000);
		 
		clickOn(driver, PCOTracker, 10);
		Thread.sleep(2000);
     
//		WebElement ele = driver.findElement(By.xpath("//div[text()='Sarfraj Khan']"));
		
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		
//		WebDriverManager.chromedriver().setup();
//        new Actions(driver).moveToElement(ele).perform();
	
//		je.executeScript("return arguments[0].scrollIntoView();", ele);        
//		je.executeScript("arguments[0].click();",StatusChange);
//		clickOn(driver, StatusChange, 10);
//		clickOn(driver, pause, 10);
		
//		Actions actions = new Actions(driver);
//		actions.contextClick(clickOnAction);
		
    	clickOn(driver, clickOnPause, 10);
    	
    	clickOn(driver, pause, 10);
		
		
    	readMessege("Player Token Offering Status Updated Successfully.");
	
	

	}

}