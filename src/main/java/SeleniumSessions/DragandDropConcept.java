package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
	WebElement sourseEle= 	driver.findElement(By.id("draggable")); //creating web elelemnt -source 
	WebElement targetEle= 	driver.findElement(By.id("droppable")); ////creating web elelemnt -target 
	

	Actions act =new Actions(driver); //actions class is already present in selenium

	act.clickAndHold(sourseEle).moveToElement(targetEle).release().build().perform(); 
	
	act.dragAndDrop(sourseEle, targetEle).build().perform(); 

		
		

	}

}
