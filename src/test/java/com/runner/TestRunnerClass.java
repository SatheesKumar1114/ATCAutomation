package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.Report.reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



/**
 *
 * @Describtion It contains the path of the feature file and step definition file that we want to execute
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Amazon", dryRun = false, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"json:target\\Amazon.json" }, monochrome = true, features = "src\\test\\resources", glue = {
				"com.stepDefinition" })
public class TestRunnerClass {

	/**
	 * @author SatheesKumar Murugan
	 * @Date 22-12-2022
	 * @Description Maintains all Amazon WebSite informations
	 */
	@AfterClass
	public static void afterClass() {
		reporting.generateJVMReport(
				"C:\\Users\\user\\eclipse-workspace\\AutomationCoding\\target\\Amazon.json");
	}
	
} 