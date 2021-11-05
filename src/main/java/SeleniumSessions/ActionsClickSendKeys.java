package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickSendKeys {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By name = By.id("Form_submitForm_Name"); 
		By email =By.id("Form_submitForm_Email"); 
		By PrivacyPolicy =By.linkText("Privacy Policy");
		
		Actions act =new Actions(driver);
		
		doActionSendkeys(name, "naveen");
		
			}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionSendkeys(By locator, String value) {
		
		Actions act =new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform(); 
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	
	
	

}
