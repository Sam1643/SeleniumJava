package webdrivermethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {public Launch_Browser() 
{
	
}
public static void main(String[] args) throws InterruptedException 
{
	
	//import webDriver
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	//copy the uRl and paste it
	driver.get("https://www.naukri.com/mnjuser/homepage");
	
	//stop execution for certain time 3000=3s
	Thread.sleep(3000);
	
	//fullscreen
	driver.manage().window().fullscreen();
	
	Thread.sleep(3000);
	
	//get the title of the webPage
	String title = driver.getTitle();
	System.out.println(title);
	
	//get the uRl of the webPage
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	//getsize
    Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	
	//quit the webPage
	driver.quit();
	
}
}