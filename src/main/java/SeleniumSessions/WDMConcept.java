package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {
		
	/**	 WebDriverManager is the class name available in WebDriverManager library
	chromedriver is a method.
	
	 */
		//chrome 
	WebDriverManager.chromedriver().setup(); // no need to set properties 

	WebDriver driver = new ChromeDriver(); 
	driver.get("http://amazon.com");
	
	//firefox
	
	WebDriverManager.firefoxdriver().setup(); 
	
	WebDriver driver1 = new FirefoxDriver(); 
	driver1.get("http://amazon.com");
	

	}

}
