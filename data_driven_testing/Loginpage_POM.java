package data_driven_testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.POM;

public class Loginpage_POM {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		//obj creation
		
		POM pom = new POM(driver);
		
		pom.getFirstnametxt().sendKeys("Rajesh");
		
		pom.getLastnametxt().sendKeys("Kumar");
		
		pom.getMailtxt().sendKeys("samrajesh1643@gmail.com");
		
		pom.getPasstxt().sendKeys("Gaucho@10");
		
		pom.getConpasstxt().sendKeys("Gaucho@10");

	}

}
