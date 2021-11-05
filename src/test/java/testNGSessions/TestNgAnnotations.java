 package testNGSessions;

 import org.testng.annotations.AfterClass;
 import org.testng.annotations.AfterMethod;
 import org.testng.annotations.AfterSuite;
 import org.testng.annotations.AfterTest;
 import org.testng.annotations.BeforeClass;
 import org.testng.annotations.BeforeMethod;
 import org.testng.annotations.BeforeSuite;
 import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;

 public class TestNgAnnotations {
//we will never use main method in testNG 
 	// design tc
	 
		 	// Global Pre condition -- @Before
		 	// Pre condition --@Before
		 	// test steps/cases --@Test
		 	// actual result vs expected result -- Asertions
		 	// post step --@After

 	// status -- PASS/FAIL -- TEST execution
 	
	 
	 //ANNOTATION is a special keyword starting with @ under that @ some logic is already written 
	 //every annotation should be associated with a method as shown below 
	 
 	@BeforeSuite   // sequence - this will be executed 1st 
 	public void connectwithDB() {
 		System.out.println("BS - connectwithDB");
 	}

 	@BeforeTest // // sequence - this will be executed 2nd  
 	public void createUser() {
 		System.out.println("BT - createuser");
 	}

 	@BeforeClass // // sequence - this will be executed 3rd
 	public void launchBrowser() {
 		System.out.println("BC - launchBrowser");
 	}

 	@BeforeMethod //this will create pair with  each and every test 
 	public void logintoApp() {
 		System.out.println("BM - logintoApp");
 	}

 	// These are 3 test cases in this class . @test shows the number of test cases as shown below. 
 	//@before method--> Test-->AfterMethod run in pair. 
 	@Test
 	public void homePageHeaderTest() {
 		System.out.println("homePageHeaderTest");
 	}

 	@Test
 	public void homePageTitleTest() {
 		System.out.println("homePageTitleTest");     
 	}

 	@Test
 	public void SearchTest() {     	//the test cases will be picked by alphabetical order. 
									//Alphabetically S-> capital is coming first and hence will be executed 
 		System.out.println("SearchTest");
 	}

 	
 	//once the test execution is done -@after will be used. 
 	@AfterMethod  
 	public void logout() {////this will create pair with  each and every test 
 		System.out.println("AM -- logout");
 	}

 	@AfterClass   // sequence - this will be executed 1st 
 	public void closeBrowser() {
 		System.out.println("AC -- closeBrowser");
 	}

 	@AfterTest  // sequence - this will be executed 2nd 
 	public void deleteUser() {
 		System.out.println("AT -- deleteUser");
 	}

 	@AfterSuite  //// sequence - this will be executed 3rd
 	public void disconnectWithDB() {
 		System.out.println("AS -- disconnectWithDB");
 	}

 }



 