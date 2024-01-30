package Admin_Configuration_UpdateFlow1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_TicketStatus extends AdminLogin {


	
	

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		
		// Opening Ticket Status Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Ticket Status'])[1]")).click();
	
		Thread.sleep(1000);
	}
	
	@Parameters({"ticketStatus_Name","ticketStatus_Status"})
	@Test
	public void Update_ticketStatusStatus(String ticketStatus_Name, String ticketStatus_Status ) throws InterruptedException  {
		
		Actions action = new Actions(driver);
		
		//Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+ticketStatus_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
		// Status
		
		driver.findElement(By.xpath("//div[@class='v-input v-text-field v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("//div[@class='v-input v-text-field v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+ticketStatus_Status+"'])[2]")).click();
		
		action.click().build().perform();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+ticketStatus_Name+"']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue, ticketStatus_Status, "TicketStatus Status is not Updated...!");
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	/*
	@Parameters({"ticketStatus_Name","Update_ticketStatus_Name"})
	@Test(priority = 1)
	public void Update_Name(String ticketStatus_Name, String Update_ticketStatus_Name) throws InterruptedException{
		

		
		//Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+ticketStatus_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
				
		// Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[1]")).sendKeys(Update_ticketStatus_Name);
		
		// Update Name

		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(Update_ticketStatus_Name)) {
				
				flag = true;
			}
		}
	
		Assert.assertTrue(flag,"TicketStatus Name is not Updated...!");
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}
	
	@Parameters({"Update_ticketStatus_Name","Update_ticketStatus_Description"})
	@Test(priority = 2)
	public void Update_Description(String Update_ticketStatus_Name, String Update_ticketStatus_Description ) throws InterruptedException{
		
	
		//Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+Update_ticketStatus_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
	
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[1]")).sendKeys(Update_ticketStatus_Description);
		
		// Update Name

		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("(//input[@aria-label='Description'])[1]")).getText();
		
		Assert.assertEquals(actualvalue,Update_ticketStatus_Description,"Ticket Status Description is not Updated...!");
	
//		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}*/

}
