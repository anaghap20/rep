package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f16 {
	WebDriver driver;
	@Test(dataProvider="form")
	public void pay(String email,String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/payment-with-stripe-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-351\"]/form/div[2]/button")).click();
		
	}
	@AfterTest
	public void pay1(){
		driver.close();
		
	}
	@DataProvider(name="form")
	public Object[][]pay2(){
		return new Object[][] {
			{"sanju1@gmail.com","S4nju123%"}
		};
		
	}

}
