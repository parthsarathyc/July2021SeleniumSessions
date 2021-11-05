package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforUrlandTitle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("https://demo.opencart.com/index.php?route=account/login"); 
	//	WebDriverWait wait =new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.titleContains("Login"));//until method is returning boolean 
		
		String title= waitForTitleContains(4, "Login"); 
		System.out.println(title);
		
		driver.findElement(By.linkText("Register")).click(); 
		
		 title= waitForTitleContains(4, "Register"); 
		System.out.println(title);
		

	}
	
	public static String waitForTitleContains(int timeOut, String titlefraction) {
		WebDriverWait wait =new WebDriverWait(driver, timeOut);
		 wait.until(ExpectedConditions.titleContains(titlefraction)) ; 	
		return  driver.getTitle(); 
		}
		

	}


