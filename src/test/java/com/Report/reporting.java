package com.Report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * @Description Report generating class
 * @author Admin
 *
 */
public class reporting {

	/**
	 * @Description To generate the JVM report
	 * @param jsonFile
	 */
	public static void generateJVMReport(String jsonFile) {

		// 1, Mention the path of jvm report where to store
		File file = new File("C:\\Users\\user\\eclipse-workspace\\AutomationCoding\\target");

		// 2, Create the object for configuration
		Configuration configuration = new Configuration(file, "Amazon Automation");

		// 3, Mention the browser name, Version & OS details
		configuration.addClassifications("Broser Name", "Chrome");
		configuration.addClassifications("Broser Version", "108");
		configuration.addClassifications("OS", "WIN10");

		// 4, Create the object for reportBuilder --> Pass json file to fetch results
		// from json file to generates jvm report
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);

		// 5, Build the JVM Report
		builder.generateReports();

	}
}
