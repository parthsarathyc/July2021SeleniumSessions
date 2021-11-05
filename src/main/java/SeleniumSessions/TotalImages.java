package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	
	  static WebDriver driver; 

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		
		driver.get("https://www.amazon.in/"); 
		
		
		List<WebElement> linkList= driver.findElements(By.tagName("a")); 
		
		//all the links are denoted by tagname --> a
		
		System.out.println("total images" +linkList.size() );
		
		for (WebElement e: linkList)
		{
			String hrefVal= e.getAttribute("href"); 
		
			String text =e.getText(); 	//for capturing text of the link
			
			System.out.println(hrefVal + ": " + text);
		}
		 
	}

}
