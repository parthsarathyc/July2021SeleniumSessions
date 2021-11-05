package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowsertest {
	
	static WebDriver driver; 
	//we are using the same driver in all the below conditions so maintaining at class level or creating as class variable 
	//Static is used so that we do need object to call it within main class. Main method is also static. 
	public static void main(String[] args) {
		
		String browser ="firefox"; 
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

			 driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		} else if (browser.equalsIgnoreCase("safari")) {
			
				// Vendor for safari is apple and does not provide any exe file. So it is internally maintained by selenium
			//for safari there is no need to set property like other browsers. 
			 driver = new SafariDriver();
		}
		else {
			System.out.println("pleae pass the right browser");
		}
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		driver.quit(); 


	}

}
