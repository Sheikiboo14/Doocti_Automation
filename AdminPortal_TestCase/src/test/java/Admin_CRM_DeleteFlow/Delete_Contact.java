package Admin_CRM_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Contact extends AdminLogin{
	
	
	String phone_Number ="9090909093";
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'CRM')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Contacts'])[1]")).click();
		
		Thread.sleep(1000);
		
	}

	@Test(priority=0)
	public void Delete_Contact() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		// Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@aria-label='Contact Number'])[1]")).sendKeys(phone_Number);
		
		driver.findElement(By.xpath("(//div[@class='v-list__tile__content'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
	
		//delete contact
		
		driver.findElement(By.xpath("(//i[@title='Agent Assign'][normalize-space()='delete'])[1]")).click();
	
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[2]")).click();
		
		// Verification
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		action.doubleClick(driver.findElement(By.xpath("//input[@aria-label='Contact Number']"))).sendKeys(Keys.BACK_SPACE).build().perform();
		
		driver.findElement(By.xpath("(//input[@aria-label='Contact Number'])[1]")).sendKeys(phone_Number);
		
		WebElement filtervalue = driver.findElement(By.xpath("(//div[@class='v-list__tile__content'])[1]"));
		
		
		boolean flag =filtervalue.isDisplayed();
			
		System.out.println(flag);
		
		Assert.assertFalse(flag,"Contact is not Deleted...!");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@class='fas fa-close'])[1]")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("(//div[contains(text(),'CRM')])[1]")).click();

	
		
	}
	
	@Test(priority=1)
	public void BulkDelete_Contact() throws InterruptedException{
		
		// Bulk Delete Contact
		
		driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__ripple'])[1]")).click();
		
		driver.findElement(By.xpath("(//i[@class='fas fa-trash-alt'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
		
		Thread.sleep(1000);
		
		//Close snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[2]")).click();
		
		driver.navigate().refresh();
		
		//Verification
		
		List<WebElement> Alldata = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		int count = Alldata.size();
		
		Assert.assertEquals(count-1, 0,"Contact is not deleted...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'CRM')])[1]")).click();
		
		
	}
}
