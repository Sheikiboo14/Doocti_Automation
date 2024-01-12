package Configuration_DeletionFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class TicketStatus_Deletion extends AdminLogin{
	

	String Name = "Testing";


	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Ticket Status Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Ticket Status'])[1]")).click();
		
	}
	
	@Test
	public void TicketStatus_Deletion() throws InterruptedException {
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Filter With Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(Name);
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Delete Ticket Status
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}

	

}
