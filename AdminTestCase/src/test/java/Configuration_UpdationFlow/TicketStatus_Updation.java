package Configuration_UpdationFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class TicketStatus_Updation extends AdminLogin {


	String Name = "Testing";
	
	String Status = "Inactive";
	
	String Update_Name ="Test";
	
	String Update_Description ="Only For Testing";	
	
	

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		
		// Opening Ticket Status Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Ticket Status'])[1]")).click();
		
	}
	
	@Test
	public void Update_Status() throws InterruptedException  {
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Filter With Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(Name);
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
	

		
		//Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
	
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Status
		
		driver.findElement(By.xpath("//div[@class='v-input v-text-field v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("//div[@class='v-input v-text-field v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Status+"'])[2]")).click();
		
		Popup.click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Test(priority = 1)
	public void Update_Name() throws InterruptedException{
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Filter With Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(Name);
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);

		
		//Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
	
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[1]")).sendKeys(Update_Name);
		
		// Update Name

		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}
	@Test(priority = 2)
	public void Update_Description() throws InterruptedException{
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		// Filter With Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(Update_Name);
		
		// Apply filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
	
		//Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
	
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[1]")).sendKeys(Update_Description);
		
		// Update Name

		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}

}
