package commapsnq.assignment.test.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class BasePage  extends WebBaseTest2{
	
	WebDriver webDriver = driver;
	
	public BasePage() 
	{
		PageFactory.initElements(webDriver, this);
	}
	
}
