package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		// driver.findElement(By.xpath("//label[text()='Good']")).click();

		driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@id='pollanswers-1']")).click();

		// Thread.sleep(3000);

		// driver.quit();
	}

}
