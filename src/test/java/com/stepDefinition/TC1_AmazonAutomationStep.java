package com.stepDefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC1_AmazonAutomationStep {
	PageObjectManager pageObjectManager = new PageObjectManager();

	/**
	 * @Description For product searching reason the step has been created
	 */
	@Given("User is on the Amzaon main page")
	public void userIsOnTheAmzaonMainPage() {
		pageObjectManager.getAmazonPage().amazonpage();
	}

	/**
	 * @throws InterruptedException 
	 * @Description For product filtering reason the step has been created
	 */
	@Given("User should click on the hamburger menu in the top left corner")
	public void userShouldClickOnTheHamburgerMenuInTheTopLeftCorner() {
		pageObjectManager.getAmazonPage().menu();
	}

	/**
	 * @Description For product filtering by department section the step has been created
	 */
	@When("User should Scroll down and then Click on the TV, Appliances and Electronics link under Shop by Department section.")
	public void userShouldScrollDownAndThenClickOnTheTVAppliancesAndElectronicsLinkUnderShopByDepartmentSection() {
		pageObjectManager.getAmazonPage().clickTv();
	}

	/**
	 * @Description For product filtering by sub section the step has been created
	 */
	@When("User should click on Televisions under the Tv, Audio & Cameras sub section")
	public void userShouldClickOnTelevisionsUnderTheTvAudioCamerasSubSection() {
		pageObjectManager.getAmazonPage().clickTelevision();
	}

	/**
	 * @Description For product filtering by brand name the step has been created
	 */
	@When("User should scroll down and filter the results by Brand Samsung")
	public void userShouldScrollDownAndFilterTheResultsByBrandSamsung() {
		pageObjectManager.getAmazonPage().clickSamsung();
	}

	/**
	 * @Description For product filtering by price wise the step has been created
	 */
	@When("User should sort the Samsung results with price High to Low")
	public void userShouldSortTheSamsungResultsWithPriceHighToLow() {
		pageObjectManager.getAmazonPage().clickHightoLow();
	}

	/**
	 * @Description To product select reason the step has been created
	 */
	@When("User should click on the second highest priced item \\(whatever that maybe at the time of automating)")
	public void userShouldClickOnTheSecondHighestPricedItemWhateverThatMaybeAtTheTimeOfAutomating() {
		pageObjectManager.getAmazonPage().clickSecondHighPrice();
	}

	/**
	 * @Description For moving to product selected page the step has been created
	 */
	@When("User should switch the selected prodect details page")
	public void userShouldSwitchTheSelectedProdectDetailsPage() {
		pageObjectManager.getAmazonPage().switchToWindow();
	}

	/**
	 * @Description To verify the Attribute value of getSuccess message
	 * @param value
	 */
	@Then("User should verify success message after choosing the product {string}")
	public void userShouldVerifySuccessMessageAfterChoosingTheProduct(String message) {
		String assertVrfy = pageObjectManager.getAmazonPage().assertVerify();
		Assert.assertEquals("Message Successfully Verified",assertVrfy, message);
	}

}
