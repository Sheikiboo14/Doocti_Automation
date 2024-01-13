package Disposition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Dispo_Update extends AdminLogin{
	
	String Dispo_Name = "Dummy";
	
	String Dispo_Action = "Callback";
	
	String Dispo_Status = "Inactive";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Dispo Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Dispositions'])[1]")).click();
		

		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
//		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(Dispo_Name);
		
		Thread.sleep(1000);
		
//		WebElement DispoList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
//		
//		DispoList.findElement(By.xpath("(//div[contains(text(),'"+Dispo_Name+"')])[1]")).click();
		
		FilterTab.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
	}
	
	@Test(priority = 0 , enabled = false)
	public void Update_Action() throws InterruptedException 
	{
		
		// Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Action
		
		WebElement ActionList= driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[1]"));
		
		Thread.sleep(1000);
		
		ActionList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Dispo_Action+"'])[1]")).click();
		
		UpdatePopup.click();
		
		// Update the Disposition
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Test(priority = 1)
	public void Update_Status() throws InterruptedException {
		
		// Update Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Status 
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement Status_List = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		Status_List.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Dispo_Status+"'])[2]")).click();
		
		UpdatePopup.click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}

}
