package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prompt {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoqa.com/alerts");
		
		//scroll by amount

		Actions act = new Actions(driver);
		act.scrollByAmount(0, 400).perform();
		
		//locate webelement

		driver.findElement(By.id("promtButton")).click();
		
		//switchTo and getText

		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());

		alt.sendKeys("Ronaldinho");

		alt.accept();

		driver.quit();

	}

}