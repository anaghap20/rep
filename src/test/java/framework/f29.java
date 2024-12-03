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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class f29 {
	WebDriver driver;

	@Test

	public void datadriven() throws InterruptedException

	{

	String excelFilePath = "C:\\Users\\Administrator\\Desktop\\Book10.xlsx";

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	driver=new ChromeDriver();

	try {

	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

	Workbook workbook = new XSSFWorkbook(inputStream);

	Sheet sheet = workbook.getSheetAt(0);

	for (int i = 1; i <= sheet.getLastRowNum(); i++) {

	Row row = sheet.getRow(i);

	// Get data from the current row

	String useremail= row.getCell(0).getStringCellValue();

	String username = row.getCell(1).getStringCellValue();
	String password = row.getCell(2).getStringCellValue();
	String firstname = row.getCell(3).getStringCellValue();
	String lastname = row.getCell(4).getStringCellValue();
	String nickname = row.getCell(5).getStringCellValue();
	String website = row.getCell(6).getStringCellValue();
	String textarea = row.getCell(7).getStringCellValue();
	

	driver.get("https://demo.wpeverest.com/user-registration/column-3/");

	driver.manage().window().maximize();

	driver.findElement(By.id("user_email")).sendKeys(username);

	driver.findElement(By.id("user_login")).sendKeys(username);
	driver.findElement(By.id("user_pass")).sendKeys(password);
	driver.findElement(By.id("first_name")).sendKeys(firstname);
	driver.findElement(By.id("last_name")).sendKeys(lastname);
	driver.findElement(By.id("nickname")).sendKeys(nickname);
	driver.findElement(By.id("user_url")).sendKeys(website);
	driver.findElement(By.id("textarea_1530101155")).sendKeys(textarea);
	driver.findElement(By.xpath("//*[@id=\"date_box_1530101157_field\"]/span/input[1]")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input")).sendKeys("00002025");
	WebElement testDropDown=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select"));
	Select dropdown=new Select(testDropDown);
	dropdown.selectByVisibleText("March");
	driver.findElement(By.xpath("//*[@id=\"user-registration-form-32\"]/form/div[4]/button")).click();




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
