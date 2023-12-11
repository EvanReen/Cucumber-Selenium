package stepDefinitions;


import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

//single responsibility principle - each class has its own responsibility
//loosely coupled - sharing info between classes using dependency injection
public class CheckoutPageStepDefinition {
	
	TestContextSetup testContextSetup;
	public CheckoutPage checkoutPage;
	
	//constructor
	public CheckoutPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.checkoutPage= testContextSetup.pageObjectManager.getCheckoutPage();
	}
	
	
	@Then("verify that user has ability to enter promo code and place the order")
	public void verify_that_user_has_ability_to_enter_promo_code_and_place_the_order() {
		
		Assert.assertTrue(checkoutPage.verifyPromoBtn());
		Assert.assertTrue(checkoutPage.verifyPlaceOrder());
	}
	
	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout(String name) throws InterruptedException {
		
		checkoutPage.checkoutItems();
		//Assertion to extract name from screen and compare with name

	}

}
