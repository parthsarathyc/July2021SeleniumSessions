package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StringLocator {

	static WebDriver driver; 
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/login");

		
		String email="input-email"; 
		doSendKrys("id", email, "naveen"); 
//here also we are exactly doing the same thing where we need not maintain the "by locator" separately 
/* Advantages -
 * Web development is still in progress and elements are not ready so dev team has not defined some IDs and locators. 
 *  * Through i can't inspect the elements but can take the "strings" from UI developer and can start writing the code.
* Now e have 2 doSendKrys method - one with by locator and one with String locator-both doing the same thing. 
* This is just another approach 
 */
	}

	public static By getBy(String locatorType, String locatorValue) {//return type is By 
		System.out.println("type" + locatorType + "and" + "value" + locatorValue) ;
		
		By locator =null; 
		switch (locatorType.toLowerCase()) { 		
		case "id":	
			locator= By.id(locatorValue); 
		break;
		case "name":	
			locator= By.name(locatorValue); 
		break;
		case "xpath":	
			locator= By.xpath(locatorValue); 
		break;
		case "css":	
			locator= By.cssSelector(locatorValue); 
		break;
		case "linktext":	
			locator= By.linkText(locatorValue); 
		break;
		case "partiallinktext":	
			locator= By.partialLinkText(locatorValue); 
		break;
		case "classname":	
			locator= By.className(locatorValue); 
		break;
		case "tagname":	
			locator= By.tagName(locatorValue); 
		break;
	default:
		System.out.println("please pass correct locator type");
		break;
	}
  return locator ; //return the locator we have created -return type is By 
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKrys(String locatorType ,String locatorValue, String value) { //overloading this method 

		 getElement(getBy(locatorType, locatorValue)).sendKeys(value);
		 // using getBy function to get By locator 
	}
	
	public static void doSendKrys(By locator,String value) {

		 getElement(locator).sendKeys(value);
	}
	
}
