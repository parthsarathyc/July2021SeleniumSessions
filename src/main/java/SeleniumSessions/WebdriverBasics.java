package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {

		// we need a server chromedriver.exe to launch the driver
		// this is browser responsibility to provide the exe

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // top casting with the grandchild.
	
//automation steps 
		driver.get("https://www.google.com/"); // to open url
		// the above code will not work if we do not write http or https.

		String title = driver.getTitle(); // this is the tab name of the browser . This returns a string and can be
		// stored in a string variable.
		// mouse over in getTiltle() the return type is string.
		//Webdriver is having getTiltle() method without body . Remote web driver is child of webdriver and has implemented all the methods
		
		// RWD class is parent of chrome driver class. Method body is created by RWD. So top casting between chromedriver and webdriver is possible. 
		//referace type check is passed and we can access getTiltle() because webdriver is the grandparent of chrome driver. 

		System.out.println("page title: " + title);

// verification point/checkpoint : act vs exp result.
		
		
		if(title.equals("Google")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is incorrect");
		}
		
//automation steps + verification points --> automation ( test). 
		
		System.out.println(driver.getCurrentUrl()); // prints current url 
		System.out.println(driver.getPageSource());// gives the entire page source
		System.out.println(driver.getPageSource().contains("Copyright")); //output -true 
		
		driver.quit(); // closes the browser 

	}

}
