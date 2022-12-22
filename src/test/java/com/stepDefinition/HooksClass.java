package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.baseClass.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * 
 * @author SatheesKumar Murugan
 * @Date 22/12/2022
 * @Description Hooks can be defined anywhere in the project or step definition layers using the methods @Before and @After
 *
 */
public class HooksClass extends BaseClass {


	/**
	 * @Description After every scenario it got execute
	 * @param s
	 */
	@After
	public void afterScenario(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, s.getName() + ".png");

		}
		closeAllWindows();
	}

}
