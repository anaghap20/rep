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

public class f23 {
	WebDriver driver;

	@Test

	public void datadriven() throws InterruptedException

	{

	String excelFilePath = "C:\\Users\\Administrator\\Desktop\\Book3.xlsx";

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	driver=new ChromeDriver();

	try {

	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

	Workbook workbook = new XSSFWorkbook(inputStream);
	Sheet sheet = workbook.getSheetAt(0);

	for (int i = 1; i <= sheet.getLastRowNum(); i++) {

	Row row = sheet.getRow(i);

	// Get data from the current row

	String firstname = row.getCell(0).getStringCellValue();

	String lastname = row.getCell(1).getStringCellValue();
	String address = row.getCell(1).getStringCellValue();
	String city = row.getCell(1).getStringCellValue();
	String state = row.getCell(1).getStringCellValue();
	String zipcode = row.getCell(1).getStringCellValue();
	int phone = row.getPhysicalNumberOfCells();
	String ssn = row.getCell(1).getStringCellValue();
	String username = row.getCell(1).getStringCellValue();
	String password = row.getCell(1).getStringCellValue();
	String confirm = row.getCell(1).getStringCellValue();
	




	driver.get("https://parabank.parasoft.com/parabank/register.htm");

	driver.manage().window().maximize();

	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
	driver.findElement(By.id("customer.firstName")).sendKeys(firstname);
	driver.findElement(By.id("customer.lastName")).sendKeys(lastname);
	driver.findElement(By.id("customer.address.street")).sendKeys(address);
	driver.findElement(By.id("customer.address.city")).sendKeys(city);
	driver.findElement(By.id("customer.address.state")).sendKeys(state);
	driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipcode);
	driver.findElement(By.id("customer.phoneNumber")).sendKeys(String.valueOf(phone));
	driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
	driver.findElement(By.id("customer.username")).sendKeys(username);
	driver.findElement(By.id("customer.password")).sendKeys(password);
	driver.findElement(By.id("repeatedPassword")).sendKeys(confirm);
	driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();



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
