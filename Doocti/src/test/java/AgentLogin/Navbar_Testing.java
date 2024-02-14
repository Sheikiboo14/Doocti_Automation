package AgentLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Navbar_Testing extends AgentLogin{
	
	
	String dashboard_Url="https://web-dev.doocti.com/v2.1.106/dashboard";
	
	String leadpage_Url="https://web-dev.doocti.com/v2.1.106/leads";
	
	String contactpage_Url="https://web-dev.doocti.com/v2.1.106/contact";
	
	String meetingpage_Url="https://web-dev.doocti.com/v2.1.106/meeting";
	
	String ticketpage_Url="https://web-dev.doocti.com/v2.1.106/tickets";
	
	String scriptpage_Url="https://web-dev.doocti.com/v2.1.106/script";
	
	String voicemail_Url ="https://web-dev.doocti.com/v2.1.106/voicemail";
		
	
	
	@Test(priority=0)
	public void lead_Page() {
		
		driver.findElement(By.xpath("(//div[@class='material-icons navbar-icons'])[1]")).click();
		
		String actual_Url = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, leadpage_Url);
		
		driver.findElement(By.xpath("//div[text()='dashboard']")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);

	}
	
	@Test(priority=1)
	public void contact_Page() {
		
		driver.findElement(By.xpath("//div[text()='contacts']")).click();
		
		String actual_Url = driver.getCurrentUrl();

		Assert.assertEquals(actual_Url, contactpage_Url);
		
		driver.findElement(By.xpath("//div[text()='dashboard']")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);
		
		
	}
	
	@Test(priority=2)
	public void meeting_Page() {
		
		driver.findElement(By.xpath("//div[text()='group']")).click();
		
		String actual_Url = driver.getCurrentUrl();

		Assert.assertEquals(actual_Url, meetingpage_Url);
		
		driver.findElement(By.xpath("//div[text()='dashboard']")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);
		
		
	}
	
	@Test(priority=3)
	public void ticket_Page() {
		
		driver.findElement(By.xpath("//div[text()='confirmation_number']")).click();
		
		String actual_Url = driver.getCurrentUrl();

		Assert.assertEquals(actual_Url, ticketpage_Url);
		
		driver.findElement(By.xpath("//div[text()='dashboard']")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);
		
		
	}
	
	@Test(priority=4)
	public void script_Page() {
		
		driver.findElement(By.xpath("(//img[@class='navbar-logo-img navbar-menu-icon navbar-whatsapp'])[1]")).click();
		
		String actual_Url = driver.getCurrentUrl();

		System.out.println(actual_Url);
		
		Assert.assertEquals(actual_Url, scriptpage_Url);
		
		driver.findElement(By.xpath("//div[text()='dashboard']")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);
		
		
	}
	
	@Test(priority=5)
	public void menu_List() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.xpath("//div[text()='list']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dropdown-menu show']")));
		
		boolean isDisplayed = driver.findElement(By.xpath("//div[@class='dropdown-menu show']")).isDisplayed();
		
//		System.out.println(isDisplayed);
		
		Assert.assertTrue(isDisplayed);
	}
	
	@Test(priority=6)
	public void menu_ListLead() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//		driver.findElement(By.xpath("//div[text()='list']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dropdown-menu show']")));
		
		WebElement Menu_List= driver.findElement(By.xpath("//div[@class='dropdown-menu show']"));
		
		Menu_List.findElement(By.xpath("(//div[text()='contact_page'])[2]")).click();
		
		String actual_Url = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, leadpage_Url);
		
		Menu_List.findElement(By.xpath("(//div[text()='dashboard'])[2]")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);

	}

	@Test(priority=7)
	public void menu_ListMeeting() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//		driver.findElement(By.xpath("//div[text()='list']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dropdown-menu show']")));
		
		WebElement Menu_List= driver.findElement(By.xpath("//div[@class='dropdown-menu show']"));
		
		Menu_List.findElement(By.xpath("(//div[text()='group'])[2]")).click();
		
		String actual_Url = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, meetingpage_Url);
		
		Menu_List.findElement(By.xpath("(//div[text()='dashboard'])[2]")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);

	}
	

	@Test(priority=8)
	public void menu_ListTicket() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//		driver.findElement(By.xpath("//div[text()='list']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dropdown-menu show']")));
		
		WebElement Menu_List= driver.findElement(By.xpath("//div[@class='dropdown-menu show']"));
		
		Menu_List.findElement(By.xpath("(//div[text()='confirmation_number'])[2]")).click();
		
		String actual_Url = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, ticketpage_Url);
		
		Menu_List.findElement(By.xpath("(//div[text()='dashboard'])[2]")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);

	}


	@Test(priority=9)
	public void menu_ListContact() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//		driver.findElement(By.xpath("//div[text()='list']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dropdown-menu show']")));
		
		WebElement Menu_List= driver.findElement(By.xpath("//div[@class='dropdown-menu show']"));
		
		Menu_List.findElement(By.xpath("(//div[text()='contacts'])[2]")).click();
		
		String actual_Url = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, contactpage_Url);
		
		Menu_List.findElement(By.xpath("(//div[text()='dashboard'])[2]")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);

	}
	
	@Test(priority=10)
	public void menu_ListVoiceMail() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//		driver.findElement(By.xpath("//div[text()='list']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dropdown-menu show']")));
		
		WebElement Menu_List= driver.findElement(By.xpath("//div[@class='dropdown-menu show']"));
		
		Menu_List.findElement(By.xpath("(//div[text()='voicemail'])[1]")).click();
		
		String actual_Url = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, voicemail_Url);
		
		Menu_List.findElement(By.xpath("(//div[text()='dashboard'])[2]")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);

	}
	
	@Test(priority=11)
	public void menu_ListScript() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//		driver.findElement(By.xpath("//div[text()='list']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dropdown-menu show']")));
		
		WebElement Menu_List= driver.findElement(By.xpath("//div[@class='dropdown-menu show']"));
		
		Menu_List.findElement(By.xpath("//div[text()='Script']")).click();
		
		String actual_Url = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, scriptpage_Url);
		
		Menu_List.findElement(By.xpath("(//div[text()='dashboard'])[2]")).click();
		
		actual_Url= driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Url, dashboard_Url);

	}
	
	
	@Test(priority=12)
	public void Noti_tab() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.xpath("//img[@class='navbar-notification-icon']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@role='dialog'])[1]")));
		
		boolean isDisplayed = driver.findElement(By.xpath("(//div[@role='dialog'])[1]")).isDisplayed();
		
		System.out.println(isDisplayed);
		
		Assert.assertTrue(isDisplayed);
		
		// Close Notification Tab
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='close']")));
		
		driver.findElement(By.xpath("//span[text()='close']")).click();
		
		
	}
	
	@Test(priority=13)
	public void Profile_tab() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//img[@class='navbar-profile'])[1]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@role='dialog'])[1]")));
		
		boolean isDisplayed = driver.findElement(By.xpath("(//div[@role='dialog'])[1]")).isDisplayed();
				
		Assert.assertTrue(isDisplayed);
		
		// Close Notification Tab
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='material-icons navbar-close '])[1]")));
		
		driver.findElement(By.xpath("(//span[@class='material-icons navbar-close '])[1]")).click();
		

	}
	
	
	@Test(priority=14)
	public void Agent_Logout() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//img[@class='navbar-profile'])[1]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log Out']")));
		
		
		// Logout
		
		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
		

	}

}
