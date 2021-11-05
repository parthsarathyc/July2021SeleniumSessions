package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("https://demoauto.xyz/signin");  
		driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		driver.findElement(By.xpath("//span[text()='Leads']")).click(); 
		driver.findElement(By.xpath("//a[@title='Add lead']")).click(); 
		
		By comp = By.id("company_name_11"); //passing incorrect ID hence the test will fail again
		//however we can check the polling time in the console 
		By city= By.id("city");
	
		// to wait 2 sec
		waitForElementPresent(comp, 10, 2000).sendKeys("poona"); //10 sec and 2000 milliseconds 
	}
	
	public static WebElement waitForElementPresent(By locator, int timeout)
	{
		WebDriverWait wait =new WebDriverWait(driver, timeout);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementPresent(By locator, int timeout,int intervalTime) //overlaoding  the method 
	//intervalTime - will be in millseconds to sleep between polls/internals 
	{
		WebDriverWait wait =new WebDriverWait(driver, timeout, intervalTime);
		//The above constructor is available on WebDriverWait

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
}
