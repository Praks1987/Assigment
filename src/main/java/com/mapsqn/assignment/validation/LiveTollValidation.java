package com.mapsqn.assignment.validation;

import org.testng.Assert;

import com.mapsqn.assignment.webpage.Object.LiveModulePage;

public class LiveTollValidation {

	public static void validateLiveTollPage(String expectedResult) throws InterruptedException{
	       LiveModulePage liveModulePage = new LiveModulePage();
	    	Assert.assertEquals(liveModulePage.singaporeTollElemetText.getText(), "Singapore");
	
	    }
	
	public static void validateListLiveToll() throws InterruptedException{
	       LiveModulePage liveModulePage = new LiveModulePage();
	    	Assert.assertEquals(liveModulePage.listOfSingaporeLiveTollText.getText(), liveModulePage.listOfSingaporeLiveTollText.getText());
	
	    }
}
