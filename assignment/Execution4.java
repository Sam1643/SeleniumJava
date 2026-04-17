package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("laptop");

		driver.findElement(By.xpath("//input[@id='small-searchterms']/following-sibling::input")).click();
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.xpath("//label[text()='Good']/preceding-sibling::input")).click();

//		Thread.sleep(2000);
		
//		driver.quit();

	}
}
