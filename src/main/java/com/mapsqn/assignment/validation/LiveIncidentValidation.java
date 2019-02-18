package com.mapsqn.assignment.validation;

import org.testng.Assert;

import com.mapsqn.assignment.webpage.Object.LiveModulePage;

public class LiveIncidentValidation {
	
	
	public static void validateLiveIncidentPage(String expectedResult) throws InterruptedException{
	       LiveModulePage liveModulePage = new LiveModulePage();
	    	Assert.assertEquals(liveModulePage.singaporeLiveTrafficText.getText(), "Singapore Live Traffic News");
	
	    }
	
	public static void validateListOfIncident() throws InterruptedException{
	    LiveModulePage liveModulePage = new LiveModulePage();
	 	Assert.assertEquals(liveModulePage.listOfSingaporeLiveIncidentText.getText(), liveModulePage.listOfSingaporeLiveIncidentText.getText());
	 	
	 }



}
