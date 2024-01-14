package Configuration_CreationFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_SubDisposition extends AdminLogin {
	
	String Disposition = "New";
	
	String SubDisposition = "Test Working";
	
	String Description = "Testing Purpose";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Sub Disposition page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Sub-Dispositions'])[1]")).click();
		
	}
	
	@Test
	public void Create_SubDisposition() throws InterruptedException {

		// Sub disposition Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		//Disposition
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement DispoList = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		DispoList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Disposition+"'])[2]")).click();
	
		Popup.click();
		
		// Sub - disposition
		
		driver.findElement(By.xpath("(//input[@aria-label='Sub-Disposition'])[1]")).sendKeys(Sub_Disposition);
		
		//Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(SubDispo_Description);
		
		// Create Sub Disposition
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Test(priority=1)
	public void SubDispo_Verfication() throws InterruptedException {
		


		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Title
		
		driver.findElement(By.xpath("(//input[@aria-label='Sub Disposition'])[1]")).sendKeys(Sub_Disposition);
		
		Thread.sleep(1000);
		
		WebElement TitleList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		TitleList.findElement(By.xpath("(//span[@class='v-list__tile__mask'])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Edit Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//input[@aria-label='SubDisposition'])[1]")).getAttribute("value");
		
		Assert.assertEquals(actualvalue, Sub_Disposition , "Sub-Dispo is Not Created");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();

	}

}
