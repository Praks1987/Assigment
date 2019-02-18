package com.mapsqn.assignment.webpage.Object;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import commapsnq.assignment.test.utility.BasePage;
import commapsnq.assignment.test.utility.Resuable;

public class DirectionModulePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//div/a[@class='header_logo sprite']")
	WebElement headerLogo;

	@FindBy(how = How.XPATH, using = "//div/div/div[@class='left_tab']/a[1]")
	WebElement directionTab;

	@FindBy(how = How.XPATH, using = "//tbody/tr/td[2]/input[@id='poi_from']")
	WebElement startingLocation;

	@FindBy(how = How.XPATH, using = "//tbody/tr/td[2]/input[@id='poi_to']")
	WebElement endLocation;

	@FindBy(how = How.XPATH, using = "//tbody/tr/td[3]/input[@type='button']")
	WebElement swapButton;

	@FindBy(how = How.XPATH, using = "//div/div/input[@id='get_direction']")
	WebElement getDirectionbutton;

	@FindBy(how = How.XPATH, using = "//div/div/a[@id='btnClear']")
	WebElement resetClearbutton;

	@FindBy(how = How.XPATH, using = "//tr/td[2]/input[@id='also_traffic']")
	WebElement trafficAwareCheckBox;

	@FindBy(how = How.XPATH, using = "//tr/td[2]/span[contains(text(),'Traffic aware')]")
	WebElement trafficAwaretext;

	@FindBy(how = How.XPATH, using = "	//tr/td[2]/input[@id='also_shortest']")
	WebElement shortestRouteCheckBox;

	@FindBy(how = How.XPATH, using = "//tr/td[2]/span[contains(text(),'Shortest')]")
	WebElement shortestRouteText;

	@FindBy(how = How.XPATH, using = "//tr/td[1]/input[@id='also_fastest']")
	WebElement fastestRouteCheckBox;

	@FindBy(how = How.XPATH, using = "//tr/td[1]/span[contains(text(), 'Fa')]")
	WebElement fastestRouteText;

	Resuable resuable = new Resuable();

	public void navigateToDirection(String toPlace, String fromPlace) throws InterruptedException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(directionTab);
			directionTab.click();
			resuable.focusOnAction(startingLocation);
			startingLocation.clear();
			startingLocation.sendKeys(toPlace);
			resuable.implicitWait(10);
			resuable.tabKeyBoardAction();
			resuable.focusOnAction(endLocation);
			endLocation.sendKeys(fromPlace);
			resuable.implicitWait(10);
			resuable.tabKeyBoardAction();
			Thread.sleep(2000);
			resuable.enterKeyBoardAction();

		}

	}

	public void navigateToClearRoute() {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(directionTab);
			directionTab.click();
			resuable.focusOnAction(resetClearbutton);
			resetClearbutton.click();

		}
	}

	public void swapOriginDestination(String toPlace, String fromPlace) throws InterruptedException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(directionTab);
			directionTab.click();
			resuable.focusOnAction(startingLocation);
			startingLocation.clear();
			startingLocation.sendKeys(toPlace);
			Thread.sleep(2000);
			resuable.tabKeyBoardAction();
			resuable.focusOnAction(endLocation);
			endLocation.sendKeys(fromPlace);
			Thread.sleep(2000);
			resuable.focusOnAction(swapButton);
			swapButton.click();
			resuable.tabKeyBoardAction();
			Thread.sleep(2000);
			resuable.enterKeyBoardAction();
		}
	}

	public void clickOnlyGetDirectionButton() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(directionTab);
			directionTab.click();
			Thread.sleep(2000);
			resuable.focusOnAction(getDirectionbutton);
			getDirectionbutton.click();
			resuable.alertHandleWindowBasedPopUp();

		}

	}

	public void clickOnlyToDirectionButton(String toPlaces) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(directionTab);
			directionTab.click();
			resuable.focusOnAction(startingLocation);
			startingLocation.clear();
			startingLocation.sendKeys(toPlaces);
			resuable.implicitWait(10);
			resuable.tabKeyBoardAction();
			resuable.implicitWait(10);
			resuable.enterKeyBoardAction();
			resuable.alertHandleWindowBasedPopUp();

		}
	}

	public void clickOnlyFromDirectionButton(String fromPlaces) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(directionTab);
			directionTab.click();
			resetClearbutton.click();
			resuable.focusOnAction(endLocation);
			endLocation.sendKeys(fromPlaces);
			Thread.sleep(2000);
			resuable.tabKeyBoardAction();
			Thread.sleep(2000);
			resuable.enterKeyBoardAction();
			resuable.alertHandleWindowBasedPopUp();
		}
	}

	public void clickFatestRouteCheckBox(String toPlaces, String fromPlaces) throws InterruptedException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(directionTab);
			directionTab.click();
			resuable.focusOnAction(startingLocation);
			startingLocation.clear();
			startingLocation.sendKeys(toPlaces);
			Thread.sleep(2000);
			resuable.tabKeyBoardAction();
			resuable.focusOnAction(endLocation);
			endLocation.sendKeys(fromPlaces);
			Thread.sleep(2000);
			resuable.tabKeyBoardAction();
			Thread.sleep(2000);
			resuable.focusOnAction(trafficAwareCheckBox);
			trafficAwareCheckBox.click();
			resuable.focusOnAction(fastestRouteCheckBox);
			fastestRouteCheckBox.click();
		}

	}

	public void clickShotestRouteCheckBox(String toPlaces, String fromPlaces) throws InterruptedException {
		// TODO Auto-generated method stub
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(directionTab);
			directionTab.click();
			resuable.focusOnAction(startingLocation);
			startingLocation.clear();
			startingLocation.sendKeys(toPlaces);
			Thread.sleep(2000);
			resuable.tabKeyBoardAction();
			resuable.focusOnAction(endLocation);
			endLocation.sendKeys(fromPlaces);
			Thread.sleep(2000);
			resuable.tabKeyBoardAction();
			Thread.sleep(2000);
			resuable.focusOnAction(trafficAwareCheckBox);
			trafficAwareCheckBox.click();
			resuable.focusOnAction(shortestRouteCheckBox);
			shortestRouteCheckBox.click();

		}
	}
}