package com.mapsqn.assignment.validation;

import org.testng.Assert;

import com.mapsnq.assignment.business.LiveTestData;
import com.mapsqn.assignment.webpage.Object.LiveModulePage;

public class LiveIncidentValidation {
	
	
	public static void validateLiveIncidentPage() throws InterruptedException{
	       LiveModulePage liveModulePage = new LiveModulePage();
	    	Assert.assertEquals(liveModulePage.singaporeLiveTrafficText.getText(), LiveTestData.liveincidentPage);
	
	    }
	
	public static void validateListOfIncident() throws InterruptedException{
	    LiveModulePage liveModulePage = new LiveModulePage();
	 	Assert.assertEquals(liveModulePage.listOfSingaporeLiveIncidentText.getText(), liveModulePage.listOfSingaporeLiveIncidentText.getText());
	 	
	 }



}
