package assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Exectionchallenge {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//tr[@class='cart-item-row']"));
		 File temp = ele.getScreenshotAs(OutputType.FILE);
		 File source = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\takesSS(webelemeth)/aSS.png");
		 FileHandler.copy(temp, source);
		
		driver.findElement(By.xpath("//input[@name='applydiscountcouponcode']")).click();
		
		WebElement text = driver.findElement(By.xpath("//div[@class='message']"));
		System.out.println(text.getText());
		
		WebElement text1 = driver.findElement(By.xpath("//div[@class='message']"));
		 File temp1 = text1.getScreenshotAs(OutputType.FILE);
		 File source1 = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\takesSS(webelemeth)/aSS1.png");
		 FileHandler.copy(temp1, source1);
		 
		 driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		 
		 
		 String parent = driver.getWindowHandle();
		 Set<String> child = driver.getWindowHandles();
		 child.remove(parent);
		 
		 for(String a : child) {
			 driver.switchTo().window(a);
	 driver.findElement(By.id("_r_j_")).sendKeys("rajesh10");
			 
			 driver.findElement(By.id("_r_n_")).sendKeys("gaucho@10");
		 }
		 
		 
		
 
//		 driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
//		 
//		 WebElement ele2 = driver.findElement(By.xpath("//div[@id='loginform']"));
//		 File temp2 = ele2.getScreenshotAs(OutputType.FILE);
//		 File source2 = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\takesSS(webelemeth)/aSS2.png");
//		 FileHandler.copy(temp2, source2);	 
		 
	}
}
		 
		
	