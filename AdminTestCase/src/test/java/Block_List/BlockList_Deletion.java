package Block_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class BlockList_Deletion extends AdminLogin {
	
	Long Phno =9090909091L;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Block List Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Block List'])[1]")).click();
		
	}
	
	@Test
	public void BlockList_Delete()throws InterruptedException {
		
		// Search Number
		
		WebElement PhoneNumber = driver.findElement(By.xpath("(//input[@aria-label='Phone Number'])[2]"));
		
		PhoneNumber.sendKeys(Long.toString(Phno));
		
		// Delete BlockList
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[2]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}

}
