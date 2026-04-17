package webelementmethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebEleMethod {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		
		WebElement ele = driver.findElement(By.xpath("//a[@class='button header__button']"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File source = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\takesSS(webelemeth)/ss.png");
		FileHandler.copy(temp, source);
		
		driver.quit();
		
		
		
	}

}
