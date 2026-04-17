package ismethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		WebElement check = driver.findElement(By.cssSelector("button[type='submit']"));
		System.out.println("check login button is displayed or not");
		System.out.println(check.isDisplayed());
//		System.out.println("before entering usn and pswd");
//		driver.findElement(By.name("username")).se
//		
		
	}

}
