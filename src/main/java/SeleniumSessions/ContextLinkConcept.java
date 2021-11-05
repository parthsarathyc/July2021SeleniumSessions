package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextLinkConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		By rightClick = By.xpath("//span[text()='right click me']");
		By items = By.xpath("//ul[@class  =\"context-menu-list context-menu-root\"]/li/span");
		ArrayList<String> ActualList = getRightClickList(rightClick, items);

		if (rightClckItemsCount(rightClick, items) == 6) { 
			System.out.println("count is correct");		
		}
		
		clickOnRightClickItem(rightClick, items, "Copy"); 
		
	}

	public static int rightClckItemsCount(By rightClick, By items) { // returns size
		return getRightClickList(rightClick, items).size();
	}

	public static void clickOnRightClickItem(By rightClick, By items,String value) {
		WebElement rightClickMe = getElement(rightClick);
		ArrayList<String> itemvalue = new ArrayList<String>();
		Actions act = new Actions(driver);
		act.contextClick(rightClickMe).build().perform();
		List<WebElement> menuList = getElements(items);
		
		for (WebElement e : menuList) {
			 if (e.getText().equals(value)) {
				e.click();
				break; 
			}
		}		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static ArrayList<String> getRightClickList(By rightClick, By items) {
		WebElement rightClickMe = getElement(rightClick);
		ArrayList<String> itemvalue = new ArrayList<String>();

		Actions act = new Actions(driver);
		act.contextClick(rightClickMe).build().perform();
		List<WebElement> menuList = getElements(items);
		System.out.println(menuList.size());
		for (WebElement e : menuList) {
			String text = e.getText();
			itemvalue.add(text);

		}
		return itemvalue;
	}

}
