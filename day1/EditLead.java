package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		// driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Revathi");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();

		String title = driver.getTitle();

		System.out.println(title);

		driver.findElement(By.linkText("Edit")).click();

		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");

		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();

		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		if (text.contains("TCS")) {
			System.out.println("Company Name Updated");
		} else {
			System.out.println("Company Name is Not Updated");
		}
	}
}
		
		
		
		/*ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		//driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Revathi");
		
		driver.findElement(By.className("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		
		driver.findElement(By.xpath("//input[@name='submitButton']//td")).click();
		
		
		String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		if(text.contains("TCS")) {
			System.out.println("Company Name Updated");
		}
		else {
			System.out.println("Company Name is Not Updated");
		}
		
	}*/
