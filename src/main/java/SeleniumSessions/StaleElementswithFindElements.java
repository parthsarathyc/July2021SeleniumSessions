package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementswithFindElements {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> footerlist = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a")); 
		
		System.out.println(footerlist.size());
		
		for (int i = 0; i < footerlist.size(); i++) {
			
			footerlist.get(i).click(); 
			
			driver.navigate().back(); 
			
			footerlist = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a")); 
			
		}
		

	}

}
