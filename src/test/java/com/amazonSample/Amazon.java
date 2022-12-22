package com.amazonSample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.asn1.cmc.GetCert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

import com.baseClass.BaseClass;
import com.config.Configuration;

public class Amazon extends BaseClass {

	public static void main(String[] args) {

		// 1,LogIn Amazon Page
		getDriver(Configuration.BROWSERTYPE);
		loadUrl(Configuration.URL);
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		maximize();

		// 2,Click on the hamburger menu in the top left corner.
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		// 3, Scroll down and then Click on the TV, Appliances and Electronics link
		// under Shop by Department section.
		WebElement scrollDwn = driver.findElement(By.xpath("//div[contains(text(),'shop by category')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollDwn);
		driver.findElement(By.xpath("//a[@data-menu-id=\"9\"]")).click();

		// 4, Then click on Televisions under the Tv, Audio & Cameras sub section.
		driver.findElement(By.xpath("//a[contains(text(),'Televisions')]")).click();

		// 5, Scroll down and filter the results by Brand ‘Samsung’.
		WebElement scrlDnwBrands = driver.findElement(By.xpath("//span[text()='Brands']"));
		js.executeScript("arguments[0].scrollIntoView();", scrlDnwBrands);
		driver.findElement(By.xpath("//span[text()='Samsung']")).click();

		// 6, Sort the Samsung results with price High to Low
		driver.findElement(By.xpath("//span[@id=\"a-autoid-0-announce\"][1]")).click();
		driver.findElement(By.xpath("//a[@id=\"s-result-sort-select_2\"]")).click();

		// 7,Click on the second highest priced item (whatever that maybe at the time of
		// automating).
		driver.findElement(By.xpath(
				"//div[@class=\"s-card-container s-overflow-hidden aok-relative puis-expand-height puis-include-content-margin puis s-latency-cf-section s-card-border\"]/parent::div[@class=\"s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2\"]"))
				.click();

		// 8, Switch the Window
		Set<String> windowHandles = driver.getWindowHandles();
		for (String window : windowHandles) {
			driver.switchTo().window(window);
			js.executeScript("window.scrollBy(0,400)");
		}

		// 9, Assert that “About this item” section is present and log this section text
		// to console/report
		WebElement status = driver.findElement(By.xpath("//h1[text()=' About this item ']"));
		String text = status.getText();
		
		Assert.assertEquals(text, "About this item");

		driver.quit();
	}
}