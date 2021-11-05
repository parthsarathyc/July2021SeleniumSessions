package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		By parent =By.className("menulink"); //for content 
		By child = By.linkText("COURSES");   //for courses
		
		parentChildMenuHandle(parent, child); 
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void parentChildMenuHandle(By parent, By Child) throws InterruptedException {
		Actions act = new Actions(driver); 
		act.moveToElement(getElement(parent)).build().perform();
		Thread.sleep(2000);
		getElement(Child).click(); 
		
	}

}
