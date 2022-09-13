package Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest1 {

	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;

	@BeforeClass
	public static void cofiguration() throws MalformedURLException, InterruptedException {
		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\Dell\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		// service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("rushikeshp5");
		options.setChromedriverExecutable("C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		options.setApp("C:\\Users\\Dell\\eclipse2-workspace\\Framework\\src\\test\\java\\resource\\app-debug.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public static void longPressAction(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	public static Double getFormattedAmount(String amount) {
		Double price = Double.parseDouble(amount.substring(1));
		return price;

	}

	public static void scrollByName(String text) {
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));"));
	}

	public static void swipeAction(WebElement ele, String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(),

						"direction", direction, "percent", 0.75));

	}

	public static void AddToCartByProductName(String ProductName) {
		driver.findElement(By.xpath("//android.widget.TextView[@text='" + ProductName
				+ "']//parent::android.widget.LinearLayout//following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='ADD TO CART']"))
				.click();
	}
	public static void scrollToText(String text)
	{
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	}
	public static void sendKey(WebElement locator,String value) {
		new WebDriverWait(driver, Duration.ofSeconds(5)).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.sendKeys(value);

	}
	public static void clickOn( WebElement locator) {
		new WebDriverWait(driver, Duration.ofSeconds(5)).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();

	}
	
//	public static void Robo(String text) throws AWTException {
//	Robot robot = new Robot();
//	String key="KeyEvent.VK_"
//	robot.keyPress(KeyEvent.VK_R);
//	robot.keyRelease(KeyEvent.VK_R);
//	
//	}
//	
	
	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		// service.stop();
	}
	
}
