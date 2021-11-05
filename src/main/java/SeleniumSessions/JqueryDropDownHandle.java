package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
	//	multi  selection 
		selectChoice(choices, "choice 1", "choice 2" ,"choice 3"); 
//		ALL   selection 
		selectChoice(choices, "ALL"); 
		
	}

	public static void selectChoice(By locator, String... value) {

		List<WebElement> choiceList = driver.findElements(locator);

	if (!value[0].equals("ALL")) {
// we are passing Argument "All" to parameter value[0] so this condition is satisfied i.e value[0]=All. 
//!value[0].equals("ALL") --> ! is not . This means value[0] is not equal to All. 
//Hence control goes to else condition  
//this if condition is for multi or single selection and else condition is for ALL selection 
		
		for (int i = 0; i < choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);
			for (int j = 0; j < value.length; j++) {
				if (text.equals(value[j])) {
					choiceList.get(i).click();
					break;  
				}
			}
		} 
	}
	else {//else condition is for ALL selection 
		for (WebElement e : choiceList) {
			e.click();  //clicks all dropdown elements 
		}
		
		 
	}
	}
}
