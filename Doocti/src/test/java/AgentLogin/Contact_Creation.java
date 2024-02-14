package AgentLogin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Contact_Creation extends AgentLogin {
	
	String conatct_Name ="Testing";
	
	String contact_Number ="9809809809";
	
	@Parameters({"conatct_Name","contact_Number"})
	@Test
	public void Create_Contact(String conatct_Name, String contact_Number ) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// Contact Page
		
		driver.findElement(By.xpath("//div[text()='contacts']")).click();
		
		// Create Contact
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='add_circle']")));
		
		driver.findElement(By.xpath("//div[text()='add_circle']")).click();
		
		// Contact Number
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Name']")));
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(conatct_Name);
		
		// Phone Number
		
		driver.findElement(By.xpath("//input[@placeholder='PhoneNumber']")).sendKeys(contact_Number);
		
		// Save Contact Number
		
		driver.findElement(By.xpath("//div[text()='save']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='contacts']")));
		
		driver.findElement(By.xpath("//div[text()='contacts']")).click();
		
		// Verification
		
		wait.until(ExpectedConditions.urlMatches("https://web-dev.doocti.com/v2.1.106/contact"));
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'lead table')]//tr//td[3]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(contact_Number)) {
				
				flag = true;
			}
			
		}
		
		Assert.assertTrue(flag, "Contact is not Created...!");
		
		//Logout
		

		driver.findElement(By.xpath("(//img[@class='navbar-profile'])[1]")).click();
			
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log Out']")));	
			
		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
			
	}
	

}
