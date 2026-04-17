package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	WebDriver driver;
	
	//store the WE
	
	@FindBy(id="FirstName")
	private WebElement firstnametxt;
	
	@FindBy(id="LastName")
	private WebElement lastnametxt;
	
	@FindBy(id="Email")
	private WebElement mailtxt;
	
	@FindBy(id="Password")
	private WebElement passtxt;
	
	@FindBy(id="ConfirmPassword")
	private WebElement conpasstxt;
	
	//initialization
	
	public POM(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstnametxt() {
		return firstnametxt;
	}

	public WebElement getLastnametxt() {
		return lastnametxt;
	}

	public WebElement getMailtxt() {
		return mailtxt;
	}

	public WebElement getPasstxt() {
		return passtxt;
	}

	public WebElement getConpasstxt() {
		return conpasstxt;
	}
}
