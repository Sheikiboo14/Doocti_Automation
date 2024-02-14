package Admin_UsersGroups_CreateFlow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_User extends AdminLogin {
	
//	String user_id ;
//	
//	String user_name ;
//	
//	int user_mobileno ;
//	
//	String user_email ;
//	
//	String  user_password ;
//	
//	String user_role ;
//	
//	String user_group ;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Parameters({"user_id" ,"user_name","user_mobileno","user_email","user_password","user_DID","user_role","user_group"})
	@Test
	public void Create_User(String user_id ,String user_name ,int user_mobileno ,String user_email ,String  user_password ,String user_DID,String user_role ,String user_group ) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Users']")));
		// Going to user page
		
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		
		//Opening Add User Popup
		
		driver.findElement(By.xpath("//div[normalize-space()='Add User']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@class='v-card__text']")));
		
		WebElement UserPopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@class='v-card__text']"));
		
		//UserId
		
		driver.findElement(By.xpath("//div[@id='scrollbar']//input[@aria-label='User Id']")).sendKeys(user_id);
		
		//Name
		
		driver.findElement(By.xpath("//div[@id='scrollbar']//input[@aria-label='Name']")).sendKeys(user_name);
		
		//Mobile Number
		
		WebElement mno = driver.findElement(By.xpath("//div[@id='scrollbar']//input[@aria-label='Mobile Number']"));
		
		mno.sendKeys(Integer.toString(user_mobileno));
		
		//Email Id
		
		driver.findElement(By.xpath("//div[@class='v-input v-text-field theme--light']//input[@aria-label='Email Id']")).sendKeys(user_email);
		
		//Password
		
		driver.findElement(By.xpath("//input[@placeholder='sample@1234']")).sendKeys(user_password);
		
		//Did
		
		driver.findElement(By.xpath("(//label[text()='DID']/following-sibling::div)[3]")).click();
		
		WebElement did_List = driver.findElement(By.xpath("(//div[@role='list'])[7]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='8633537660'])[2]")));
		
		did_List.findElement(By.xpath("(//div[text()='"+user_DID+"'])[2]")).click();
		
		//Scroll Popup
		
		WebElement edit_Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(edit_Popup);
        
		new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();
		
		//Role
		
		driver.findElement(By.xpath("(//label[text()='Role']/following-sibling::div)[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement RoleList = driver.findElement(By.xpath("(//div[@role='list'])[6]"));
		
		RoleList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+user_role+"'])[2]")).click();
		
		UserPopup.click();
		
		//Group
		
		driver.findElement(By.xpath("//label[text()='Group']/following-sibling::div")).click();
		
		Thread.sleep(1000);
		
		WebElement GroupList = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		GroupList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+user_group+"'])[2]")).click();
		
		UserPopup.click();

		//Create New User
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Create'])[2]")).click();
		
		//Close Snaknbar
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")));
		
		driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[3]")));
		
		// Verification
			
		    List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[3]"));
		    
		    boolean flag = false;
		    
		   for(WebElement Data : Alldatas) {
			   
			   String value = Data.getText();
			   
			   if(value.contains(user_email)) {
				   
				   flag = true;
			   }
		   }
		   
		   Assert.assertTrue(flag,"User is Not Created...!");
	}
}
