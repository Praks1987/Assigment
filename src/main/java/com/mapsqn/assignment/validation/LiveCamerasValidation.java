package com.mapsqn.assignment.validation;

import org.testng.Assert;

import com.mapsqn.assignment.webpage.Object.LiveModulePage;

public class LiveCamerasValidation {

	
	public static void validateLiveCamerasPage(String expectedResult) throws InterruptedException{
	    LiveModulePage liveModulePage = new LiveModulePage();
	 	Assert.assertEquals(liveModulePage.singaporeLiveTrafficText.getText(), expectedResult);
	 	
	 }
	
	public static void validateListLiveCameras() throws InterruptedException{
	    LiveModulePage liveModulePage = new LiveModulePage();
	 	Assert.assertEquals(liveModulePage.listOfSingaPoreLiveCamera.getText(), liveModulePage.listOfSingaPoreLiveCamera.getText());
	 	
	 }

}
