package Disposition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Dispo_Delete extends AdminLogin {
	
	String DispoName = "Dummy";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Dispo Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Dispositions'])[1]")).click();
		

		
		
	}
	
	@Test
	public void Delete_Dispo() throws InterruptedException {
		
		// Open Filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterTab = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement DispoList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		DispoList.findElement(By.xpath("(//div[contains(text(),'"+DispoName+"')])[1]")).click();
		
		FilterTab.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Delete Dispo
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Delte Popup
		
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		
		
	}


}
