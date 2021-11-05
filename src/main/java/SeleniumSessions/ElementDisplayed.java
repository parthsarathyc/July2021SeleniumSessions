package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementDisplayed {

	public static void main(String[] args) {
		

		BrowserUtil br= new BrowserUtil(); 
		
		WebDriver driver=br.initDriver("chrome"); 
		
		br.launchUrl("https://classic.freecrm.com/register/");  
		
		String attributeVal= driver.findElement(By.name("first_name")).getAttribute("type"); 
		//output - text
		System.out.println(attributeVal);
	
		//creating  custom method for getAttribute in element util class 
		
		ElementUtil ele= new ElementUtil(driver); 
		
		By loc= By.name("first_name"); 
		String val= "type"; 
		
		System.out.println(ele.doGetAttributeValue(loc, val));
	}

	
}
