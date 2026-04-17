package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("./html/body/div[4]/div/div[1]/div[3]/form/input[1]")).sendKeys("laptop");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}
}
