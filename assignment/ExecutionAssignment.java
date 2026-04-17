package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionAssignment {
	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		WebDriver driver = new ChromeDriver();

		// copy url and paste
		driver.get("https://www.flipkart.com/");

		// max the window
		driver.manage().window().maximize();

		// stop execution for time specified
		Thread.sleep(2000);

		// gettitle
		String title = driver.getTitle();
		System.out.println(title);

		// geturl
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// getheight
		int heigth = driver.manage().window().getSize().getHeight();
		System.out.println(heigth);

		// get width
		int width = driver.manage().window().getSize().getWidth();
		System.out.println(width);

		// Dimension size = driver.manage().window().getSize();

		// int height = size.getHeight();
		// System.out.println(height);

		// int width = size.getWidth();
		// System.out.println(width);

		// setsize
		driver.manage().window().setSize(new Dimension(600, 700));

		// getposition
		Point position = driver.manage().window().getPosition();
		System.out.println(position);

		// capture window id
		String id = driver.getWindowHandle();
		System.out.println(id);

		// quit the browser
		driver.quit();
	}
}
