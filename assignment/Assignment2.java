package assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

		WebElement text = driver.findElement(By.xpath("//span[text()='samsung']"));
		System.out.println(text.getText());

		driver.findElement(By.xpath("//div[contains(text(),'Samsung Galaxy')]")).click();

		Thread.sleep(2000);

		String parent = driver.getWindowHandle();
		Set<String> everyid = driver.getWindowHandles();
		everyid.remove(parent);
		for (String a : everyid) {
			driver.switchTo().window(a);
		}

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\Screenshot//new.png");
		FileHandler.copy(source, dest);

		driver.quit();

	}

}
