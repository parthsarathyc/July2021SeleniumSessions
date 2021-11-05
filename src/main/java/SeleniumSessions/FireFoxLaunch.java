package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFoxLaunch {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//rest if the code will be as chrome 
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		driver.close(); 

	}

}
