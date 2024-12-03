package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f14<webdriver> {
	WebDriver driver;
	@Test(dataProvider="file")
	public void reg1(String login,String email,String password,String confirmpassword) {
		System.setProperty("webdriver.chrone.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/flat/");
		driver.findElement(By.id("user_login")).sendKeys(login);
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("user_confirm_password")).sendKeys(confirmpassword);
		driver.findElement(By.cssSelector("#user-registration-form-44 > form > div.ur-button-container > button")).click();

	}
	@AfterTest
	public void reg2() {
		driver.close();
	}
	@DataProvider(name="file")
	public Object[][]reg3(){
		return new Object[][] {
			{"anu345","anu123@gmail.com","jcekcyhecnjm@333m","jcekcyhecnjm@333m"}
			
		};
		
	}

}
