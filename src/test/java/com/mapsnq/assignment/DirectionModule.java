package com.mapsnq.assignment;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mapsqn.assignment.webpage.Object.DirectionModulePage;
import com.relevantcodes.extentreports.LogStatus;

import commapsnq.assignment.test.utility.WebBaseTest2;

public class DirectionModule extends WebBaseTest2 {

	@Test(description = " Test to check current and Destination is working")
	public void DirectionFromAndToPlace() throws MalformedURLException, InterruptedException {

        extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check current and Destination is working");
		DirectionModulePage directionModulePage = new DirectionModulePage();
		directionModulePage.navigateToDirection("NOVENA", "GEYLANG");
		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check current and Destination is working");
		Thread.sleep(2000);
		// Assert.assertTrue(false);

	}

	@Test(description = " Test to check Reset button")
	public void TestClearRouteLink() throws MalformedURLException, InterruptedException {

        extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check Reset button");
		DirectionModulePage directionModulePage = new DirectionModulePage();
		directionModulePage.navigateToClearRoute();
		Thread.sleep(2000);
		extentTest.log(LogStatus.INFO, 
				"Execution End :: Test to check Reset button");
	  Assert.assertTrue(false);

	}

   @Test(description = " Test to Swap button Origin and Destination")
	public void TestToCheckSwapOriginAndDestination() throws MalformedURLException, InterruptedException {

        extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to Swap button Origin and Destination");
		DirectionModulePage directionModulePage = new DirectionModulePage();
		directionModulePage.swapOriginDestination("NOVENA", "GEYLANG");
		Thread.sleep(2000);
		extentTest.log(LogStatus.INFO, 
				"Execution End :: Test to Swap button Origin and Destination");
		Assert.assertTrue(false);
	}
	
	
	@Test(description = " Test to Alert for window based popu if only Get Direction button is clicked")
	public void TestToClickOnlyDirectionButton() throws MalformedURLException, InterruptedException, AWTException {
        
		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to Alert for window based popu if only Get Direction button is clicked");
		DirectionModulePage directionModulePage = new DirectionModulePage();
        directionModulePage.clickOnlyGetDirectionButton();
        extentTest.log(LogStatus.INFO, 
				"Execution End :: Test to Alert for window based popu if only Get Direction button is clicked");
		 Assert.assertTrue(false);
	}
	

	@Test(description = " Test to Alert for window based pop if only 'to Direction' is given")
	public void TestToCheckOnlyByGivingToDirection() throws MalformedURLException, InterruptedException, AWTException {

        extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to Alert for window based pop if only 'to Direction' is given");
		DirectionModulePage directionModulePage = new DirectionModulePage();
        directionModulePage.clickOnlyToDirectionButton("NOVENA");
         extentTest.log(LogStatus.INFO, 
				"Execution End :: Test to Alert for window based pop if only 'to Direction' is given");
       
		 Assert.assertTrue(false);
	}
	
   @Test(description = " Test to Alert for window based pop if only 'From Direction' is given")
	public void TestToCheckOnlyByGivingFromDirection() throws MalformedURLException, InterruptedException, AWTException {

		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to Alert for window based pop if only 'From Direction' is given");
		DirectionModulePage directionModulePage = new DirectionModulePage();
        directionModulePage.clickOnlyFromDirectionButton("NOVENA");
        Assert.assertTrue(false);
		extentTest.log(LogStatus.INFO, 
					"Execution End :: Test to Alert for window based pop if only 'From Direction' is given");
	}
	
	@Test(description = " Test to check fastest route between source and destination")
	public void TestToFatestDirection() throws MalformedURLException, InterruptedException, AWTException {

		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check fastest route between source and destination");
		DirectionModulePage directionModulePage = new DirectionModulePage();
        directionModulePage.clickFatestRouteCheckBox("NOVENA","GEYLANG");
		extentTest.log(LogStatus.INFO, 
					"Execution End :: Test to check fastest route between source and destination");
	 Assert.assertTrue(false);
	}
 	
	@Test(description = " Test to check Shotest route between source and destination")
	public void TestToShotestDirection() throws MalformedURLException, InterruptedException, AWTException {

		extentTest.log(LogStatus.INFO, 
				"Execution Start :: Test to check Shotest route between source and destination");
		DirectionModulePage directionModulePage = new DirectionModulePage();
        directionModulePage.clickShotestRouteCheckBox("NOVENA","GEYLANG");
		extentTest.log(LogStatus.INFO, 
					"Execution End :: Test to Shotest route between source and destination");
		Assert.assertTrue(false);
	}
	
}
