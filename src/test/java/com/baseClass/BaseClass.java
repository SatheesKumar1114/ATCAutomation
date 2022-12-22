package com.baseClass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author SatheesKumar Murugan
 * @Date 22/12/2022
 * @Description To avoid code duplication and can reuse the code as much we want
 *
 */

public class BaseClass {

	public static WebDriver driver;

	/**
	 * @Description It using to get particular driver as our requirements
	 * @param browserType
	 */
	// 1,
	public static void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "Ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "safari":
			WebDriverManager.edgedriver().setup();
			driver = new SafariDriver();
			break;

		default:
			break;
		}
	}

	// 2,
	/**
	 * @Description To load our URL which we needs to go to the web site link
	 * @param url
	 */
	public static void loadUrl(String url) {
		driver.get(url);
	}

	// 3,
	/**
	 * @Description To maximize our window
	 */
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// 4,
	/**
	 * @Description To type the
	 * @param element
	 * @param data
	 */
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	// 5,
	/**
	 * @Description To click the button
	 * @param element
	 */
	public void click(WebElement element) {
		element.click();
	}

	// 6,
	/**
	 * @Description To find the element by ID
	 * @param attributeValue
	 * @return
	 */
	public WebElement FindElementById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	// 7,
	/**
	 * @Description To find the Element by Name
	 * @param attributeValue
	 * @return
	 */
	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	// 8,
	/**
	 * @Description To get the Title of URL
	 * @return
	 */
	public String getTitle() {
		String text = driver.getTitle();
		return text;
	}

	// 9,
	/**
	 * @Description To find the particular element by class name
	 * @param attributeValue
	 * @return
	 */
	public WebElement findElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}

	// 10,
	/**
	 * @Description To find the particular element by Xpath
	 * @param xpath
	 * @return
	 */
	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	// 11,
	/**
	 * @Description To get the current URL
	 * @return
	 */
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 12,
	/**
	 * @Description To get the Text of particular element
	 * @param element
	 * @return
	 */
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 13,
	/**
	 * @Description To close the current window
	 */
	public static void closeWindow() {
		driver.close();
	}

	// 14,
	/**
	 * @Description To close all windows
	 */
	public static void closeAllWindows() {
		driver.quit();
	}

	// 15.1, 99%---> Value
	/**
	 * @description To get the Attribute value of particular element
	 * @param element
	 * @return
	 */
	public String getAttributeValue(WebElement element) {
		String values = element.getAttribute("value");
		return values;
	}

	// 15.2, 1%----> Value
	/**
	 * @Description To get the Attribute value of particular element
	 * @param element
	 * @param value
	 * @return
	 */
	public String getAttributeValue(WebElement element, String value) {
		String text = element.getAttribute(value);
		return text;
	}

	// 16
	/**
	 * @Description To get the Attribute value of particular element
	 * @param element
	 * @return
	 */
	public String getAttributedDn(WebElement element) {
		String values = element.getAttribute("value");
		return values;
	}

	// 17,
	/**
	 * @Description To select the option by text
	 * @param element
	 * @param text
	 */
	public void SelectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 18,
	/**
	 * @Description To select the option by Attribute value
	 * @param element
	 * @param value
	 */
	public void selectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// 19,
	/**
	 * @Description Type the input by using Java Script
	 * @param element
	 * @param text
	 */
	public void typeJs(WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],setAttribute('value','" + text + "')", element);
	}

	// 20,
	/**
	 * @Description To load the URL by using navigate key
	 * @param url
	 */
	public void navigateUrl(String url) {
		driver.navigate().to(url);
	}

	// 21,
	/**
	 * @Description To go back to the previous page by using navigate key
	 */
	public void navigateBack() {
		driver.navigate().back();
	}

	// 22,
	/**
	 * @Description To go to the next page by using navigate key
	 */
	public void navigateForwrd() {
		driver.navigate().forward();
	}

	// 23,
	/**
	 * @Description To refresh the current page by using navigate key
	 */
	public void navigateRefresh() {
		driver.navigate().refresh();
	}

	// 24,
	/**
	 * @Description It used to hold the next step by given seconds
	 * @param num
	 * @throws InterruptedException
	 */
	public void Sleep(long num) throws InterruptedException {
		Thread.sleep(num);
	}
	
	public static void implicitlyWait(int num) {
		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);
	}

	// 25,
	/**
	 * @Description To select the option by giving the index
	 * @param element
	 * @param num
	 */
	public void selectByIndex(WebElement element, int num) {
		Select select = new Select(element);
		select.selectByIndex(num);
	}

	// 26,
	/**
	 * @Description To get the current Url
	 * @return
	 */
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 27,
	/**
	 * @Description By using this we swap the elements
	 * @param s
	 * @param d
	 */
	public void dragAndDrop(WebElement s, WebElement d) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
	}

	// 28,
	/**
	 * @Description it used to perform right click operation
	 * @param element
	 */
	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// 29,
	/**
	 * @Description it used to perform double click operation
	 * @param element
	 */
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	// 30,
	/**
	 * @Description To accept the Alert box
	 */
	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// 31,
	/**
	 * @Description To dismiss the alert box
	 */
	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	// 32,
	/**
	 * @Desccription By using this we can give input and do accept the alert box
	 * @param text
	 */
	public void promptAlertAccept(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
		alert.accept();
	}

	// 33,
	/**
	 * @Description By using this we can do the scroll down till the element we
	 *              found by using Java Script
	 * @param element
	 * @throws InterruptedException
	 */
	public void scrollDownJs(WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// 34,
	/**
	 * @Description By using this we can do the scroll up till the element we found
	 *              by using Java Script
	 * @param element
	 * @throws InterruptedException
	 */
	public void scrollUpJs(WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// 35,
	/**
	 * @Description To take the screenshot of page
	 * @param path
	 * @throws IOException
	 */
	public void screenShotPage(String path) throws IOException {
		TakesScreenshot SS = (TakesScreenshot) driver;
		File s = SS.getScreenshotAs(OutputType.FILE);
		File d = new File(path);
		FileUtils.copyFile(s, d);
	}

	// 36,
	/**
	 * @Description To take the screenshot of particular element
	 * @param element
	 * @param path
	 * @throws IOException
	 */
	public void screenShotElement(WebElement element, String path) throws IOException {
		File s = element.getScreenshotAs(OutputType.FILE);
		File d = new File(path);
		FileUtils.copyFile(s, d);
	}

	// 37,
	/**
	 * @Description To get the get options of the particular element
	 * @param element
	 * @return
	 */
	public List<WebElement> getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	// 38,
	/**
	 * @Description To select the option by value of particular element
	 * @param element
	 * @param value
	 */
	public void selectByValuedDn(WebElement element, String value) {
		// selectByValue("IND")-m
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// 39,
	/**
	 * @Description To select the option by value of particular element
	 * @param element
	 * @param value
	 */
	public void selectByValueTextdDn(WebElement element, String value) {
		// selectByValue("India")-m
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	// 40,
	/**
	 * @Description To get the All selected options in dropAndDown
	 * @param element
	 * @param value
	 */
	public void getAllSelectedOptionsdDn(WebElement element, String value) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);
			select.getAllSelectedOptions();
		}
	}

	// 41,
	/**
	 * @Description To unselect the option by index
	 * @param element
	 * @param value
	 * @param num
	 */
	public void deSelectByIndexdDn(WebElement element, String value, int num) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);

			select.deselectByIndex(num);
		}
	}

	// 42,
	/**
	 * @Description To unselect all the options by index
	 * @param element
	 */
	public void deSelectAlldDn(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);

			select.deselectAll();
		}
	}

	// 43,
	/**
	 * @Description used to verify whether the specified select element support
	 *              selecting multiple options at the same time
	 * @param element
	 */
	public void isMultipledDn(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);

			select.isMultiple();
		}
	}

	// 44,
	/**
	 * @Description To deselect the options by visible text
	 * @param element
	 * @param value
	 */
	public void deSelectByVisibleTextdDn(WebElement element, String value) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);

			select.deselectByVisibleText(value);
		}
	}

	// 45,
	/**
	 * @Description To Deselect the options by value
	 * @param element
	 * @param value
	 */
	public void deSelectByValuedDn(WebElement element, String value) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);

			select.deselectByValue(value);
		}
	}

	// 46,
	/**
	 * @Description To get the first selected options by index of particular
	 *              elemennt
	 * @param element
	 */
	public void getFirstSelectedOptiondDn(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(1);

			select.getAllSelectedOptions();
		}
	}

	// 47,
	/**
	 * @Description To get the frame by using name or Id
	 * @param nameOrId
	 */
	public void frameNameorId(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	// 48,
	/**
	 * @Description To get frame of Weblement
	 * @param WebElementFrameElement
	 */
	public void frameWebElementFrameElement(WebElement WebElementFrameElement) {
		driver.switchTo().frame(WebElementFrameElement);
	}

	// 49,
	/**
	 * @Description To get the frame by integer
	 * @param num
	 */
	public void frameInt(int num) {
		driver.switchTo().frame(num);
	}

	// 50,
	/**
	 * @Description The get the parent window
	 * @return
	 */
	public String getWindowHandle() {
		String prtWindow = driver.getWindowHandle();
		return prtWindow;
	}

	// 51,
	/**
	 * @Description To get the several parent windows
	 * @return
	 */
	public Set<String> getWindowHandles() {
		Set<String> allWindows = driver.getWindowHandles();
		return allWindows;
	}

}
