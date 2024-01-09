package User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Change_UserPassword extends AdminLogin {

	String UserId = "smibrahim_agent04";
	
	String NewPassword = "Doocti@1234";
	
	String CPassword = NewPassword;

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		
	//Going to User Page
		
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		
	//Opening Filter Tab
		
		driver.findElement(By.xpath("//i[@class='fas fa-filter']")).click();
		
	//Filter with UserId
		
		driver.findElement(By.xpath("//input[@aria-label='UserId']")).sendKeys(UserId);
		
	// Apply the Filter
		
		driver.findElement(By.xpath("//div[@class='v-btn__content'][normalize-space()='Filter']")).click();
		
	// Close the filter tab
		
		driver.findElement(By.xpath("//i[@class='fas fa-close']")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 0)
	public void  ChangePassword() throws InterruptedException {
		
	// Open Change Password Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link fa fa-key theme--light violet--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement PasswordPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[3]"));
		
	// New Password
		
		driver.findElement(By.xpath("(//input[@aria-label='New Password'])[1]")).sendKeys(NewPassword);
		
		PasswordPopup.click();
		
	// Confirm Password
		
		driver.findElement(By.xpath("(//input[@aria-label='Confirm Password'])[1]")).sendKeys(CPassword);
		
		PasswordPopup.click();
		
	// Create a New Password
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
	//Close Snakbar
		
		driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();
	}
}
