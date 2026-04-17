package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default2 { 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.name("q")).sendKeys("computer");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		WebElement cartbtn = driver.findElement(By.xpath("(//input[@type='button'])[2]"));

		Rectangle rect = cartbtn.getRect();

		System.out.println("height, width and x, y values");
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());

		System.out.println("Add to cart enable or not");
		System.out.println(cartbtn.isEnabled());
		cartbtn.click();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//@chatgpt
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement cart = wait.until(
//		        ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Shopping cart')]"))
//		);
//		cart.click();

		
		driver.findElement(By.xpath("//span[(text()='Shopping cart')]")).click();

		
		

		
		
	//	driver.quit();
		
	}

}
