package com.mapsqn.assignment.utils;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportManager {

	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		
		if (extent == null) {

			try {
				extent = new ExtentReports(System.getProperty("user.dir") + "/Reports/Report.html", true);

				extent.loadConfig((new File(System.getProperty("user.dir") + "/src/test/java/ReportsConfig.xml")));

				extent.addSystemInfo("", "");

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return extent;
	}
}
