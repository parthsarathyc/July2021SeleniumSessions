package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpWaitForAlert {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		System.out.println(waitForJSAlert(10).getText());
		System.out.println(AlertGetText(5));
		acceptAlert(5); 

	}

	public static Alert waitForJSAlert(int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
		// return type is alert and will do the switch automatically.
	}

	// for accept alert
	public static void acceptAlert(int timeOut) {
		waitForJSAlert(timeOut).accept();
	}

	// for dismiss alert
	public static void dismissAlert(int timeOut) {
		waitForJSAlert(timeOut).dismiss();
		;
	}

	// for alert sendkeys
	public static void AlertSendKeys(int timeOut, String value) {
		waitForJSAlert(timeOut).sendKeys(value);
	}

	public static String AlertGetText(int timeOut) {
		return waitForJSAlert(timeOut).getText();
	}

}
