package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click(); 
		
		String actMonthYear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText(); 
		System.out.println(actMonthYear);
		
		String expMonthYear = "November 2021";
		
		while (!actMonthYear.equals(expMonthYear)) {//continue to click till the values are matched 
			driver.findElement(By.xpath("//span[text()='Next']")).click(); 
			 actMonthYear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText(); 
		}
		
		selectDay("10") ;
		
	}
	// to select any specific day of a month 
	public static void selectDay(String day) {
		driver.findElement(By.xpath("//a[text()= "+ day+ "]")).click();
	
	}

}
