package actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Hovering {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		// locate fresh
		
		WebElement element = driver.findElement(By.id("nav-link-amazonprime"));
		
		//create obj for actions
		
		Actions act = new Actions(driver);
		
		//movetoelement
		
		act.moveToElement(element).perform();
		
		//movebyoffset
		
//		act.moveByOffset(87, 76).perform();
		
		Thread.sleep(2000);
		
		//take screenshot
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File temp = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\Screenshot/hovss1.png");
		FileHandler.copy(temp, dest);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
