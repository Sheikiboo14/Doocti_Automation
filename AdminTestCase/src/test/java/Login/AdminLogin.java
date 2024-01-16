package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminLogin {

//Login Credentials
	
	String URL ="https://console-v2.doocti.com/v2.1.105/";

	String AdminEmail = "smibrahim_admin@doocti.com";
	
	String AdminPassword = "Doocti@123";
	
// Create Announcement
	
		protected String Announcement_Name ="Testing Demo3";
		
		protected String Announcement = "Good Morning";
		
		protected String Announcement_Campaign ="Preview 2";
		
// Create Audio Store
		
		protected String Audio_Description = "Testing";                      
	    
		protected String Audio_Path ="D:\\Audio Store\\Leo Ratata BGM.mp3";  
		
//Create Block List
		
		protected String BlockList_Path = "C:\\Users\\User\\Downloads\\sample_blocklist.csv";

//Create DID Number
		
		protected String DID_Path = "C:\\Users\\User\\Downloads\\sample_did (1).csv";
		
		protected Long DID_Number = 9876543210L;
		
		protected String DID_Trunk ="Testing";
		
//Create Disposition
		
		protected String Dispo_Name ="Testing Dispo";
		
		protected String Dispo_Description = "Testing Purpose";
		
		protected String Dispo_Action = "No Action";

//Create Inbound Router
		
		protected String IR_Application="queue";
		
		protected Long IR_DID_Number = 9090909090L;
		
		protected boolean IR_BlockList = false;
		
//Create Meeting Title
		
		protected String Meeting_Title = "Test";
		
		protected String Meeting_SubTitle = "Testing";
		
		protected String Meeting_Description = "Testing Purpose";
		
//Create Pause Code
		
		protected String PauseCode_Name = "Testing";
		
		protected String PauseCode_Description = "Testing Purpose";
		
		protected int PauseCode_hour = 1;
		
		protected int PauseCode_minutes =30;
		
//Create Queue
		
		protected String Queue_Name ="Test Queue";
		
		protected int Queue_WaitTime = 20;	
		
		protected String Queue_Strategy ="Leastrecent";
		
//Create Script
		
		protected String Script_Name = "Test2";
		
		protected String Script_Description ="Testing Purpose";
		
		protected String Script_Type ="URL";
		
		protected String Script_Text="Hello Tevatel";
		
		protected String Script_URL = "https://tevatel.com/";
		
//Create Sub Disposition
		
		protected String Disposition = "New";
		
		protected String Sub_Disposition = "Test Working";
		
		protected String SubDispo_Description = "Testing Purpose";
		
//Create Tags
		
		protected String Tag_Name = "Test";
		
		protected String Tag_Description = "Testing";
		
//Create Ticket Status
		
		protected String TicketStatus_Name = "Testing";
		
		protected String TicketStatus_Description = "Testing Purpose";
		
// Create TimeZone
		
		protected String TimeZone_Name = "Test" ;
		
		protected String TimeZone_Description ="Testing Purpose";
		
		protected int TimeZone_StartHour = 1;
		
		protected int TimeZone_StartMinute = 00;
		
		protected int TimeZone_EndHour = 10;
		
		protected int TimeZone_EndMinute = 00;
		
		protected String TimeZone_Status = "Active";
			

	public WebDriver driver;
	
	
//	@Parameters("browserName")
	@BeforeTest
	public void Login() throws InterruptedException {
		/*
		switch(browserName) {
		
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions Browser = new ChromeOptions();
			
			Browser.addArguments("--incognito");
			
			driver = new ChromeDriver(Browser);
			
			break ;
		
		case "edge":

			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
			
			break ;
			

		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			
			break ;
			
		default :
			
			System.err.println("Browser Name Invalid");
			
		}
		*/
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions Browser = new ChromeOptions();
		
		Browser.addArguments("--incognito");
		
		driver = new ChromeDriver(Browser);
			
	

		
		/*
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();
		*/
		
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(AdminEmail);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(AdminPassword);
		
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		Thread.sleep(5000);

		driver.navigate().refresh();
		
	}
	
//	@AfterTest
//	public void Quit() throws InterruptedException {
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//i[@title='Sign Out']")).click();
//		
//		driver.quit();
//		
//	}
//	
}

