package iframe;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Frame {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoqa.com/frames");

		// scroll by amount

		Actions act = new Actions(driver);
		act.scrollByAmount(0, 450).perform();

		// switch the driver control to frame

		driver.switchTo().frame("frame2");

		// getting the text

		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());

		// switch the frame to default webpage

		driver.switchTo().defaultContent();

		// take screen shot

		WebElement ele = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
		File source = ele.getScreenshotAs(OutputType.FILE);
		File temp = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\Screenshot/framess.png");
		FileHandler.copy(source, temp);

//		driver.quit();
	}

}
