package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickInfoTable {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-women-s-t20-world-cup-africa-region-qualifier-2021-1275087/mozambique-women-vs-tanzania-women-11th-match-group-a-1275114/full-scorecard");
		
		System.out.println(getBatsManScoreList("Palmira Cuinica"));
		

	}

	public static ArrayList<String> getBatsManScoreList(String batsmanName) {
		
		//find elements as there are webelements returning from the xpath 
		
		String scoreXpath ="//a[text()='"+batsmanName+"']/parent::td/following-sibling::td";
		List<WebElement> scoreList= driver.findElements(By.xpath(scoreXpath)); 
		
		ArrayList<String> scoreValList=new ArrayList<String>(); 
		
		for (int i = 0; i < scoreList.size(); i++) {
			
			String text= scoreList.get(i).getText(); 
			//we need to publish score card list hence making one list of string 
			//hence empty list created at before for loop 
			
			scoreValList.add(text); 
			}
		return scoreValList; //return the list of score card 
		
	}
}
