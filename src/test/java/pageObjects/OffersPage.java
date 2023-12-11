package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
	public WebDriver driver;
	
	//encapsulation
	private By search = By.xpath("//input[@type='search']");
	
	private By productName = By.cssSelector("tr td:nth-child(1)");
	
	//constructor
	public OffersPage(WebDriver driver) {
		
		this.driver=driver;	
	}
	
	public void SearchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText() {
		
		driver.findElement(search).getText();
	}
	
	public String getProductName() {
		
		return driver.findElement(productName).getText();
	}

}
