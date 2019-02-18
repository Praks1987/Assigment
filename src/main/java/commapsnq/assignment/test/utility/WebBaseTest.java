package commapsnq.assignment.test.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.ChromeDriverManager;


public class WebBaseTest {

	String url = EnvProperties.openUrl;
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		ChromeDriverManager.getInstance().setup();
		System.setProperty("webdriver.chrome.driver ", "src/test/resources/chromedriver.exe");
		driver= new ChromeDriver();
		//driver = new FirefoxDriver();
	
		driver.get (url);
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
