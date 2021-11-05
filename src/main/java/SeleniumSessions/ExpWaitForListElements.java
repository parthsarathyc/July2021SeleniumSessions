package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpWaitForListElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
	
		driver.get("https://www.freshworks.com/"); 
		
		By footerlist =By.xpath("//ul[@class='footer-nav']"); 
	
		printElementsTextList(footerlist, 5); //prints footer list
		System.out.println(getElementsTextList(footerlist, 5));

	}	
	public static List<WebElement> waitforElementsPresent(By locator,int timeOut){
		WebDriverWait wait= new WebDriverWait(driver, timeOut); 
		return	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)); 	
	}

	public static ArrayList<String>  getElementsTextList(By locator,int timeOut){
		WebDriverWait wait= new WebDriverWait(driver, timeOut); 
		List<WebElement> eleList= 	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)); 
		
		ArrayList<String> eleValList=new ArrayList<String>(); 
		
		for (WebElement e : eleList) {
			eleValList.add(e.getText()); 
		}
		return eleValList; 
	}
	public static void  printElementsTextList(By locator,int timeOut){
		WebDriverWait wait= new WebDriverWait(driver, timeOut); 
		List<WebElement> eleList= 	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)); 
	
		for (WebElement e : eleList) {
		System.out.println(e.getText());
		}
	
	}
}
