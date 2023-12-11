package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public WebDriver driver;
	
	//encapsulation
	By cartBag = By.cssSelector("[alt='Cart']");
	
	By checkOutButton = By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]");
	
	By promoBtn = By.cssSelector(".promoBtn");
	
	By placeOrder = By.xpath("//button[contains(text(), 'Place Order')]");
	
	//constructor
	public CheckoutPage(WebDriver driver) {
		
		this.driver=driver;	
	}
	
	public void checkoutItems() {
		
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}
	
	public Boolean verifyPromoBtn() {
		
		return driver.findElement(promoBtn).isDisplayed();
		
	}
	
	public Boolean verifyPlaceOrder() {
		
		return driver.findElement(placeOrder).isDisplayed();
	}
	

}
