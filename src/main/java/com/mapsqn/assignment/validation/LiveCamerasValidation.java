package com.mapsqn.assignment.validation;

import org.testng.Assert;

import com.mapsnq.assignment.business.LiveTestData;
import com.mapsqn.assignment.webpage.Object.LiveModulePage;

public class LiveCamerasValidation {

	
	public static void validateLiveCamerasPage() throws InterruptedException{
	    LiveModulePage liveModulePage = new LiveModulePage();
	 	Assert.assertEquals(liveModulePage.singaporeLiveTrafficText.getText(), LiveTestData.liveCameraPage );
	 	
	 }
	
	public static void validateListLiveCameras() throws InterruptedException{
	    LiveModulePage liveModulePage = new LiveModulePage();
	 	Assert.assertEquals(liveModulePage.listOfSingaPoreLiveCamera.getText(), liveModulePage.listOfSingaPoreLiveCamera.getText());
	 	
	 }

}
