package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f12 {
	WebDriver driver;
	@Test(dataProvider="form")
	public void date(String firstname,String lastname,String email,String password ) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.wpeverest.com/user-registration/date-and-time-form/");
        driver.manage().window().maximize();
        driver.findElement(By.id("first_name")).sendKeys(firstname);
        driver.findElement(By.id("last_name")).sendKeys(lastname);
        driver.findElement(By.id("user_email")).sendKeys(email);
        driver.findElement(By.id("user_pass")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"radio_1623131945_no\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"timepicker_1641276686\"]")).click();
        driver.findElement(By.xpath("/html/body/div[7]")).click();
        driver.findElement(By.xpath("//*[@id=\"timepicker_1641276686\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user-registration-form-336\"]/form/div[6]/button")).click();
        
        
	}
	@AfterTest
	public void date1() {
		driver.close();
	}
	@DataProvider(name="form")
	public Object[][]date2(){
		return new Object[][] {
			{"devadas","p","devadasp1@gmail.com","D2e$4adas"}
	};

}}
