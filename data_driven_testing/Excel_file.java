package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_file {
	
		public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\automation code\\selenium\\src\\test\\resources\\Untitled spreadsheet.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("sheet1");
		
//		String url = sh.getRow(0).getCell(0).getStringCellValue();
//		String firstname = sh.getRow(1).getCell(0).getStringCellValue();
//		String lastname = sh.getRow(2).getCell(0).getStringCellValue();		
//		String mail = sh.getRow(3).getCell(0).getStringCellValue();
//		String pswd = sh.getRow(4).getCell(0).getStringCellValue();
//		String conpswd = sh.getRow(5).getCell(0).getStringCellValue();
		
		String url1 = sh.getRow(1).getCell(1).getStringCellValue();
		String username1 = sh.getRow(2).getCell(1).getStringCellValue();
		String pswd1 = sh.getRow(3).getCell(1).getStringCellValue();		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get(url);
//		driver.findElement(By.id("FirstName")).sendKeys(firstname);
//		driver.findElement(By.id("LastName")).sendKeys(lastname);	
//		driver.findElement(By.id("Email")).sendKeys(mail);
//		driver.findElement(By.id("Password")).sendKeys(pswd);
//		driver.findElement(By.id("ConfirmPassword")).sendKeys(conpswd);
		
		driver.get(url1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd1);
		
		System.out.println("registration successfull");
	
//		driver.quit();
	}

}
