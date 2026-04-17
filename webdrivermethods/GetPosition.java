package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {
	public static void main(String[] args) throws InterruptedException  {
		
		
		WebDriver driver = new ChromeDriver();
		
	//	Dimension size = driver.manage().window().getSize();
		
	//		System.out.println(size);
		
		driver.manage().window().setSize(new Dimension(1000, 900));
		
		Thread.sleep(3000);
		
	//	Point position = driver.manage().window().getPosition();
		
	//	System.out.println(position);
		
	//	driver.manage().window().setPosition(new Point(-100, -9));
		
		
		driver.quit();
	}

}
