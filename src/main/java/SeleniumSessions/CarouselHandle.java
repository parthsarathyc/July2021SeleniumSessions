//package SeleniumSessions;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CarouselHandle {
//
//	static WebDriver driver;
//
//	public static void main(String[] args) {
//
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.noon.com/uae-en/");
//		
//	String xpath = "//h3[text()='Recommended for you'] //parent::div//following-sibling::div//div[@data-qa='product-name']";
//	//xpath of next button 
//	String nextXpath = "//h3[text()='Recommended for you'] //parent::div//following-sibling::div//div[contains(@class,'swiper-button-next')]"; 
//	
//	List<WebElement>  recommlist = driver.findElements(By.xpath(xpath)); 
//	System.out.println(recommlist.size());
//	
//
//	List<String> prodList=new ArrayList<String>(); 
//	while (!driver.findElement(By.xpath(nextXpath)).getAttribute("class").contains("swiper-button-disabled")) {//till the next button is not disappearing 
//		
//		for (WebElement e : recommlist) {
//			String text= e.getText();
//			prodList.add(text);
//			//this will add the current displayed item on the screen 
//			}
//		//then we click on next
//		
//		driver.findElement(By.xpath(nextXpath)).click(); //DOM gets updated for the second set of data after clicking next 
//		xpath = "//h3[text()='Recommended for you'] //parent::div//following-sibling::div//div[@data-qa='product-name']";
//		
//	}
//		
//	for (String e : prodList) {
//		System.out.println(e);
//	}
//
//	}
//
//}
