package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("9840693453");
	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		System.out.println("The lead id is 12385");
		
		driver.findElement(By.className("linktext")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("9840693453");
	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		System.out.println("There is No Record in Leads History");
		System.out.println("Lead successfully Deleted");
		
		
		
	}

}
