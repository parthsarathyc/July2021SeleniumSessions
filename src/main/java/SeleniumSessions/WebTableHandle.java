package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	  Thread.sleep(4000); 
	  driver.switchTo().frame("mainpanel"); 
	  driver.findElement(By.linkText("CONTACTS")).click(); 
	  
	 selectContact("Indra Nanj");   
	 selectContact("Harshitha Deepak");   
	 System.out.println(getCompname("Indra Nanj"));
	 System.out.println( getCompname("Harshitha Deepak"));

	}
	//generic utilities 
	
	public static  String getCompname(String contactName) {
		
		String checkCompXpath= "//a[text()='"+contactName+"']/parent::td/following-sibling::td/a[@context='company']";
		//xpath for company (fashion)  right of name Indra Nanj 
		return driver.findElement(By.xpath(checkCompXpath)).getText(); 
	}
	
		public static  void selectContact(String contactName) {
			
	String checkBoxXpath= "//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		 driver.findElement(By.xpath(checkBoxXpath)).click(); 
		}
	
	
}
