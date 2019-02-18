package com.mapsnq.assignment;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.mapsqn.assignment.webpage.Object.SearchLandingPage;

import commapsnq.assignment.test.utility.WebBaseTest2;

public class SearchModule extends WebBaseTest2 {
	WebDriver driver;

	@Test(description = "Search Test with Valid Location")
	public void SearchLocationWithValidData()throws MalformedURLException, InterruptedException {

		SearchLandingPage searchLandingPage = new SearchLandingPage();
		searchLandingPage.searchForPlaces("Test");

	}

	@Test(description = " Search Test with Empty Location")
	public void SearchLocationWithEmptyData() throws MalformedURLException, InterruptedException {
		SearchLandingPage searchLandingPage = new SearchLandingPage();
		searchLandingPage.searchForPlacesWithNoText(" ");

	}

	@Test(description = " Search Test with Invalid Location", enabled = false)
	public void SearchLocationWithInvalidData() throws MalformedURLException, InterruptedException {
		SearchLandingPage searchLandingPage = new SearchLandingPage();
		searchLandingPage.searchForPlaces(" Junk Data ");

	}

	@Test(description = " Auto Suggestion of Search")
	public void SearchLocationWithAutosuggestion() throws MalformedURLException, InterruptedException {
		SearchLandingPage searchLandingPage = new SearchLandingPage();
		searchLandingPage.searchForAutoSuggestion("Singapore");

	}

	@Test(description = " Minimum length for suggestion Type")
	public void SearchSuggestionWithMinimumLenght() throws InterruptedException {
		SearchLandingPage searchLandingPage = new SearchLandingPage();
		searchLandingPage.searchForPlaces(" ");
	}

}
