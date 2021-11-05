package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		
		BrowserUtil br= new BrowserUtil();//using browserutil for browser work 
		
		WebDriver driver=br.initDriver("chrome"); //the return trpe of the method is driver. Hence can be stored as webdriver. 
		//session id of this webdriver will be same as initDriver method of BrowserUtil class. 
		//say - session id -123
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		System.out.println(br.pageTitle());
		
		
		//using ElementUtil for util work 
		By emailiddd=	By.id("input-email");
		By passworddd=	By.id("input-password");
		
		ElementUtil util = new ElementUtil(driver); //due to constor declaration Webdrive is taken as argument 
		// the same session from above will now go to ElementUtil class i.e session id -123. 
		
		util.dosendkey(emailiddd, "naveen "); // On session id 123
		
		br.quitBrowser(); // On session id 123
		
		// We used 2 different classes and execution happened on 1 single browser 
		
		
	}

}
