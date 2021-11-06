package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
	
		
		BrowserUtil br =new BrowserUtil(); 
		br.initDriver("chrome");
		br.launchUrl("https://amazon.com");
		System.out.println("url is launched");//GIT session - file is modified 
		String title =br.pageTitle();
		System.out.println(title);
		br.quitBrowser(); 
		
		
		// Advantage
		//today we are doing this for amazon and tomorrow we can do this for any other page. 
		//We need to repeat the code again and again and our code should look neat and clean. 
		//we have to design the utilities, design the wrappers and call them from test class so that 
		// Maintenance of framework, Readability of the code , re usability for different application 
		// we are passing our own error handling message 
		
		
	}

}
