package SeleniumSessions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoauto.xyz/signin");

		driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		By leads = By.xpath("//span[text()='Leads']");
		By addLead = By.xpath("//a[@title='Add lead']");
		By Comp = By.id("company_name");
		
		retryingElement(leads).click();
		retryingElement(addLead).click();
		retryingElement(Comp).sendKeys("ibm"); 
		

	}

	public static WebElement retryingElement(By locator) {
		WebElement element = null;
		int attempts = 0;

		while (attempts < 20) {
			try {
				element = driver.findElement(locator);
				break;
 
			} catch (NoSuchElementException e) {
				System.out.println("elememt is not found in attempt" + attempts);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			attempts ++; 
		}
		
		return element;
	}
}
