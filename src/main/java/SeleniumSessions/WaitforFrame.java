package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforFrame {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

	//	waitForFramesUsingName("main", 5);
		//switching to frame using framelocator 
		By frameLocator = By.name("main");
		waitForFramesUsingByLocator(frameLocator, 5); //parameters -Byframelocator and int 

		String header = driver.findElement(By.xpath("//html/body/h2")).getText();
		System.out.println(header);

		driver.switchTo().defaultContent();

	}
	// creating utility

	public static void waitForFramesUsingName(String FrameName, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameName));
	}

	// there are other metho ids to avaiable under frames. We are now creating
	// utility for them.
	public static void waitForFramesUsingFrameIndex(int frameIndex, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	//Using by locator
	public static void waitForFramesUsingByLocator(By frameLocator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	//Using Web Element
		public static void waitForFramesUsingWebElement(WebElement frameElemenet, int timeOut) {

			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElemenet));
		}

}
