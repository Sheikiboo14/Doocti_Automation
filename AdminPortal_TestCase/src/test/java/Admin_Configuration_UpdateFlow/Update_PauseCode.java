package Admin_Configuration_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_PauseCode extends AdminLogin {

	String PauseCode_Name="Testing";
	
	String Updated_CodeName = "Dummy";
	
	String Updated_Description = "Only for testing";
	
	String Updated_CodeStatus = "Inactive";
	
	int Updated_Hour =0;
	
	int Updated_Minute = 45;
	

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Pause Code Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Dispositions'])[1]")).click();
		
	}
	
	@Test(priority = 0)
	public void Update_CodeName() throws InterruptedException {
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Filter With Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(PauseCode_Name);
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Pausecode Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[1]")).sendKeys(Updated_CodeName);
		
		// Update Name
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();


	}
	

	@Test(priority = 1)
	public void Update_Description() throws InterruptedException {
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Filter With Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(PauseCode_Name);
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Pausecode Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[1]")).sendKeys(Updated_Description);
		
		// Update Description
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();


	}
	
	@Test(priority = 2)
	public void Update_Status() throws InterruptedException {
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Filter With Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(PauseCode_Name);
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Pausecode Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		StatusList.findElement(By.xpath("(//div[contains(text(),'Inactive')])[1]")).click();
		
		Popup.click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();

		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		


	}

	@Test(priority = 3)
	public void Update_Time() throws InterruptedException {
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Filter With Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(PauseCode_Name);
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Pausecode Time
		
		driver.findElement(By.xpath("(//input[@aria-label='Time'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Code_Clock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));
		
		Code_Clock.findElement(By.xpath("(//span[contains(text(),'"+Updated_Hour+"')])[1]")).click();
		
		Popup.click();
		
		Code_Clock.findElement(By.xpath("(//span[contains(text(),'"+Updated_Minute+"')])[1]")).click();
		
		driver.findElement(By.xpath("(//div[normalize-space()='OK'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		


	}
}
