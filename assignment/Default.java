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

public class Default {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("airpods");

		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

		WebElement text = driver.findElement(By.xpath("//span[text()='airpods']"));
		System.out.println(text.getText());

		driver.findElement(
				By.xpath("//img[@alt='Apple AirPods Pro (2nd generation) with MagSafe Case (USB-C) Bluetooth']"))
				.click();

		// switch to child window

		String parent = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parent);
		for (String a : allwindow) {
			driver.switchTo().window(a);
		}

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File source = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\defaultss/ss1.png");
		FileHandler.copy(temp, source);

		Thread.sleep(2000);

		driver.quit();
	}

}
