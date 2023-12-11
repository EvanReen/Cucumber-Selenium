package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	//constructor
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SwitchWindowToChild() {
		
		//strong both parent window and child window in a set collection
		Set<String> s1 = driver.getWindowHandles();
				
		//to retrieve these we will use iterator
		Iterator<String> i1 = s1.iterator();
				
		//getting parent window
		String parentWindow = i1.next();
				
		//getting child window
		String childWindow = i1.next();
				
		//switching to child window page
		driver.switchTo().window(childWindow);
	}

}
