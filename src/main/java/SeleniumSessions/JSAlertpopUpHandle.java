package SeleniumSessions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertpopUpHandle {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.name("proceed")).click(); 
			//clicking  on sign in button n rediff mail.com
			// a pop up appears
			//we have to switch the driver to the popup 
			
			Thread.sleep(3000); //3 seconds wait
			
			driver.switchTo().alert(); 
//these alerts are called java script alert / Model dialogue popup 
// the above code returns Alert so storing them in  Alert 		
			
			Alert alert = driver.switchTo().alert(); 
			//Alert is a class in selenium. 
			String text = alert.getText(); //captures text from the popup 
			System.out.println(text );
			
			alert.accept();// to accept the alert or click on OK 
			
			// to dismiss the alert 
			alert.dismiss(); 
			
			//after clicking on OK the driver we need the driver on webpage. Hence we write 
			driver.switchTo().defaultContent();//means coming back to the webpage
			//this is a good practice to use this. 
		
			
			
			
	}

}
