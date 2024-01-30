package User;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_User extends AdminLogin {
	
	
	String user_Email = "smibrahim_agent06@doocti.com";
		
	String user_Status = "Inactive";
	
	String user_Group = "Testing";
	
	String user_Role ="Administrator";
	
	String mobileNo = "9876543208910";
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		// User Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Users'])[1]")).click();
		
		Thread.sleep(1000);
		
	}
	


	@Test(priority = 0)
	public void Update_Status() throws Exception {
		
		Actions action = new Actions(driver);
		
		// Edit User Popup
		
		driver.findElement(By.xpath("//td[text()='"+user_Email+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement Editpopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active']//div[@class='v-card v-sheet theme--light']"));
		
		//Scroll Popup
		
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(Editpopup);
        
		new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();

		// User Status
		
		driver.findElement(By.xpath(" (//div[@class='v-input__slot'])[9]")).click();
		
		Thread.sleep(1000);
		
		
		WebElement UserStatus = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		UserStatus.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+user_Status+"'])[1]")).click();

		Editpopup.click();
		

		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(3000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
		
		// Verifiaction
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[4]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(user_Status)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag, "UserEmail is Not Updated...!");
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
	}
	

	

	@Test(priority=1)
	public void Update_UserMobileNo() throws InterruptedException {
		
		
		// Edit User Popup
		
		driver.findElement(By.xpath("//td[text()='"+user_Email+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[4]"));
		
		// Mobile Number
		
		WebElement MobileNumber = driver.findElement(By.xpath("(//input[@aria-label='Mobile Number'])[1]"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(MobileNumber).sendKeys(Keys.BACK_SPACE).build().perform();
		
		MobileNumber.sendKeys(mobileNo);

		
		// Update Mobile No
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(3000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
		
		// Verifiaction
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[2]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(mobileNo)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag, "Mobile Number is Not Updated...!");
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
	}
	
	@Test(priority = 2)
	public void Update_UserGroup() throws InterruptedException {
		

		// Edit User Popup
		
		driver.findElement(By.xpath("//td[text()='"+user_Email+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[4]"));

		//Scroll Popup
		
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(EditPopup);
        
		new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();
		
		
		// User User Group
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement UserStatus = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		UserStatus.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+user_Group+"'])[1]")).click();

		EditPopup.click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(3000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
		
		// Verification
		
		driver.findElement(By.xpath("//td[text()='"+user_Email+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text']")).click();

		Thread.sleep(1000);
		
		//Scroll Popup
		
//		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(EditPopup);
        
//		new Actions(driver)
//                .scrollFromOrigin(scrollOrigin, 0, 200)
//                .perform();
//		
//		String groupName= UserStatus.getAttribute("value");
//		
//		boolean flag =false;
//		
//		if(groupName.contains(user_Group)) {
//			
//			flag = true;
//		}
//
//		Assert.assertTrue(flag,"UserGroup is Not Updated...!");
//		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		

	}
	
	@Test(priority=3)
	public void Update_Role() throws InterruptedException {
		

		// Edit User Popup
		
		driver.findElement(By.xpath("//td[text()='"+user_Email+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[4]"));
		
		// User User Role
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement UserRole = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		UserRole.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+user_Role+"'])[1]")).click();

		EditPopup.click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(3000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
		
		//Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[5]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(user_Role)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag, "Mobile Number is Not Updated...!");
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		

	}

	
	

}
