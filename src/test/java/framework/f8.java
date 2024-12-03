package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f8 {
	WebDriver driver;
	@Test(dataProvider="file")
	public void form(String email,String login,String firstname,String lastname,String password,String confirm,String nick) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-2/");
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_login")).sendKeys(login);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("user_confirm_password")).sendKeys(confirm);
		driver.findElement(By.id("nickname")).sendKeys(nick);
		driver.findElement(By.id("user_url")).sendKeys("https://en.wikipedia.org/wiki/Flower");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-16\"]/form/div[5]/button")).click();

	}
	@AfterTest
	public void form1() {
		driver.close();
		
	}
	@DataProvider(name="file")
	public Object[][]form2(){
		return new Object[][] {
			{"praayag@gmail.com","paagu","praayag","v","pr%hyem2782","pr%hyem2782","sukkudu"}
			};
			
		
	}

}
