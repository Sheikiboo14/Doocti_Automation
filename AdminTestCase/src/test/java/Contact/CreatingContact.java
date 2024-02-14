package Contact;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingContact extends AdminLogin{



	
	String contact_Name = "Ibrahim";
	
	String phone_Number = "9090909091";
	
	String expected = "Uploaded Successfully";
	
	String contact_Path ="D:\\Testing File\\Contact_list.csv";	 
	
	String expected_Value ="9090909090";
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Contacts'])[1]")).click();
		
	}
	
	

	@Test(priority = 0,enabled = false)
	
	public void CreateContact() throws InterruptedException, AWTException {
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_J);

		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//i[@class='fas fa-plus']")).click();
		
		Thread.sleep(5000);
		
// Contact Name
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(contact_Name);
		
// Contact Number		
		
		driver.findElement(By.xpath("//input[@placeholder='PhoneNumber']")).sendKeys(phone_Number);

		
	}
	
	@Test
	public void UplodeContact() throws AWTException, InterruptedException {
		
		
		driver.findElement(By.xpath("//div[normalize-space()='Upload']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='file-dummy']")).click();
		
		Thread.sleep(1000);
		
// Robot
	
		Robot rb = new Robot();
		
		StringSelection FilePath = new StringSelection(contact_Path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
// Assertion
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='file-dummy']")).getText(), expected);
		

		
// Close the Popup
		
		driver.findElement(By.xpath("//div[contains(text(),'Close')]")).click();
		
		driver.navigate().refresh();
		
		
// Verification
		
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[3]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(expected_Value)) {
				
				flag = true;
				
				break;
				
			}
			
			Assert.assertTrue(flag,"Contact is not Uploaded...!");
		}
		
		
		
		
	}
}

