package Custom_Builder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_LeadTemplates extends AdminLogin {
	
	String Template_Industry ="IT";
	
	String Template_Domain ="Sales";
	
	String Template_Name = "Testing";
	
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(text(),'Custom Builder')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Lead Templates'])[1]")).click();
	}
	
	@Test
	public void Create_LeadTemplates() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Template'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		// Select Industry
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement IndustryList = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		IndustryList.findElement(By.xpath("(//div[contains(text(),'"+Template_Industry+"')])[1]")).click();
		
		EditPopup.click();
		
		// Select Domain
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement DomainList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		DomainList.findElement(By.xpath("(//div[contains(text(),'"+Template_Domain+"')])[1]")).click();
		
		EditPopup.click();
		
		// Template Title
		
		driver.findElement(By.xpath("(//input[@placeholder='Please Enter Form Title'])[1]")).sendKeys(Template_Name);

		
		
	}

}
