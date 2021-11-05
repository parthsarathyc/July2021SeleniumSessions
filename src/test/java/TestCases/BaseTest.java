package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {


	WebDriver driver; 
	
	@Parameters({"url", "browser"}) //Pass the 2nd parameter here 
	@BeforeTest
	public  void setUp(String url, String browser) {   
		
		
		switch (browser) {  //to manage the  browser
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			break;
		}
								
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.get(url); 
		}
	
	
	
	@AfterTest
	public  void tearDown() {   
		driver.quit();
	}

	
}
