package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	public static void main(String[] args) {
		
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		
		//scroll by amount
		
		act.scrollByAmount(0, 2000).perform();
	}

}
