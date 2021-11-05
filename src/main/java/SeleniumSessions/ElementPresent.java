package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementPresent {

	static WebDriver driver; 
	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(); 
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	
		By search =By.name("email"); 
		
		List<WebElement> searchList =driver.findElements(search); 

		System.out.println(checkElementDisplayed(search)); 
		//System.out.println(checkElementDisplayed(search, 1)); // will check of the element is appearing once. 
		//below checks if forfotton password is coming twice 
		By forgotpwd =By.linkText("Forgotten Password");
		System.out.println(checkElementDisplayed(forgotpwd, 2)); // will check of the element is appearing twice. 

	}
    //creating custom method 
	public static   List<WebElement> getElements(By locator)
	{
		 return driver.findElements(locator);
	}
	public static boolean checkElementDisplayed(By locator) { //for single occurance 
		
		if (getElements(locator).size()==1) {
			return true;  	}    
		return false;  	
	}
	public static boolean checkElementDisplayed(By locator, int elementOccurance) {//overlaoding the method 
		//usecase is to check the number of times the element is appearing. Single or multiple occurance 
		
		if (getElements(locator).size()==elementOccurance) {
			return true;  	}    
		return false;  
		
	}
	
}
