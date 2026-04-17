package actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ClickingOperations {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		// create obj
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='EN']"));
		Actions act = new Actions(driver);
		
		//double click target element
		
		act.doubleClick(ele).perform();
		WebElement cart = driver.findElement(By.id("nav-cart-count"));
		
		//contextclick target element
		
		act.contextClick(cart).perform();
		
		//takes ss
		
		WebElement cartss = driver.findElement(By.id("nav-cart"));
		File temp = cartss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\Screenshot/actss1.png");
		FileHandler.copy(temp, dest);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}


