package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f7 {
	WebDriver driver;
	@Test(dataProvider="file")
	public void fom(String login,String email,String password,String confirm) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-1/");
		driver.manage().window().maximize();
        driver.findElement(By.id("user_login")).sendKeys(login);
        driver.findElement(By.id("user_email")).sendKeys(email);
        driver.findElement(By.id("user_pass")).sendKeys(password);
        driver.findElement(By.id("user_confirm_password")).sendKeys(confirm);
        driver.findElement(By.xpath("//*[@id=\"user-registration-form-47\"]/form/div[2]/button")).click();
        
	}
	@AfterTest
	public void fom1() {
		driver.close();
	}
	@DataProvider(name="file")
	public Object[][]fom2(){
		return new Object[][] {
			{"anumo","annu23@gmail.com","%kmfhfcji2ujwsajk","%kmfhfcji2ujwsajk"}
		};
	}
	

}
