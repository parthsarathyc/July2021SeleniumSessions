package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	//On top of selenium code the methods are created. 
	public WebDriver driver;
    /** we can get this by /** and pressing enter. 
     * This method is ised to initialize the driver on the basis of given browser name. 
     * @param browserName
     * @return it returns the driver 
     */
	
	
	public WebDriver initDriver(String browserName) {// returning driver so return type is Webdriver

		System.out.println("browsername is" + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("safari")) {

			// Vendor for safari is apple and does not provide any exe file. So it is
			// internally maintained by selenium
			// for safari there is no need to set property like other browsers.
			driver = new SafariDriver();
		} else {
			System.out.println("pleae pass the right browser");
		}

		return driver; // return turn type is Webdriver

	}

	
	
	public void launchUrl(String url) {
		if (url == null || url.isEmpty()) { // || is or condition
			System.out.println("url is incorrect ");
			return; // blank return is equivalent to void , it returns nothing
		} else {
			driver.get(url);
		}
	}

	public String pageTitle() { 
	
	return driver.getTitle(); ////return type is string 

	}


	
	public String getPageUrl() { 
		
	return driver.getCurrentUrl(); ////return type is string 

	}
	
	
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
}
