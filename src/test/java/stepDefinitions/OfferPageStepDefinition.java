package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

//single responsibility principle - each class has its own responsibility
//loosely coupled - sharing info between classes using dependency injection
//tightly coupled - cannot share between classes
//Factory design pattern
public class OfferPageStepDefinition {
	
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	//constructor
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
	}
		
	
	@Then("user searched for same {string} Shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
	  
		switchToOffersPage();
	
		OffersPage offersPage = testContextSetup.pageObjectManager.getOffersPage();
	
		offersPage.SearchItem(shortName);
		
		Thread.sleep(2000);
		
		testContextSetup.offerPageProductName= offersPage.getProductName();
		
	}
	
	public void switchToOffersPage() {
		
		//if switched to offers page -> skip below part
		//if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/"))
		
		//LandingPage landingPage= new LandingPage(testContextSetup.driver);
		testContextSetup.pageObjectManager.landingPage.selectTopDeals();
		
		//switching from parent window to child window
		testContextSetup.genericUtils.SwitchWindowToChild();
		
	}
	
	
	@And("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_Landing_page() throws IOException {
		
		//assertion to validate 
		Assert.assertEquals(testContextSetup.offerPageProductName, testContextSetup.LandingPageProductName);
			
	}

}
