package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableTraverse {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

			getTableData(1); 
			getTableData(2); 
			getTableData(3); 
	}
	
	

	//generic function 
	
	public static void getTableData(int colNumber) {
		
		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr["; 
		String afterXpath = "]/td["+colNumber+"]";  //Appending column number to existing code to change columns
		
		int  rowCount= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size(); 

		for (int i = 2; i <=rowCount ; i++) {// tr[2],tr[3]...., so we need to start with tr[2] hence i =2

			String compXpath = beforeXpath + i + afterXpath; // this gives the complete xpath

			String Comptext= driver.findElement(By.xpath(compXpath)).getText(); 
			System.out.println(Comptext);
		}	
	}	
}


