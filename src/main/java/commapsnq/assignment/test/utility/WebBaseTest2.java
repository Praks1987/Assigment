package commapsnq.assignment.test.utility;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.mapsqn.assignment.utils.ReportManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.mail.imap.Utility;

import io.appium.java_client.android.AndroidDriver;

public class WebBaseTest2 {

	public ExtentReports extent = ReportManager.getInstance();
	String url = EnvProperties.openUrl;
	public static WebDriver driver;
	public ExtentTest extentTest;
	/*
	 * // Node for Grid running in Remote Driver
	 * 
	 * // String Node = "http://10.106.217.171:4450/wd/hub";
	 * 
	 * // Node for Grid running in Remote Driver
	 */	
	String Node = EnvProperties.node;

	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browser) throws InterruptedException, MalformedURLException {

		extentTest = extent.startTest(this.getClass().getSimpleName());
		if (browser.equalsIgnoreCase("Chrome"))

		{
			DesiredCapabilities cap = DesiredCapabilities.chrome();
		    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
			
		   //driver = new RemoteWebDriver(new URL(Node), cap);
			driver = new ChromeDriver(cap);
			//driver = new ChromeDriver();
			Thread.sleep(5000);
			driver.get(url);
			Thread.sleep(5000);
			driver.manage().window().maximize();
			extentTest.log(LogStatus.INFO, "Chrome browser Launched successfully -");
			

		}

		
		else if (browser.equalsIgnoreCase("Firefox")) { 
		 DesiredCapabilities cap = DesiredCapabilities.firefox(); 
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\src\\test\\resources\\BrowserDrivers\\geckodriver.exe"); 

	     // driver = new RemoteWebDriver(new URL(Node), cap); 
		  Thread.sleep(5000); driver.get(url);
		  Thread.sleep(5000); 
		  driver = new FirefoxDriver(); 

		 driver.manage().window().maximize(); 
		 extentTest.log(LogStatus.INFO, "FireFox browser  Launched successfully - ");
		 }
		
		else if (browser.equalsIgnoreCase("HeadLessUnitTest"))

		{
		    DesiredCapabilities caps = new DesiredCapabilities().htmlUnit();
		    driver = new HtmlUnitDriver();
			Thread.sleep(5000);
			driver.get(url);
			System.out.println("end");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			extentTest.log(LogStatus.INFO, "Headeless browser Launched successfully -");
			
		}
	
	  /*	
		  else if (browser.equalsIgnoreCase("IE")) { DesiredCapabilities cap =
		  DesiredCapabilities.internetExplorer();
		 System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\src\\test\\resources\\BrowserDrivers\\IEDriverServer.exe"); 
		  driver = new RemoteWebDriver(new URL(Node), cap); Thread.sleep(5000); driver.get(url);
		 Thread.sleep(5000); 
		 driver.manage().window().maximize();
		 // driver =new InternetExplorerDriver();
		 extentTest.log(LogStatus.INFO, "IE browser  Launched successfully - "); 
		 }
		  
		else if (browser.equalsIgnoreCase("Android")) { 
			  DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		 capabilities.setCapability("automationName", "UiAutomator2");
		 capabilities.setCapability("deviceName", "ASUS_X00TD");
		 capabilities.setCapability("udid", "J9AAGF09Z941BD6");
		 capabilities.setCapability("platformVersion", "8.1.0");
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("appPackage", "h");
		 capabilities.setCapability("appActivity",""); 
		 driver = new AndroidDriver<WebElement>(new URL("0.0.0.0:4723/wd/hub"), capabilities); 
		 extentTest.log(LogStatus.INFO, "Andriod  Launched successfully - ");
		 }*/
		 
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = ScreenShot.getScreenshot(driver);
			extentTest.log(LogStatus.FAIL, result.getName());
			extentTest.log(LogStatus.FAIL, result.getThrowable());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenShotPath));

		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		}

		extent.flush();
		driver.quit();
	}

}
