package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f18 {
	WebDriver driver;
	@Test(dataProvider="form")
	public void restri(String email,String firstname,String password,String lastname,String number,String country) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/restricted-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.name("radio_1623120379")).click();
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("number_box_1623120412")).sendKeys(number);
		driver.findElement(By.id("country_1629717450")).sendKeys(country);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-304\"]/form/div[2]/button")).click();

	}
	@AfterTest
	public void restri1() {
		driver.close();
	}
	@DataProvider(name="form")
	public Object[][]restri2(){
		return new Object[][] {
			{"kannan12356@gmail.com","kanannn","kannapi%#489mnxj","vk","20","India"}
				
		};
		
		
	}

}
