package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f6 {
	@Test
	public void form2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/bordered/");
		driver.findElement(By.id("user_login")).sendKeys("kakkuu");
		driver.findElement(By.id("user_email")).sendKeys("mallu123@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("kakka@123");
		driver.findElement(By.id("user_confirm_password")).sendKeys("kakka@123");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-43\"]/form/div[2]/button")).click();
		
	}

}
