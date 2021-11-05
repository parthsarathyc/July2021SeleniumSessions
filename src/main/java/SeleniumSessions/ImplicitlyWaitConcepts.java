package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcepts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
// overriding  implicit Wait

		
	// Login page -10 sec required 
	driver.get("https://demoauto.xyz/signin");  

	driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); 
	//latest implicit wait is 7 sec for all the code below this 
	driver.findElement(By.xpath("//span[text()='Leads']")).click(); 
	driver.findElement(By.xpath("//a[@title='Add lead']")).click(); 
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	//latest implicit wait is 5 sec for all the code below this 
	driver.findElement(By.id("company_name")).sendKeys("Amazon"); 
	
	//after this we logout
//now for login page we need 10 sec and current global weight is 5 sec so again need to change the weight. 


	}

}
 