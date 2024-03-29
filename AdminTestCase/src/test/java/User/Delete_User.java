package User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_User extends AdminLogin{
	
	String UserId = "";
	
	String MobNo ="";
	
	String Email ="smibrahim_agent01@doocti.com";
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Test(priority =0)
	public void Delete_User() throws InterruptedException {
		
		//Going to User Page
		
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		
		
		// Opening the Filter
		
		driver.findElement(By.xpath("//i[@class='fas fa-filter']")).click();
		
		if(UserId.equalsIgnoreCase("")) {
		
		driver.findElement(By.xpath("//input[@aria-label='UserId']")).sendKeys(UserId);
		
		}
		
		else if (MobNo.equals("")) {
			
			driver.findElement(By.xpath("//input[@aria-label='MobileNumber']")).sendKeys(MobNo);
			
		}
		
		else {
			
			driver.findElement(By.xpath("//input[@aria-label='EmailId']")).click();
			
			Thread.sleep(1000);
			
			WebElement EmailList =driver.findElement(By.xpath("(//div[@role='list'])[2]"));
			
			EmailList.findElement(By.xpath("//div[contains(text(),'"+Email+"')]")).click();
		}
		
		//Applying Filter
		
		driver.findElement(By.xpath("//div[@class='v-btn__content'][normalize-space()='Filter']")).click();
		
		Thread.sleep(1000);
		
		// Closing the Filter tab
		
		driver.findElement(By.xpath("//i[@class='fas fa-close']")).click();
		
		//Deleting the User
		
		driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Yes, Delete !']")).click();
		
		Thread.sleep(1000);
		
		//Close the Snackbar
		
		driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();
		
	}
	


}
