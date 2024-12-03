package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f25 {
	WebDriver driver;

	@Test

	public void datadriven() throws InterruptedException

	{

	String excelFilePath = "C:\\Users\\Administrator\\Desktop\\Book5.xlsx";

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	driver=new ChromeDriver();

	try {

	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

	Workbook workbook = new XSSFWorkbook(inputStream);

	Sheet sheet = workbook.getSheetAt(0);
	
	for(int i=1;i<sheet.getLastRowNum();i++) {

	Row row = sheet.getRow(i);

	// Get data from the current row

	String firstname = row.getCell(0).getStringCellValue();

	String lastname = row.getCell(1).getStringCellValue();
	String username = row.getCell(2).getStringCellValue();
	String email = row.getCell(3).getStringCellValue();
	String password = row.getCell(4).getStringCellValue();
	String confirm = row.getCell(5).getStringCellValue();
	String bio = row.getCell(6).getStringCellValue();




	driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");

	driver.manage().window().maximize();

	driver.findElement(By.id("first_name")).sendKeys(firstname);

	driver.findElement(By.id("last_name")).sendKeys(lastname);
	driver.findElement(By.id("user_login")).sendKeys(username);
	driver.findElement(By.id("user_email")).sendKeys(email);
	driver.findElement(By.id("user_pass")).sendKeys(password);
	driver.findElement(By.id("user_confirm_password")).sendKeys(confirm);
	driver.findElement(By.id("description")).sendKeys(bio);
	driver.findElement(By.xpath("//*[@id=\"user-registration-form-105\"]/form/div[3]/button")).click();


	



	Thread.sleep(3000);

	}

	workbook.close();

	inputStream.close();

	} catch (IOException e) {

	e.printStackTrace();

	}

	// Close the browser

	driver.quit();

	}
	

}

	


