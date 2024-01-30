package Admin_Configuration_UpdateFlow1;

import javax.swing.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_PauseCode extends AdminLogin {

	
	

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Pause Code Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Dispositions'])[1]")).click();
		
		Thread.sleep(1000);
	}
	
	@Parameters({"updated_CodeName","updated_CodeStatus"})
	@Test
	public void Update_Status(String updated_CodeName , String updated_CodeStatus) throws InterruptedException {

		Actions action = new Actions(driver);
		// Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+updated_CodeName+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		
		// Pausecode Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		StatusList.findElement(By.xpath("(//div[contains(text(),'"+updated_CodeStatus+"')])[1]")).click();
		
		action.click().build().perform();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();

		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+updated_CodeName+"']//following-sibling::td[4]")).getText();
		
		Assert.assertEquals(actualvalue,updated_CodeStatus, "PauseCode Status is Not Updated...!" );
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		


	}
	
	/*
	@Parameters({"pauseCode_Name","updated_CodeName"})
	@Test(priority = 0)
	public void Update_CodeName(String pauseCode_Name,String updated_CodeName  ) throws InterruptedException {
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Filter With Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(pauseCode_Name);
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Pausecode Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[1]")).sendKeys(updated_CodeName);
		
		// Update Name
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();


	}
	
	@Parameters({"updated_CodeName","updated_Description"})
	@Test(priority = 1)
	public void Update_Description(String updated_CodeName, String updated_Description ) throws InterruptedException {
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Filter With Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(updated_CodeName);
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Pausecode Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[1]")).sendKeys(updated_Description);
		
		// Update Description
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();


	}
	


	@Parameters({"updated_CodeName","updated_Hour","updated_Minute"})
	@Test(priority = 3)
	public void Update_Time(String updated_CodeName,int updated_Hour ,int updated_Minute) throws InterruptedException {

		// Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+updated_CodeName+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Pausecode Time
		
		driver.findElement(By.xpath("(//input[@aria-label='Time'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Code_Clock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));
		
		Code_Clock.findElement(By.xpath("(//span[contains(text(),'"+updated_Hour+"')])[1]")).click();
		
		Popup.click();
		
		Code_Clock.findElement(By.xpath("(//span[contains(text(),'"+updated_Minute+"')])[1]")).click();
		
		driver.findElement(By.xpath("(//div[normalize-space()='OK'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		


	}
	*/
}
