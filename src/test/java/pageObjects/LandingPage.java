package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;
	
	//encapsulation
	private By search = By.xpath("//input[@type='search']");
	
	private By productName = By.cssSelector("h4.product-name");
	
	By topDeals = By.linkText("Top Deals");
	
	By increment = By.cssSelector("a.increment");
	
	By addToCart = By.cssSelector(".product-action button");
	
	
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;	
	}
	
	public void SearchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText() {
		
		driver.findElement(search).getText();
	}
	
	public void IncrementQuantity(int quantity) {
		 
		int i = quantity - 1;
		 
		 while(i>0) {
			 
			 driver.findElement(increment).click();
			 i--;
		 
		 }
		 
	}
	
	public void addToCart() {
		
		driver.findElement(addToCart).click();
	}
	
	public String getProductName() {
		
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDeals() {
		
		driver.findElement(topDeals).click();
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
		
	}
}
