package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver; 
	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(); 
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//	Approach 7
	
	By emailiddd=	By.id("input-email");
	By passworddd=	By.id("input-password");
	
	//create object of ElementUtil to call the methods 
	
	ElementUtil eleutil= new ElementUtil(driver); // the object asks for webdriver due to constructor  created. 
	//  driver=new ChromeDriver(); from above passes through the above object 
	//the same drive from above will go to ElemenutUil class and become driver for the class i.e webdrive value will now be same for
	//LocatorsConcept and ElemenutUil class 

	eleutil.dosendkey(emailiddd, "naveen "); 
	eleutil.dosendkey(passworddd, "password "); 
	
	}

}
