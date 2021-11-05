package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectHTMLDropDown {

	static WebDriver driver; 
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
	By country = 	By.id("Form_submitForm_Country"); 
	 
	//creating generic utilities 
	doSelectByIndex(country, 5); 
	doSelectByVisibleText(country, "India");
	doSelectByvalue(country, "Afghanistan");
	
	
	}
	
	public static  WebElement getElement(By locator) { 	
		return driver.findElement( locator);
	}
	public static void doSelectByIndex(By locator , int Index)
	{
		Select select = new Select(getElement(locator)); 
		//webelement needs to be passed hence passed getElement which is a web element.  
		
		select.selectByIndex(Index);//index that we are passing in the method. 
	}
	
	public static void doSelectByVisibleText(By locator , String text)
	{
		Select select = new Select(getElement(locator));  
			
		select.selectByVisibleText(text); 
	}
	
	public static void doSelectByvalue(By locator , String text)
	{
		Select select = new Select(getElement(locator)); 
			
		select.selectByValue(text); 
	}
	
	
	
	
	
	
	

}
