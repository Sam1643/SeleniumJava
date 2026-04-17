package selectmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		
		WebElement sel = driver.findElement(By.id("multi"));
		Select food = new Select(sel);
		food.selectByIndex(1);
		food.selectByValue("onion gravy");
//		food.deselectByVisibleText("Eggs");
//		food.deselectByIndex(2);
//		food.deselectAll();
		
		System.out.println("*********************all options***********************");
		
		List<WebElement> options = food.getOptions();
		for (WebElement Element : options) 
		{
			System.out.println(Element.getText());
		}
			
			System.out.println("********************************all selected options************************");
			
			food.deselectAll();
			
			food.selectByIndex(1);
			food.selectByValue("onion gravy");
			
		List<WebElement> selectedopt = food.getAllSelectedOptions();
		for (WebElement selele : selectedopt)
		{
			System.out.println(selele.getText());
			
		}
		
		System.out.println("********************************first selected options************************");
		
		WebElement first = food.getFirstSelectedOption();
		System.out.println(first.getText());
		
		Thread.sleep(3000);
		
		System.out.println("********************************is it (isMultiple)************************");
		
		boolean selmul = food.isMultiple();
		System.out.println(selmul);
		
		driver.quit();
		
		
		
	}

}
