package Contact;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Contact extends AdminLogin {
	
	String Contact_Name = "test";

	@BeforeTest
	public void SetUp() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Contacts']")).click();
		
	}
	
	@Test
	public void Delete_Contact() throws InterruptedException {
		
		//Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterPopup = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		driver.findElement(By.xpath("(//input[@placeholder='search'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement contactlist = driver.findElement(By.xpath("(//div[@class='v-list theme--light'])[1]"));
		
		contactlist.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Contact_Name+"'])[1]")).click();
		
		FilterPopup.click();
		
		//Apply Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(2000);
		
		//Delete Contact
		
		driver.findElement(By.xpath("(//i[@title='Agent Assign'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Delete'])[2]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[2]")).click();
		
//		List<WebElement> contactlist = (List<WebElement>) driver.findElement(By.xpath("(//div[@class='v-list theme--light'])[1]"));
//		
//		for (WebElement list : contactlist) {
//			
//		}
	}
		@Test
		public void Bulk_Delete() throws InterruptedException{
			
			//Bulk Select 
			
			driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__ripple'])[1]")).click();
			
			// Bulk Delete
			
			driver.findElement(By.xpath("(//i[@class='fas fa-trash-alt'])[1]")).click();
			
			Thread.sleep(1000);
			
		}
		
	}




