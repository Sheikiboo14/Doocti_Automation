package User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Assign_UserQueue extends AdminLogin {
	
	String UserId = "smibrahim_agent04";
	
	String Queue1 = "smibrahim_8071893401";
	
	String Queue2 ="Test";
	
	int User_rank1 = 1;
	
	int User_rank2 = 2;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
	//Going to User Page
		
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		
	//Opening Filter Tab
		
		driver.findElement(By.xpath("//i[@class='fas fa-filter']")).click();
		
	//Filter with UserId
		
		driver.findElement(By.xpath("//input[@aria-label='UserId']")).sendKeys(UserId);
		
	// Apply the Filter
		
		driver.findElement(By.xpath("//div[@class='v-btn__content'][normalize-space()='Filter']")).click();
		
	// Close the filter tab
		
		driver.findElement(By.xpath("//i[@class='fas fa-close']")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Test(priority =0, enabled = false)
	public void Add_Single_Queue() throws InterruptedException {
		

	// Opening Assign Queue popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
	
		Thread.sleep(1000);
		
	// Adding New Queue
		
		driver.findElement(By.xpath("//div[@class='flex queue_user xs6']//div[@class='v-select__selections']")).click();
		
		Thread.sleep(1000);
		
		WebElement AssignQueuePopup =driver.findElement(By.xpath("(//div[@id='scroll-target'])[1]"));
		
		WebElement QueueList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		QueueList.findElement(By.xpath("//div[contains(text(),'"+Queue1+"')]")).click();
		
		AssignQueuePopup.click();
		
		//User rank
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement Userrank_List = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		Userrank_List.findElement(By.xpath("//div[@class='v-list__tile__title'][normalize-space()='"+User_rank1+"']")).click();
		
		AssignQueuePopup.click();
		
		//Saving the Queue
		
		driver.findElement(By.xpath("//div[normalize-space()='Save']")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();
		
	
	}
	
	@Test(priority =1)
	public void Add_Multiple_Queue() throws InterruptedException {
		
	// Opening Assign Queue popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
	
		Thread.sleep(1000);
		
		
	// Adding New Queue
		
		driver.findElement(By.xpath("//div[@class='flex queue_user xs6']//div[@class='v-select__selections']")).click();
		
		Thread.sleep(1000);
		
		WebElement AssignQueuePopup =driver.findElement(By.xpath("(//div[@id='scroll-target'])[1]"));
		
		WebElement QueueList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		QueueList.findElement(By.xpath("//div[contains(text(),'"+Queue1+"')]")).click();
		
		AssignQueuePopup.click();
		
	//User Rank
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement UserRankList = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		UserRankList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+User_rank1+"'])[1]")).click();
		
	//Adding another row
		
		driver.findElement(By.xpath("//i[@class='v-icon icon v-icon--link mdi mdi-plus theme--light primary--text']")).click();

		
	// Adding New Queue
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[3]")).click();
		
		Thread.sleep(1000);
		
//		WebElement AssignQueuePopup =driver.findElement(By.xpath("(//div[@id='scroll-target'])[1]"));
//		
//		WebElement QueueList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		QueueList.findElement(By.xpath("//div[contains(text(),'"+Queue2+"')]")).click();
		
		AssignQueuePopup.click();
		
	//User Rank
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[4]")).click();
		
		Thread.sleep(1000);
		
//		WebElement UserRankList = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		UserRankList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+User_rank2+"'])[1]")).click();
		
		
	//Saving the Queue
		
		driver.findElement(By.xpath("//div[normalize-space()='Save']")).click();
		
		Thread.sleep(1000);
		
	//Close Snakbar
		
		driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();
		
	
	}
}
