package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		driver.close(); 

		driver = new ChromeDriver();  //new session id ( say session id  456)  will be created and will be used for below code
		driver.get("https://www.google.com/");//session id  456
		title = driver.getTitle(); 	//session id  456

	 
		System.out.println("page title: " + title);

	}

}

