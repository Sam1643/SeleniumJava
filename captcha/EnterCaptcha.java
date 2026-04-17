package captcha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class EnterCaptcha {
	
	public static void main(String[] args) throws IOException, TesseractException {
		
		ChromeOptions opt = new ChromeOptions();
		
		//disable the notification
		
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//click on ok button
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		//click on login
		
		driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
		
		//locate the captcha and take screeenshot
		
		WebElement element = driver.findElement(By.xpath("//img[@alt='Captcha Image here']"));
		File source = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\anila\\eclipse-workspace\\Selenium\\Screenshot/captchass.png");
		FileHandler.copy(source, dest);
		
		//create obj for tesseract and copy the path of testdata and paste and replace spaces
		
		Tesseract tess1 = new Tesseract();
		tess1.setDatapath("C:\\Users\\anila\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
		String text = tess1.doOCR(dest);
		String text1 = text.replace(" ", "");
		System.out.println(text1);
		driver.findElement(By.id("captcha")).sendKeys(text1);
		
		
		
		
		
		
	}

}
