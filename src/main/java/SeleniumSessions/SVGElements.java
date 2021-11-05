package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElements {

	
	  static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co =new ChromeOptions(); 
		co.addArguments("--headless");
		driver=new ChromeDriver(co); 
		
		driver.get("https://emicalculator.net/"); 
		; 
		Thread.sleep(3000);
		
		String verticalXpath= "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']"; 
		
		List<WebElement> barsList=driver.findElements(By.xpath(verticalXpath)); //xpath of vertical bars 
		// xpath of text that comes after tool tip /mouse hover on the bars
		String toolTipXbath= "//*[local-name()='svg']//*[name()='g' and contains(@class,'highcharts-tooltip')]//*[name()='text']"; 
		
		System.out.println(barsList.size());
		
		Actions act =new Actions(driver); //to emulate mouse like actions to move from one bar to the next 
		
		for (WebElement e : barsList) {//the mouse will move over all the 42 bars. 
			act.moveToElement(e).build().perform(); 
			Thread.sleep(3000); //for the text to appear 
			String text = driver.findElement(By.xpath(toolTipXbath)).getText(); 
			System.out.println(text);
			
			
		}
		
	
	}

}
