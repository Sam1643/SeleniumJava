package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_pop_up {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://smallpdf.com/pdf-converter");
		
		//search for input tag and check input="file" is there or not
		//copy the file 
		//paste it in src/test/resource and copy path 
		//paste it in sendkeys
		
		driver.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\anila\\eclipse-workspace\\Selenium\\src\\test\\resources\\JD - Associate Developer Intern - Customer Success.pdf");
		
		
	}
	

}
