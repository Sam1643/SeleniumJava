package waitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("solostriver");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gaucho@10");
		
//	 	driver.quit();
		
		
	}

}
