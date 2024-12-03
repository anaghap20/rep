package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f5 {
	WebDriver driver;
	@Test(dataProvider="file")
	public void form1(String name,String last,String login,String email, String password,String confirm,String description  ){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
	driver.findElement(By.id("first_name")).sendKeys(name);
	driver.findElement(By.id("last_name")).sendKeys(last);
	driver.findElement(By.id("user_login")).sendKeys(login);
	driver.findElement(By.id("user_email")).sendKeys(email);
	driver.findElement(By.id("user_pass")).sendKeys(password);
	driver.findElement(By.id("user_confirm_password")).sendKeys(confirm);
	driver.findElement(By.id("description")).sendKeys(description);
	driver.findElement(By.xpath("//*[@id=\"user-registration-form-105\"]/form/div[3]/button")).click();

	}
	@AfterTest
	public void form2() {
		driver.close();
	}
	@DataProvider(name="file")
	public Object[][]form3(){
		return new Object[][] {
			{"saravanan","pp","sarvnum","saravanpp@gmail.com","S4arvn2jjhcn","S4arvn2jjhcn","LIC"}
			
		};
		
	}

}
