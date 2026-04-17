package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbystartswith {
	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		WebElement get = driver.findElement(By.xpath("//li[starts-with(text(),'No customer')]"));
		System.out.println(get.getText()); 
		
		driver.quit();
		
	}

}
