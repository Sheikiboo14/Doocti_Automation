package PauseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_PauseCode extends AdminLogin {
	
	String pauseCode_Name="Test";
	

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Pause Code Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Pause Codes'])[1]")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Test
	public void Delete_PauseCode() throws InterruptedException {

		// Delete PauseCode

		driver.findElement(By.xpath("//td[text()='QA']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}


}
