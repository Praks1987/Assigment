package com.mapsqn.assignment.webpage.Object;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {


	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td/input[@id='name']")
	WebElement email;
	
	@FindBy(how = How.XPATH, using = "//tbody/tr/td/input[@id='password']")
	WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//tbody/tr/td/div/input[@type='submit']")
	WebElement LoginButton;
	

	@FindBy(how = How.XPATH, using = "//tbody/tr/td/div/a")
	WebElement forGotPasswordLink;

	public void login(String Mob, String password) throws InterruptedException {
	
		email.sendKeys(Mob);
		Thread.sleep(1000);
		Password.sendKeys(password);
		Thread.sleep(1000);
		LoginButton.click();

	}
}
