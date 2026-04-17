package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/alerts");
		
		//locate webelement
		
		driver.findElement(By.id("alertButton")).click();
		
		//switchTo and getText
		
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		
		//accept
		
		alt.accept();
	}

}
