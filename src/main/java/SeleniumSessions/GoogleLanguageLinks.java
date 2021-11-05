package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
	By langLinksXpath=	By.xpath("//footer//a"); 

	GoogleLanguageLinks.doLinkClick(langLinksXpath, "Delivery Information");
		
	}
	
	public static  List<WebElement> getElements(By locator)//return type is List<WebElement>
	{//new custom method 
		 return driver.findElements(locator);
	}
	
	public static void doLinkClick(By locator , String linkValue)
	{
List<WebElement> langlist=  getElements(locator)   ;  //replaced with method 
		
		System.out.println(langlist.size());
		
		for (WebElement e : langlist) {  
			String text= e.getText();
			System.out.println(text);  
			
			if (text.trim().equals(linkValue)) {
				
				e.click();
				break; 
			}
			
		}
		
	}
	
	
	
	
	
}
