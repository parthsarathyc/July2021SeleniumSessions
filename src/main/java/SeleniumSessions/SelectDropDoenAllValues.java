package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDoenAllValues {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		By country = By.id("Form_submitForm_Country");   
		doSelectByVisibleText(country, "India");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int Index) {
		Select select = new Select(getElement(locator));

		select.selectByIndex(Index);
	}

	public static boolean doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));

		select.selectByVisibleText(text);
		return IsDropDoenSelected(select, text); 
	
	}

	public  static boolean doSelectByvalue(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByValue(text);
		return IsDropDoenSelected(select, text); 
	}
	public static boolean IsDropDoenSelected(Select select, String ExpValue) {

		String text = select.getFirstSelectedOption().getText();
	
		if (text.equals(ExpValue)) {
			System.out.println(ExpValue + ":  is selected");
			return true;
		}
		return false;
	}


}
