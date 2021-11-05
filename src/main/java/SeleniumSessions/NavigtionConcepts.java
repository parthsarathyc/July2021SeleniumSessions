package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigtionConcepts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://www.google.com"); //opens google 
		
		driver.navigate().to("https://amazon.com"); //opens amazon on the same tab
		System.out.println(driver.getTitle());
		
		driver.navigate().back(); //back is a browser property. Takes back to google.com
		//driver is now in google 
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();//takes back to amazon. 
		System.out.println(driver.getTitle());
		
		driver.navigate().back();//takes back to google 
		System.out.println(driver.getTitle());
		
		
		
	}

}
