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

public class Lead_Creation extends AgentLogin {

	/*
	
	String first_Name = "Test";
	
	String last_Name ="Purpose";
	
	String phone_Number ="12246";
	
	String email = "Test@gmail.com";
	
	String address = "India";
	
	String list_Id ="1947";
	
	String tag_Name ="Test";
	
	String alt_Number = "9090909090";
	
	String lead_Status="";
	
	String source_Name="FaceBook";
	
	
	*/
	
	@Parameters({"first_Name","last_Name","phone_Number","email","address","list_Id","tag_Name","alt_Number","lead_Status","source_Name"})
	@Test
	public void Create_Lead(String first_Name ,String last_Name,String phone_Number,String email ,String address,String list_Id ,String tag_Name,String alt_Number,String lead_Status,String source_Name ) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
		
		// Lead Page
		
		driver.findElement(By.xpath("(//div[text()='contact_page'])[1]")).click();
		
		// Create Lead
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='add_circle']")));
		
		driver.findElement(By.xpath("//div[text()='add_circle']")).click();
		
		// First Name
				
		String fname = driver.findElement(By.xpath("//label[text()='First Name']")).getAttribute("class");
		
//		System.out.println(fname);
		
		if(fname.equalsIgnoreCase("label_cls required")) {
			
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(first_Name);
		}
		
		// Last Name
		
		String lname = driver.findElement(By.xpath("//label[text()='Last Name']")).getAttribute("class");
		
//		System.out.println(lname);
		
		if(lname.equalsIgnoreCase("label_cls required")) {
			
			driver.findElement(By.xpath("//label[text()='Last Name']")).sendKeys(last_Name);
		}
		
		// Phone Number
		
		String phno = driver.findElement(By.xpath("//label[text()='Phone Number']")).getAttribute("class");
		
//		System.out.println(phno);
		
		if(phno.equalsIgnoreCase("label_cls required")) {
			
			driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(phone_Number);
		}
		
		//Email
		
		String e_mail = driver.findElement(By.xpath("//label[text()='Email']")).getAttribute("class");
		
//		System.out.println(e_mail);
		
		if(e_mail.equalsIgnoreCase("label_cls required")) {
			
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
		}
		
		//Address
		
		String add = driver.findElement(By.xpath("//label[text()='Address']")).getAttribute("class");
		
//		System.out.println(add);
		
		if(add.equalsIgnoreCase("label_cls required")) {
			
			driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys(address);
		}
		
		//List Id
		
		String list_id = driver.findElement(By.xpath("//label[text()='List Id']")).getAttribute("class");
		
//		System.out.println(list_Id);
		
		if(list_id.equalsIgnoreCase("label_cls required")) {
			
			driver.findElement(By.xpath("//div[text()='List ID']/following-sibling::div")).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+list_Id+"']")));
			
			driver.findElement(By.xpath("//div[text()='"+list_Id+"']")).click();
			
		}
		
		//Tag
		
		String tag = driver.findElement(By.xpath("//label[text()='List Id']")).getAttribute("class");
		
//		System.out.println(tag);
		
		if(tag.equalsIgnoreCase("label_cls required")) {
			
			driver.findElement(By.xpath("//div[text()='Tags']/following-sibling::div")).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+tag_Name+"']")));
			
			driver.findElement(By.xpath("//div[text()='"+tag_Name+"']")).click();
			
		}
		
		//Alternate Number
		
		String alt_num = driver.findElement(By.xpath("//label[text()='Alternative Number']")).getAttribute("class");
		
//		System.out.println(alt_num);
		
		if(alt_num.equalsIgnoreCase("label_cls required")) {
			
			driver.findElement(By.xpath("//input[@placeholder='Alternative Number']")).sendKeys(alt_Number);
		}
		
		//Lead_Status
		
		String lead_Sts = driver.findElement(By.xpath("//label[text()='Lead Status']")).getAttribute("class");
		
//		System.out.println(lead_Sts);
		
		if(lead_Sts.equalsIgnoreCase("label_cls required")) {
			
			driver.findElement(By.xpath("//div[text()='Lead Status']/following-sibling::div")).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+lead_Status+"']")));
			
			driver.findElement(By.xpath("//div[text()='"+lead_Status+"']")).click();
			
		}
		
		//Source
		
		String source = driver.findElement(By.xpath("//label[text()='Source']")).getAttribute("class");
		
//		System.out.println(source);
		
		if(source.equalsIgnoreCase("label_cls required")) {
			
			driver.findElement(By.xpath("//div[text()='source']/following-sibling::div")).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+source_Name+"']")));
			
			driver.findElement(By.xpath("//div[text()='"+source_Name+"']")).click();
			
		}		
		
		// Save the Lead
		
		driver.findElement(By.xpath("//div[text()='save']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='contact_page']")));
		
		driver.findElement(By.xpath("//div[text()='contact_page']")).click();
		
		/*
		
		// Verification
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[contains(@class,'lead table')]//tr//td[4]")));
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'lead table')]//tr//td[4]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			System.out.println(value);
			
			if(value.contains(phno)) {
				
				flag = true;
				
				break;
			}
		}
		
		Assert.assertTrue(flag, "Lead is not Created...!");
		
		*/
		
		//Logout
		
		driver.findElement(By.xpath("(//img[@class='navbar-profile'])[1]")).click();
			
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log Out']")));	
					
		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
	}
	

}
