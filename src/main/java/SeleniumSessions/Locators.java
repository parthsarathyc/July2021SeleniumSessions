package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	static WebDriver driver; 
	public static void main(String[] args) {
	

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		driver.get("https://www.freshworks.com/");
		
	
	By customer= 	By.linkText("Customers"); 
		
	 Locators.doClick(customer); 
//	  System.out.println(getText(customer));
	
		}
	
	public  static WebElement getElement(By locator) { 
		return driver.findElement( locator);
	}
	
	public static  void doClick(By locator) { //creating  custom click method 
		
		getElement(locator).click(); 
		
	}
	
	public static  String getText(By locator) { //creating  custom click method 
		
		return getElement(locator).getText(); 
		
	}

}
