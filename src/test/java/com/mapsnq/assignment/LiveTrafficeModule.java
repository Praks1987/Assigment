package com.mapsnq.assignment;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mapsqn.assignment.validation.LiveCamerasValidation;
import com.mapsqn.assignment.validation.LiveIncidentValidation;
import com.mapsqn.assignment.validation.LiveTollValidation;
import com.mapsqn.assignment.webpage.Object.LiveModulePage;
import com.relevantcodes.extentreports.LogStatus;

import commapsnq.assignment.test.utility.WebBaseTest2;

public class LiveTrafficeModule  extends WebBaseTest2{


	@Test(description = " Test to check Shotest route between source and destination")
	public void TestToUserNativgateToLiveIncidentPage() throws MalformedURLException, InterruptedException, AWTException {
		
		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check user Navigate to Live Incident ");
		LiveModulePage liveModulePage = new LiveModulePage();
		liveModulePage.navigateToLiveIncident();
		LiveIncidentValidation.validateLiveIncidentPage();
		extentTest.log(LogStatus.INFO, 
					"Execution End :: Test to check user Navigate to Live Incident");
	}
	
	@Test(description = " Test to check user can see list of Live Incident")
	public void TestToUserSeeListOfLiveIncidentPage() throws MalformedURLException, InterruptedException, AWTException {
		
		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check user can see list of Live Incident ");
		LiveModulePage liveModulePage = new LiveModulePage();
		liveModulePage.listOfLiveIncident();
		LiveIncidentValidation.validateListOfIncident();
		extentTest.log(LogStatus.INFO, 
					"Execution End :: Test to check user can see list of Live Incident ");
	}
	
	
	@Test(description = " Test to check user navigates to Live Camera Tab" , priority=1)
	public void TestToUserSeeLiveCamerasPage() throws MalformedURLException, InterruptedException, AWTException {
		
		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check user navigates to Live Camera Tab ");
		LiveModulePage liveModulePage = new LiveModulePage();
		liveModulePage.navigateToLiveCameras();
		LiveCamerasValidation.validateLiveCamerasPage();
		extentTest.log(LogStatus.INFO, 
					"Execution End :: Test to check user can see list of Live Incident ");
	}
	
	@Test(description = " Test to check user List of Live Camera " , priority=1)
	public void TestToCheckListOfLiveCamerasPage() throws MalformedURLException, InterruptedException, AWTException {
		
		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check user List of Live Camera ");
		LiveModulePage liveModulePage = new LiveModulePage();
		liveModulePage.listOfLiveCameras();
		LiveCamerasValidation.validateListLiveCameras();
		extentTest.log(LogStatus.INFO, 
					"Execution End :: Test to check user List of Live Camera");
	}
	
	
	@Test(description = " Test to check user navigate to Live Toll Page " , priority=1)
	public void TestToCheckUserNavigateToLiveTollPage() throws MalformedURLException, InterruptedException, AWTException {
		
		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check user List of Live Camera ");
		LiveModulePage liveModulePage = new LiveModulePage();
		liveModulePage.navigateToLiveToll();
		LiveTollValidation.validateLiveTollPage();
		extentTest.log(LogStatus.INFO, 
					"Execution End :: Test to check user List of Live Camera");
	}
	
	
	@Test(description = " Test to check user navigate to Live Toll Page " , priority=1)
	public void TestToCheckListOfLiveTollPage() throws MalformedURLException, InterruptedException, AWTException {
		
		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check user List of Live Camera ");
		LiveModulePage liveModulePage = new LiveModulePage();
		liveModulePage.listToLiveToll();
		LiveTollValidation.validateListLiveToll();
		extentTest.log(LogStatus.INFO, 
					"Execution End :: Test to check user List of Live Camera");
	}
}
