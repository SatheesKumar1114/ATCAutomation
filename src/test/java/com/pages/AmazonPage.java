package com.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.config.Configuration;

/**
 * 
 * @author SatheesKumar Murugan
 * @Date 22/12/2022
 * @Description To create the business logic methods
 *
 */

public class AmazonPage extends BaseClass {

	/**
	 * @Description its initialize page elements without using the FindElement (or
	 *              FindElements)
	 * {@code: PageFactory.initElements(driver, this);}
	 */
	
	
	@FindBy(id = "nav-hamburger-menu")
	private WebElement menu;

	@FindBy(xpath = "//div[contains(text(),'shop by category')]")
	private WebElement scrollDwn;

	@FindBy(xpath = "//a[@data-menu-id='9']")
	private WebElement clickTV;

	@FindBy(xpath = "//a[contains(text(),'Televisions')]")
	private WebElement clickTelevison;

	@FindBy(xpath = "//span[text()='Brands']")
	private WebElement scrlDnwBrands;

	@FindBy(xpath = "//span[text()='Samsung']")
	private WebElement clickSamsung;

	@FindBy(xpath = "//span[@id='a-autoid-0-announce'][1]")
	private WebElement clickFilter;

	@FindBy(xpath = "//a[@id='s-result-sort-select_2']")
	private WebElement clickHighToLow;

	@FindBy(xpath = "//div[@class='s-card-container s-overflow-hidden aok-relative puis-expand-height puis-include-content-margin puis s-latency-cf-section s-card-border']/parent::div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']")
	private WebElement clickSecondHigh;

	@FindBy(xpath = "//h1[text()=' About this item ']")
	private WebElement verifyMsg;
	

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getScrollDwn() {
		return scrollDwn;
	}

	public WebElement getClickTV() {
		return clickTV;
	}

	public WebElement getClickTelevison() {
		return clickTelevison;
	}

	public WebElement getScrlDnwBrands() {
		return scrlDnwBrands;
	}

	public WebElement getClickSamsung() {
		return clickSamsung;
	}

	public WebElement getClickFilter() {
		return clickFilter;
	}

	public WebElement getClickHighToLow() {
		return clickHighToLow;
	}

	public WebElement getClickSecondHigh() {
		return clickSecondHigh;
	}

	public WebElement getVerifyMsg() {
		return verifyMsg;
	}


	public void amazonpage() {

		// 1, Launching & Amazon Main Page
		getDriver(Configuration.BROWSERTYPE);
		loadUrl(Configuration.URL);
		maximize();
		}

	public void menu() {
		PageFactory.initElements(driver, this);

		// 2,Click on the hamburger menu in the top left corner.
		click(menu);
	}

	public void clickTv() {
		PageFactory.initElements(driver, this);
		
		// 3, Scroll down and then Click on the TV, Appliances and Electronics link
		// under Shop by Department section.
		implicitlyWait(10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", getScrollDwn());
		click(getClickTV());
	}

	public void clickTelevision() {
		PageFactory.initElements(driver, this);
		
		// 4, Then click on Televisions under the Tv, Audio & Cameras sub section.
		click(getClickTelevison());
	}

	public void clickSamsung() {
		PageFactory.initElements(driver, this);
		
		// 5, Scroll down and filter the results by Brand ‘Samsung’.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", getScrlDnwBrands());
		click(getClickSamsung());
	}

	public void clickHightoLow() {
		PageFactory.initElements(driver, this);
		
		// 6, Sort the Samsung results with price High to Low
		click(getClickFilter());
		click(getClickHighToLow());
	}

	public void clickSecondHighPrice() {
		PageFactory.initElements(driver, this);
		
		// 7,Click on the second highest priced item (whatever that maybe at the time of
		// automating).
		click(getClickSecondHigh());
	}

	public void switchToWindow() {
		PageFactory.initElements(driver, this);
		
		// 8, Switch the Window
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Set<String> windowHandles = driver.getWindowHandles();
		for (String window : windowHandles) {
			driver.switchTo().window(window);
			js.executeScript("window.scrollBy(0,400)");
		}
	}

	public String assertVerify() {
		PageFactory.initElements(driver, this);
		
		// 9, Assert that “About this item” section is present and log this section text
		// to console/report
		String text = getText(getVerifyMsg());
		System.out.println(text);
		return text;
	}

}
