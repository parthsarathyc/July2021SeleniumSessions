package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest extends BaseTest {


	
	
	@Test 
	public void titleTest() {
	String title = driver.getTitle(); 
	
    Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
}
	
	@Test 
	public void searchTest() { 
	boolean flag =driver.findElement(By.id("nav-search-bar-form")).isDisplayed(); 
	Assert.assertTrue(flag); 
  
	}
	
	@Test
	public void logoTest() {
		
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
		
	}
	

	

}

