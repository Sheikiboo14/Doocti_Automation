package Admin_CRM_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;


public class Update_Campaign extends AdminLogin{
	
	
	String EditCampaignName = "Preview 3";

	String UpdateType ="PREDICTIVE";
	
	String Queue = "smibrahim_8071893401"; 
	
	int bflevel = 50;
	
	float dialratio = 1.2f;
	
	String status = "INACTIVE";
	
	String UpauseCode = "Test";
	
	String Udispo = "Reassign";
	
	String OBno = "8071893401";
	
	String Process = "Tickets";
	
	String template = "Dialer";
	
	String script = "Demo";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Campaigns']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@title='Filter']")).click();
		
		Thread.sleep(1000);
		
		// Filter with name 
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement NameList = driver.findElement(By.xpath("(//div[@role='list'])[6]"));
		
		NameList.findElement(By.xpath("//div[contains(text(),'"+EditCampaignName+"')]")).click();
		
		driver.findElement(By.xpath("//div[@class='v-btn__content'][normalize-space()='Filter']")).click();
		
		Thread.sleep(1000);
		
	
	}
	
		
		@Test(priority = 1 , enabled= false)
		public void UpdateBufferLevelDialRatio() throws InterruptedException {
			
	
			
			//Edit Popup
			
			driver.findElement(By.xpath("(//i[@class='v-icon mr-4 fa fa-pencil-square-o v-icon--link material-icons theme--light green--text'])[1]")).click();
			
			//Buffer Level
			
			driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[28]")).click();
			
			WebElement Bflevel = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
			
			Bflevel.findElement(By.xpath("//div[@class='v-list__tile__title'][normalize-space()='"+bflevel+"']")).click();
		
		
			WebElement Cpage = driver.findElement(By.xpath("//div[@class='container fluid grid-list-xl page']"));
			
			Cpage.click();
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();
			Thread.sleep(1000);
			
			//Dial Ratio
			
			driver.findElement(By.xpath("(//div)[2571]")).click();
			
			Thread.sleep(1000);
			
			WebElement DialRatio = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
			
			DialRatio.findElement(By.xpath("//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='"+dialratio+"']")).click();
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();

			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

		}
		
		@Test(priority = 3 , enabled=true)
		public void Status() throws InterruptedException {

			//Edit Popup
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
		
			driver.findElement(By.xpath("(//div[@class='v-select__selections'])[12]")).click();
			
			Thread.sleep(1000);
			

			WebElement Status = driver.findElement(By.xpath("(//div[@role='list'])[9]"));
			
			Status.findElement(By.xpath("//div[@class='v-list__tile__title'][normalize-space()='"+status+"']")).click();
						
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();

			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

		}
		
		@Test(priority = 4,enabled=true)
		public void CheckPauseCode() throws InterruptedException {
			
			//Edit Popup
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-select__selections'])[8]")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			WebElement Pausecode = driver.findElement(By.xpath("(//div[@role='list'])[12]"));
			
			Pausecode.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list__tile__title'][normalize-space()='"+UpauseCode+"']")).click();
		
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();

			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		}
		
		@Test(priority = 5 ,enabled=true)
		public void UncheckPauseCode() throws InterruptedException {
		
			
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-select__selections'])[8]")).click();
			
			Thread.sleep(1000);
		
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			WebElement Pausecode = driver.findElement(By.xpath("(//div[@role='list'])[12]"));
			
			Pausecode.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list__tile__title'][normalize-space()='"+UpauseCode+"']")).click();
		
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
		
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();

			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

		}
		
		@Test(priority = 6 , enabled = true)
		public void DispoUncheck() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//input[@aria-label='Dispo Status'])[1]")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			WebElement DispoList = driver.findElement(By.xpath("(//div[@role='list'])[10]"));
			
			DispoList.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list__tile__title'][normalize-space()='"+Udispo+"']")).click();
			
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
			
			
		}
		
		@Test(priority = 7 , enabled = true)
		public void DispoCheck() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//input[@aria-label='Dispo Status'])[1]")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			WebElement DispoList = driver.findElement(By.xpath("(//div[@role='list'])[10]"));
			
			DispoList.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list__tile__title'][normalize-space()='"+Udispo+"']")).click();
			
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
			
		}
		
		@Test(priority = 8 , enabled=true)
		public void Outbound() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			driver.findElement(By.xpath("(//input[@aria-label='Outbound Caller ID'])[1]")).click();
			
			Thread.sleep(1000);
			
			WebElement OB = driver.findElement(By.xpath("(//div[@role='list'])[17]"));
			
			OB.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+OBno+"'])[1]")).click();
			
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
			
		}
		
		@Test(priority = 9 , enabled=true)
		public void Dialocheck() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//input[@aria-label='Dial Status'])[1]")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			WebElement DialList = driver.findElement(By.xpath("(//div[@role='list'])[11]"));
			
			DialList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Udispo+"'])[2]")).click();
			
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
			
			
		}
		
		@Test(priority = 10 , enabled = true)
		public void DialoUncheck() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//input[@aria-label='Dial Status'])[1]")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			WebElement DialList = driver.findElement(By.xpath("(//div[@role='list'])[11]"));
			
			DialList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Udispo+"'])[2]")).click();
			
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
			
			
		}
		
		@Test(priority = 11 , enabled=true)
		public void UncheckProcess() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			//Process 
			
			driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
			
			Thread.sleep(1000);
			
			WebElement ProcessList = driver.findElement(By.xpath("(//div[@role='list'])[30]"));
			
			ProcessList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Process+"'])[1]")).click();
			
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
			
		}
		
		@Test(priority = 12 , enabled= true)
		public void CheckProcess() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			//Process 
			
			driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
			
			Thread.sleep(1000);
			
			WebElement ProcessList = driver.findElement(By.xpath("(//div[@role='list'])[30]"));
			
			ProcessList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Process+"'])[1]")).click();
			
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
			
		}
		
		
		@Test(priority = 13 , enabled = true)
		public void QueueUncheck() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			driver.findElement(By.xpath("(//input[@aria-label='Add Queue'])[1]")).click();
			
			Thread.sleep(1000);
			
			WebElement QueueList = driver.findElement(By.xpath("(//div[@role='list'])[13]"));
			
			QueueList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Queue+"'])[1]")).click();
			
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		}
		
		@Test(priority = 14 ,enabled= true)
		public void QueueCheck() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			driver.findElement(By.xpath("(//input[@aria-label='Add Queue'])[1]")).click();
			
			Thread.sleep(1000);
			
			WebElement QueueList = driver.findElement(By.xpath("(//div[@role='list'])[13]"));
			
			QueueList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Queue+"'])[1]")).click();
			
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		}

		
		@Test(priority = 15 , enabled= true)
		public void TemplateUpdate() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));

			driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[6]")).click();
			
			Thread.sleep(1000);
			
			WebElement TemplateList = driver.findElement(By.xpath("(//div[@role='list'])[15]"));
			
			TemplateList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+template+"'])[2]")).click();
			
			Updatepopup.click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

		} 
		
		
		@Test(priority = 16 , enabled= true)
		public void ScriptUpdate() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			// Script
			
			driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[13]")).click();
			
			Thread.sleep(1000);
			
			WebElement ScriptList = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
			
			ScriptList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+script+"'])[1]")).click();
		
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		}
		
		@Test(priority = 17 , enabled= true)
		public void TimeZoneUpdate() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			WebElement Updatepopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
			
			//TimeZone
			
			driver.findElement(By.xpath("(//label[@class='v-label theme--light'][normalize-space()='Timezone'])[1]")).click();
		
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		
		}
		
		@Test(priority = 18 , enabled= true)
		public void CallMaskingUpdate() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			// Call Masking
			
			driver.findElement(By.xpath("(//label[@class='v-label theme--light'][normalize-space()='Call Masking'])[1]")).click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

			
			
		}
		
		@Test(priority = 19 , enabled= true)
		public void OnDemandRecording() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//label[@class='v-label theme--light'][normalize-space()='On Demand Recording'])[1]")).click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

			
		}
		
		
		@Test(priority = 20 , enabled= true)
		public void DNC() throws InterruptedException {
			
			//Edit Popup
			
			driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//label[@class='v-label theme--light'][normalize-space()='DNC check'])[1]")).click();
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
			
			driver.findElement(By.xpath("//button[@title='Filter']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[normalize-space()='Reset']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

			
		}
			
			
			
	}
		

