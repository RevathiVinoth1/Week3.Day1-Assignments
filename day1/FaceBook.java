package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(("//a[text()='Create New Account']"))).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Revathi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vinoth");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("999377HHHDkjjshjx");
		//driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("revathivinoth05@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456789");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days=new Select(day);
		days.selectByValue("1");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months=new Select(month);
		months.selectByValue("8");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years=new Select(year);
		years.selectByValue("1991");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}
	

}
