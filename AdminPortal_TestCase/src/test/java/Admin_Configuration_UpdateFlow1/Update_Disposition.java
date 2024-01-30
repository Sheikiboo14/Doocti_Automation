package Admin_Configuration_UpdateFlow1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Disposition extends AdminLogin {
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Dispo Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Dispositions'])[1]")).click();
		
		
		Thread.sleep(1000);
	}
	
	@Parameters({"dispo_Name","dispo_Status"})
	@Test
	public void Update_Status(String dispo_Name, String dispo_Status) throws InterruptedException {
		
		// Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+dispo_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Status 
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement Status_List = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		Status_List.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dispo_Status+"'])[2]")).click();
		
		UpdatePopup.click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='dispo_Name']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue, dispo_Status, "Dispo Status is Not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
/*
	
	@Parameters({"dispo_Name","dispo_Action"})
	@Test
	public void Update_Action(String dispo_Name,String dispo_Action ) throws InterruptedException 
	{
		
		// Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+dispo_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		// Action
		
		WebElement ActionList= driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[1]"));
		
		Thread.sleep(1000);
		
		ActionList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dispo_Action+"'])[1]")).click();
		
		UpdatePopup.click();
		
		// Update the Disposition
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		//Verfication
		
		driver.findElement(By.xpath("//td[text()='dispo_Name']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		String actualvalue=driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).getText();
		
		Assert.assertEquals(actualvalue, dispo_Action, "Dispo Action is Not Updated...!");
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	*/


}
