package testNGSessions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	WebDriver driver; 
	
	//setup - pre condition
	//tear down - after execution is completed 
	@BeforeTest
	public  void setUp() {    // these are pre conditions. 
								//this method will be run only once 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize or full screen 
		driver.manage().deleteAllCookies(); // to delete all cookies 
		driver.get("https://www.amazon.in/");
		}
	
	@Test 
	public void titleTest() { // always write test at the end of function such as titleTest 
	String title = driver.getTitle(); 
	//validate is done by assertion class 
    Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    //above is Actual Vs expected results. 
}
	
	@Test 
	public void searchTest() { 
	boolean flag =driver.findElement(By.id("nav-search-bar-form")).isDisplayed(); //if search bar is displayed then true 
	Assert.assertTrue(flag); //this is expecting a true flag. 
  
	}
	
	@Test
	public void logoTest() {
		
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
		
	}
	
	@AfterTest
	public  void tearDown() {    // these are pre conditions. 
		driver.quit();
	}
	

}
