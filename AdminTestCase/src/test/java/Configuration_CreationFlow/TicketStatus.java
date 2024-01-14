package Configuration_CreationFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class TicketStatus extends AdminLogin{
	
	String StatusName = "Testing";
	
	String StatusDescription = "Testing Purpose";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Ticket Status page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Ticket Status'])[1]")).click();
		
	}
	
	@Test
	public void Create_TicketStatus() throws InterruptedException {
		
		// Add Popup
		
				driver.findElement(By.xpath("(//div[normalize-space()='Add New'])[1]")).click();
				
				Thread.sleep(1000);
				
				// Status Name
				
				driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(TicketStatus_Name);
				
				//Status Description
				
				driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(TicketStatus_Description);
				
				// Create Status
				
				driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
				
				Thread.sleep(1000);
				
				// Close Snakbar
				
				driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
				
				driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

				
			}
			
			@Test(priority=1)
			public void TicketStatus_Verfication() throws InterruptedException {
				


				//Filter Tab
				
				driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
				
//				Thread.sleep(1000);
				
				WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
				
				
				//Filter Title
				
				driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(TicketStatus_Name);
				
				Thread.sleep(1000);
				
//				WebElement TitleList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
//				
//				TitleList.findElement(By.xpath("(//span[@class='v-list__tile__mask'])[1]")).click();
				
				Popup.click();
				
				// Applying Filter
				
				driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
				
				Thread.sleep(1000);
				
				//Edit Popup
				
				driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
				
				Thread.sleep(1000);
				
				String actualvalue = driver.findElement(By.xpath("(//input[@aria-label='Name'])[1]")).getAttribute("value");
				
				Assert.assertEquals(actualvalue, TicketStatus_Name , "Ticket Status is Not Created");
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();

			}
}
