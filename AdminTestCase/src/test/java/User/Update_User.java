package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_User extends AdminLogin {
	
	
	String User_Email = "smibrahim_agent02@doocti.com";
	
	String Updated_UserEmail = "smibrahim_agent03@doocti.com";
	
	String User_Status = "Inactive";
	
	String User_Group = "Test";
	
	String User_Role ="Administrator";
	
	Long MobileNo = 9876543221L;
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		// User Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Users'])[1]")).click();
		
		
		// Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterPopup = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Email filter
		
		driver.findElement(By.xpath("(//input[@aria-label='EmailId'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EmailList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		EmailList.findElement(By.xpath("(//div[contains(text(),'"+User_Email+"')])[1]")).click();
		
		Thread.sleep(1000);
		
//		FilterPopup.click();
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		// Close the Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-close'])[1]")).click();
		
		Thread.sleep(1000);
		
	}
	

	@Test(enabled=true)
	public void Update_Status() throws Exception {
		
		// Edit User Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[4]"));
		
		WebElement Dialogbox = driver.findElement(By.xpath("(//div[@class='v-dialog v-dialog--active'])[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
				
		js.executeScript("Dialogbox.scrollBy(0,200)");
		
		Thread.sleep(1000);
		

		// User Status
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement UserStatus = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		UserStatus.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+User_Status+"'])[1]")).click();

		EditPopup.click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
		
		driver.findElement(By.xpath("(//span[normalize-space()='Users'])[1]")).click();
		
	}
	

	

	@Test(enabled=true)
	public void Update_UserMobileNo() throws InterruptedException {

		
		
		// Edit User Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[4]"));
		
		// Mobile Number
		
		WebElement MobileNumber = driver.findElement(By.xpath("(//input[@aria-label='Mobile Number'])[1]"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(MobileNumber).sendKeys(Keys.BACK_SPACE).build().perform();
		
		MobileNumber.sendKeys(Long.toString(MobileNo));

		
		// Update Mobile No
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
		
		driver.findElement(By.xpath("(//span[normalize-space()='Users'])[1]")).click();
	}
	
	@Test(enabled=true)
	public void Update_UserEmail() throws InterruptedException {
		
		// Edit User Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[4]"));
		
		// User Email
		
		driver.findElement(By.xpath("(//input[@aria-label='Email Id'])[1]")).clear();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@aria-label='Email Id'])[1]")).sendKeys(Updated_UserEmail);
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
		
		driver.findElement(By.xpath("(//span[normalize-space()='Users'])[1]")).click();	
		
	}
	
	@Test(enabled=false)
	public void Update_UserGroup() throws InterruptedException {
		

		// Edit User Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[4]"));
		
		// User User Group
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement UserStatus = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		UserStatus.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+User_Group+"'])[1]")).click();

		EditPopup.click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
		
		driver.findElement(By.xpath("(//span[normalize-space()='Users'])[1]")).click();
		

	}
	
	@Test(enabled=true)
	public void Update_Role() throws InterruptedException {
		

		// Edit User Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[4]"));
		
		// User User Role
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement UserRole = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		UserRole.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+User_Role+"'])[1]")).click();

		EditPopup.click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(3000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
		
		driver.findElement(By.xpath("(//span[normalize-space()='Users'])[1]")).click();
		

	}

	
	

}
