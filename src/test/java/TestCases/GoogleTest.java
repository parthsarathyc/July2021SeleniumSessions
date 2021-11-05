package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest extends BaseTest {

	WebDriver driver;



	@Test
	public void titleTest() {
		String title = driver.getTitle();

		Assert.assertEquals(title, "Google");
	}

	@Test
	public void searchTest() {
		boolean flag = driver.findElement(By.id("input")).isDisplayed();
		Assert.assertTrue(flag);
	}	
	
}
