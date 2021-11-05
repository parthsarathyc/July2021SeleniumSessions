package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorkTest extends BaseTest {

	WebDriver driver;

	@BeforeTest


	@Test
	public void titleTest() {
		String title = driver.getTitle();

		Assert.assertEquals(title, "Freshworks | Modern and Easy Customer and Employee Experience Software");
	}

	
	
}

