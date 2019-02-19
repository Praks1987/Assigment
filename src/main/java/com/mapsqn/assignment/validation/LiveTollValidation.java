package com.mapsqn.assignment.validation;

import org.testng.Assert;

import com.mapsnq.assignment.business.LiveTestData;
import com.mapsqn.assignment.webpage.Object.LiveModulePage;

public class LiveTollValidation {

	public static void validateLiveTollPage() throws InterruptedException{
	       LiveModulePage liveModulePage = new LiveModulePage();
	    	Assert.assertEquals(liveModulePage.singaporeTollElemetText.getText(), LiveTestData.livetollPage);
	
	    }
	
	public static void validateListLiveToll() throws InterruptedException{
	       LiveModulePage liveModulePage = new LiveModulePage();
	    	Assert.assertEquals(liveModulePage.listOfSingaporeLiveTollText.getText(), liveModulePage.listOfSingaporeLiveTollText.getText());
	
	    }
}
