package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f33 {
	WebDriver driver;
	@Test
	public void store() {
		System.setProperty("webdriver.driver.chromechromedriver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("anagha3454");
		driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("vjxsnak#$%^&");
		driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")).click();)
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("anagha3454");
		driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("vjxsnak#$%^&");
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		
		
	}
}


