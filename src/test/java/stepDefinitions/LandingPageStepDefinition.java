package stepDefinitions;


import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

//single responsibility principle - each class has its own responsibility
//loosely coupled - sharing info between classes using dependency injection
public class LandingPageStepDefinition {
	
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	//constructor
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;	
	    this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
	}
	
	@Given("user is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() throws IOException {
	   		
		//verifying title of landing page
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
					
	}
	
	
	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_hortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
	    
		LandingPage landingPage= testContextSetup.pageObjectManager.getLandingPage();
		
		landingPage.SearchItem(shortName);
		
		Thread.sleep(2000);
		
		testContextSetup.LandingPageProductName= landingPage.getProductName().split("-")[0].trim();

		
		System.out.println(testContextSetup.LandingPageProductName + " is extracted from Home page.");
		
		
	}
	
	@When("Added {string} items of the selected product to cart")
	public void Added_items_of_product(String quantity) {
		
		landingPage.IncrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	}

}
