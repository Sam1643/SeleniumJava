package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\Screenshot/ss1.png");
		FileHandler.copy(temp, dest);
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File source = new File("./Screenshot/ss.png/");
//		FileHandler.copy(temp, source);

		driver.quit();

	}

}
