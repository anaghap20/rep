package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f15 {
	@Test
	public void form10() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/multi-step-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys("sreenath");
		driver.findElement(By.id("user_email")).sendKeys("sree46@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Sree478&%");
		driver.findElement(By.id("user_confirm_password")).sendKeys("Sree478&%");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-107\"]/form/div[8]/button[2]")).click();
		driver.findElement(By.id("first_name")).sendKeys("sreenand");
		driver.findElement(By.id("last_name")).sendKeys("p");
		driver.findElement(By.id("user_url")).sendKeys("https://www.amazon.in/Fans/b?ie=UTF8&node=2083427031");
		driver.findElement(By.name("radio_1569440596")).click();
		driver.findElement(By.xpath("//input[starts-with(@id,'phone_1569440626')]")).sendKeys("(234) 677-7898");
		driver.findElement(By.xpath("//*[@id=\"date_box_1569440641_field\"]/span/input[1]")).click();
		driver.findElement(By.cssSelector("body > div.flatpickr-calendar.animate.arrowLeft.open.arrowBottom > div.flatpickr-months > div > div > div > input")).sendKeys("0002014");
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")).sendKeys("October");
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[18]")).click();
		driver.findElement(By.id("country_1569440636")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-107\"]/form/div[8]/button[2]")).click();
		
	}

}
