package commapsnq.assignment.test.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Resuable extends WebBaseTest2 {

	public String generateEmailAddress() {
		String emailId = "grcUser-" + generateRandomNumber() + "@ril.com";
		Reporter.log("EmailId generated : " + emailId, true);
		return emailId;
	}

	public String generateMobileNumber() {
		String mobileNum = "3" + generateRandomNumber().substring(0, 9);
		Reporter.log("MobileNumber generated : " + mobileNum, true);
		return mobileNum;
	}

	public String generateRandomNumber() {
		Random rand = new Random();
		return String.valueOf(Math.abs(rand.nextLong()));

	}

	public Date getCurrentDate() {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		return date;
	}

	public String getFormatedDate(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat.format(date);
	}

	public void alertHandleWebBasedPopUpAccept() {

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void alertHandleWebBasedPopUpDismiss() {

		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	public void alertHandleWebBasedPopUpSendKey(String text) {

		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);

	}

	public void alertHandleWindowBasedPopUp() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}

	public void actionOnMouseHover(WebElement element) throws AWTException {
		Actions builder = new Actions(driver);
		builder.moveToElement(element).build().perform();
	}

	public void focusOnAction(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);

		// 'background: yellow'
	}

	public static void waitForElementToVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void implicitWait(int time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void downArrowKeyBoardAction() {

		Actions builder = new Actions(driver);
		builder.keyDown(Keys.ARROW_DOWN).click().build().perform();
	}

	public void tabKeyBoardAction() {

		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.TAB).build().perform();

	}

	public void enterKeyBoardAction() {

		Actions builder = new Actions(driver);
		/* builder.keyDown(Keys.TAB).build().perform(); */
		builder.sendKeys(Keys.ENTER).build().perform();

	}

	public void listFromDropDown(WebElement element, String text) {

		String[] Location = element.getText().split("\n ");
		List<String> ll = Arrays.asList(Location);
		for (String ListofLocation : ll) {
			if (ll.equals(text)) {
				System.out.println(ListofLocation + " found and performing action");
				element.click();
			}
		}

	}
	
	public void listFromDropDown(WebElement element) {

		String[] Location = element.getText().split("\n ");
		List<String> ll = Arrays.asList(Location);
		for (String ListofLocation : ll) {
				System.out.println(ListofLocation);
			}
		}

	}

