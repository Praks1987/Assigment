package com.mapsqn.assignment.webpage.Object;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import commapsnq.assignment.test.utility.BasePage;
import commapsnq.assignment.test.utility.Resuable;

public class SearchLandingPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//div/a[@class='header_logo sprite']")
	public WebElement headerLogo;

	@FindBy(how = How.XPATH, using = "//div/form/input[@id='txtGlobalSearch']")
	public WebElement searchBox;

	@FindBy(how = How.XPATH, using = "//div/form/span[@class='search_icon sprite']")
	public WebElement searchTextBox;

	@FindBy(how = How.XPATH, using = "//div/form/span[@class='search_icon sprite']")
	public WebElement searchIcon;

	@FindBy(how = How.XPATH, using = "//div/a[text()='Calendar']")
	public WebElement calenderLink;

	@FindBy(how = How.XPATH, using = "//div/a[text()='Legend']")
	public WebElement legendLink;

	@FindBy(how = How.XPATH, using = "//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']")
	public WebElement autocompeteSearchSuggestion;

	/*
	 * public WebElement searchBox2(){ WebElement element =
	 * driver.findElement(By.xpath("//div/form/input[@id='txtGlobalSearch']"));
	 * return element; }
	 */

	Resuable resuable = new Resuable();

	public void searchForPlaces(String places) {
		if (headerLogo.isDisplayed()) {
			resuable.focusOnAction(searchBox);
			searchBox.clear();
			resuable.implicitWait(10);
			searchBox.sendKeys(places);
			resuable.implicitWait(10);
			resuable.focusOnAction(searchIcon);
			searchIcon.click();

		}
	}

	public void searchForPlacesWithNoText(String places)  {
		if (headerLogo.isDisplayed()) {

			searchBox.sendKeys(places);
			resuable.implicitWait(10);
			resuable.focusOnAction(searchIcon);
			searchIcon.click();
			resuable.implicitWait(20);
			resuable.alertHandleWebBasedPopUpAccept();

		}
	}

	public void searchForAutoSuggestion(String places){
		if (headerLogo.isDisplayed()) {
			searchBox.clear();
			resuable.focusOnAction(searchBox);
			searchBox.sendKeys(places);
			resuable.implicitWait(10);
			resuable.focusOnAction(autocompeteSearchSuggestion);
			resuable.listFromDropDown(autocompeteSearchSuggestion);
			resuable.implicitWait(10);
				
			

		}
	}

}
