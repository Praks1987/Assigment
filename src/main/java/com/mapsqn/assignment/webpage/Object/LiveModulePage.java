package com.mapsqn.assignment.webpage.Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.mapsqn.assignment.validation.LiveIncidentValidation;

import commapsnq.assignment.test.utility.BasePage;
import commapsnq.assignment.test.utility.Resuable;

public class LiveModulePage extends BasePage  {
	
	@FindBy(how = How.XPATH, using = "//div/a[@class='header_logo sprite']")
	public WebElement headerLogo;

	@FindBy(how = How.XPATH, using = "//div/div/div[@class='left_tab']/a[3]")
	public WebElement liveTab;


	@FindBy(how = How.XPATH, using = "//div/div/label[1]/span/h2")
	public WebElement incidentTab;
	
	@FindBy(how = How.XPATH, using = "//div/div/div/h3[contains(text(),'Singapore Live Traffic News')]")
	public WebElement singaporeLiveTrafficText;
	
	@FindBy(how = How.XPATH, using = "//div/div/ul[@id='search_incident_singapore']")
	public WebElement listOfSingaporeLiveIncidentText ;
	
	@FindBy(how = How.XPATH, using = "//div/div/label[2]/span/h2")
	public WebElement cameraTab;
	
	@FindBy(how = How.XPATH, using = "//div/div/h3[contains(text(),'Singapore Live Traffic Cameras')]")
	public WebElement singaporeCameraElemetText ;
	
	@FindBy(how = How.XPATH, using = "//div[@id='singaporeCamWrapper']/div[2]/ul/li")
	public WebElement listOfSingaPoreLiveCamera ;
	
	@FindBy(how = How.XPATH, using = "//div/div/label[3]/span/h2")
	public WebElement tollTab;
	
	@FindBy(how = How.XPATH, using = "//div/div[@id='singaporeTolls']/div[1]")
	public WebElement singaporeTollElemetText;
	
	@FindBy(how = How.XPATH, using = "//div/div[2]/ul")
	public WebElement listOfSingaporeLiveTollText;
	
	Resuable resuable = new Resuable();
	
	public void navigateToLiveIncident() throws InterruptedException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(liveTab);
			resuable.implicitWait(10);
			liveTab.click();
			resuable.focusOnAction(incidentTab);
			resuable.implicitWait(10);

			incidentTab.click();
			//singaporeLiveTrafficText.getText();
		}
	}
	
	public void listOfLiveIncident() throws InterruptedException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(liveTab);
			liveTab.click();
			resuable.implicitWait(10);

			resuable.focusOnAction(incidentTab);
			incidentTab.click();
			resuable.implicitWait(10);

			String text = singaporeLiveTrafficText.getText();
            resuable.listFromDropDown(listOfSingaporeLiveIncidentText);
		}
	}
	
	public void navigateToLiveCameras() throws InterruptedException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(liveTab);
			liveTab.click();
			resuable.implicitWait(10);

			resuable.focusOnAction(cameraTab);
			cameraTab.click();
			resuable.implicitWait(10);

		   Reporter.log(singaporeCameraElemetText.getText());
		}
	}
	
	public void listOfLiveCameras() throws InterruptedException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(liveTab);
			liveTab.click();
			resuable.implicitWait(10);

			resuable.focusOnAction(cameraTab);
			cameraTab.click();
			resuable.implicitWait(10);

		   Reporter.log(listOfSingaPoreLiveCamera.getText());
			resuable.implicitWait(10);

		   resuable.listFromDropDown(listOfSingaPoreLiveCamera);
		}
    }
	
	public void navigateToLiveToll() throws InterruptedException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(liveTab);
			liveTab.click();
			resuable.implicitWait(10);

			resuable.focusOnAction(tollTab);
			tollTab.click();
			resuable.implicitWait(10);

		   Reporter.log(singaporeTollElemetText.getText());
		}
    }
	
	public void listToLiveToll() throws InterruptedException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(liveTab);
			liveTab.click();
			resuable.implicitWait(10);

			resuable.focusOnAction(tollTab);
			tollTab.click();
			resuable.implicitWait(10);

		   Reporter.log(singaporeTollElemetText.getText());
		   resuable.listFromDropDown(listOfSingaporeLiveTollText);

		   
		}
    }
}