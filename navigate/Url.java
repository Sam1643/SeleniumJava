package navigate;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	public static void main(String[] args) throws MalformedURLException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.navigate().to(new URL("https://www.flipkart.com/"));
		
	}

}
