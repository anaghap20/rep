package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class f10{
	WebDriver driver;
	@Test(dataProvider="form")
	public void condi(String email,String password,String country) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/conditional-registration-form/");
		driver.findElement(By.xpath("//*[@id=\"radio_1569481639_field\"]/label")).click();
		driver.findElement( By.xpath("//*[@id=\"radio_1569481639_field\"]/ul/li[2]/label")).click();
		driver.findElement(By.name("phone_1569482700")).sendKeys("(730)606-2742");
		driver.findElement(By.id("user_url")).sendKeys("https://en.wikipedia.org/wiki/Lion");
		driver.findElement(By.xpath("//*[@id=\"radio_1569481639_field\"]/ul/li[2]/label")).click();
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("country_1569483038")).sendKeys(country);
		driver.findElement(By.xpath("//*[@id=\"check_box_1569483464_field\"]/ul/li/label")).click();
		driver.findElement(By.id("textarea_1569483045")).sendKeys("helo");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-116\"]/form/div[5]/button")).click();
		
		
	}
	@AfterTest
	public void condi1() {
		driver.close();
	}
	@DataProvider(name="form")
	public Object[][]condi2(){
		return new Object[][] {
			{"selina@gmail.com","njdn453@nc","India"}
			
		};
		
	}

}
