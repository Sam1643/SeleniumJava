package xpath;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class XpathBysvg {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		WebElement image = driver.findElement(By.xpath("//*[name()='svg' and @class='x1lliihq x1n2onr6 x173jzuc']"));
		File temp = image.getScreenshotAs(OutputType.FILE);
		File source = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\Screenshot/svgss.png");
		FileHandler.copy(temp, source);
	}

}
