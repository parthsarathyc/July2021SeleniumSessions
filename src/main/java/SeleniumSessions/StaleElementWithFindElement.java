package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithFindElement {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement emailid =driver.findElement(By.id("input-email")); 
		emailid.sendKeys("naveen@gmail.com"); //DOM =v1 and email id will be part of the DOM v1  
		//now we want to refresh the page 
		
		driver.navigate().refresh(); 
		emailid =driver.findElement(By.id("input-email"));
		//This is same as 
		// int i=10;
		// i =20
		//so the new value if i is 20 
		//with the new DOM after refresh the webelement -emailid is recreated. 
		
		emailid.sendKeys("Tom@gmail.com");//works fine as emailid is having values from DOM2.
		
		//thats why refresh is avoided as new DOM gets loaded 
		//with the By locator such things get avoided as on run time we pass the by locator 
		//it will crate the webelement on the run time on the basis of the DOM or new DOM post refresh 
	//	Hence we never got stale element exception with by locator 
		


	}

}
