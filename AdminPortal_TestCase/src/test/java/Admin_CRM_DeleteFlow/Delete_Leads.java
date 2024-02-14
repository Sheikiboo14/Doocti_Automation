package Admin_CRM_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Leads extends AdminLogin{
	
	
	@BeforeTest
	public void Setup() throws InterruptedException {
	
		driver.findElement(By.xpath("(//div[contains(text(),'CRM')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Leads'])[1]")).click();
		
		Thread.sleep(1000);
	}
	
	
	@Test(priority=0)
	public void Delete_Lead() throws InterruptedException {
		
		// delete Lead
		
		
		driver.findElement(By.xpath("(//i[@title='Delete'][normalize-space()='delete'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//close snakbar
		
		driver.findElement(By.xpath("//div[normalize-space()='Close']")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'CRM')])[1]")).click();

	}
	
	
	@Test(priority=1)
	public void Bulk_Delete() throws InterruptedException{
		
		// Bulk delete
		
		driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__ripple'])[23]")).click();
		
		driver.findElement(By.xpath("(//i[@title='Bulk Delete'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		Thread.sleep(1000);
		
		//close snakbar
		
		driver.findElement(By.xpath("//div[normalize-space()='Close']")).click();
		
		//Verification
		
		List<WebElement> Alldata = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		int count = Alldata.size();
		
		Assert.assertEquals(0, count , "Lead is not deleted...!");
		
		
		driver.findElement(By.xpath("(//div[contains(text(),'CRM')])[1]")).click();

		
		
	}

}
