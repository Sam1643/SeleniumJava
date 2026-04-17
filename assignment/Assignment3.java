package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");

		driver.findElement(By.xpath("//input[@class='ytSearchboxComponentInput yt-searchbox-input title']"))
				.sendKeys("vaaste");

		driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//img[@class='ytCoreImageHost ytCoreImageFillParentHeight ytCoreImageFillParentWidth ytCoreImageContentModeScaleAspectFill ytCoreImageLoaded' and @src='https://i.ytimg.com/vi/BBAyRBTfsOU/hq720.jpg?sqp=-oaymwEnCNAFEJQDSFryq4qpAxkIARUAAIhCGAHYAQHiAQoIGBACGAY4AUAB&rs=AOn4CLBIjiLae1crAheSLWLwoR41fvjacA']"))
				.click();
		
		driver.quit();

		//driver.quit();
	}

}
