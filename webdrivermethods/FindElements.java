package webdrivermethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		List<WebElement> tag = driver.findElements(By.tagName("meta"));
		
		for (WebElement ele : tag)
		{
			System.out.println(ele.getAttribute("name"));
//			System.out.println(ele.getText());
//			System.out.println(ele.getCssValue("color"));
//			System.out.println(ele.getText());
		}
		
		driver.quit();
		
	}

}
