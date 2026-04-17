package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Execution3 {
	public static void main(String[] args) throws InterruptedException {

		// setup edge browser

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");

		driver.findElement(By.xpath("//input[@class='ytSearchboxComponentInput yt-searchbox-input title']"))
				.sendKeys("vaaste");

		driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//a[@id='video-title' and @class='yt-simple-endpoint style-scope ytd-video-renderer' and @href='/watch?v=BBAyRBTfsOU&list=RDBBAyRBTfsOU&start_radio=1&pp=ygUGdmFhc3RloAcB0gcJCRUKAYcqIYzv']"))
				.click();

		Thread.sleep(3000);

		// its working in edge but some techincal glitch is there

	}

}
