package User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_User extends AdminLogin {
	
	String UserId = "smibrahim_agent02";
	
	String Name ="Test";
	
	int MobileNo =12345;
	
	String EmailId = "smibrahim_agent02@doocti.com";
	
	String  Password= "Doocti@123";
	
	String Role = "Agent";
	
	String Group ="smibrahim_admin";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 0)
	public void Create_User() throws InterruptedException {
		
		// Going to user page
		
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		
		//Opening Add User Popup
		
		driver.findElement(By.xpath("//div[normalize-space()='Add User']")).click();
		
		Thread.sleep(1000);
		
		WebElement UserPopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@class='v-card__text']"));
		
		//UserId
		
		driver.findElement(By.xpath("//div[@id='scrollbar']//input[@aria-label='User Id']")).sendKeys(UserId);
		
		//Name
		
		driver.findElement(By.xpath("//div[@id='scrollbar']//input[@aria-label='Name']")).sendKeys(Name);
		
		//Mobile Number
		
		WebElement mno = driver.findElement(By.xpath("//div[@id='scrollbar']//input[@aria-label='Mobile Number']"));
		
		mno.sendKeys(Integer.toString(MobileNo));
		
		//Email Id
		
		driver.findElement(By.xpath("//div[@class='v-input v-text-field theme--light']//input[@aria-label='Email Id']")).sendKeys(EmailId);
		
		//Password
		
		driver.findElement(By.xpath("//input[@placeholder='sample@1234']")).sendKeys(Password);
		
		//Role
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[4]")).click();
		
		Thread.sleep(1000);
		
		WebElement RoleList = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		RoleList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Role+"'])[2]")).click();
		
		UserPopup.click();
		
		//Group
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[5]")).click();
		
		Thread.sleep(1000);
		
		WebElement GroupList = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		GroupList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Group+"'])[2]")).click();
		
		//Create New User
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Create'])[2]")).click();
		
		//Close Snaknbar
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
	}
}
