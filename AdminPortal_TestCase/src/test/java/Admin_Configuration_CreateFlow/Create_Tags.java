package Admin_Configuration_CreateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;


public class Create_Tags extends AdminLogin {

	
	String TagName = "Test";
	
	String TagDescription = "Testing";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Block List Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Tags'])[1]")).click();
		
	}
	
	@Test
	public void Tags_Creation() throws InterruptedException {

		// Add Tag Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Tag'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Tag Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(Tag_Name);
		
		// Tag Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Tag_Description);
		
		// Tag Creating 
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}
	
	
	@Test(priority=1)
	public void Tag_Verfication() throws InterruptedException {
		


		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='sidenavContainer'])[1]"));
		
		
		//Filter Title
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(Tag_Name);
		
		Thread.sleep(1000);
		
		WebElement TitleList = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		TitleList.findElement(By.xpath("(//div[@class='v-list__tile__title'])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Edit Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//input[@aria-label='Name'])[1]")).getAttribute("value");
		
		Assert.assertEquals(actualvalue, Tag_Name , "Tag is Not Created");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Cancel'])[2]")).click();

	}
}
