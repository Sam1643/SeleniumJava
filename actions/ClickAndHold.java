package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");

		//cancel x mark
		
		driver.findElement(By.cssSelector("span[class='ng-tns-c2785778308-3 icon-cancel']")).click();
		
		//enter password
		
		driver.findElement(By.id("password")).sendKeys("gaucho@10");
		
		//locate eye icon
		
		WebElement ele = driver.findElement(By.cssSelector("button[tabindex='0']"));
		
		//creat obj

		Actions act = new Actions(driver);
		
		//click and hold(WE address)
		
		act.clickAndHold(ele).perform();

	}

}
