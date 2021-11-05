package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitMethod {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("https://www.freshworks.com/");
		By customer = By.linkText("Customers"); 
		
		waitFrElementPresenceWithFluentWait(customer, 5, 2000).click(); 
		
	}
	
	public static WebElement waitFrElementPresenceWithWebDrivertWait(By Locator, int timeOut, int pollingTime) {
		WebDriverWait wait =new WebDriverWait (driver, timeOut);
		wait.withMessage("element not found").
			pollingEvery(Duration.ofMillis(pollingTime)).
				ignoring(StaleElementReferenceException.class);
					
	
	return wait.until(ExpectedConditions.presenceOfElementLocated(Locator)); 
	}

	public static WebElement waitFrElementPresenceWithFluentWait(By Locator, int timeOut, int pollingTime) {
		Wait <WebDriver> wait =new FluentWait<WebDriver> (driver).
				withTimeout(Duration.ofSeconds(timeOut)).
					withMessage("element not found").
						pollingEvery(Duration.ofMillis(pollingTime)).	
							ignoring(StaleElementReferenceException.class);		
	
			return wait.until(ExpectedConditions.presenceOfElementLocated(Locator)); 
	}
	
	
}
