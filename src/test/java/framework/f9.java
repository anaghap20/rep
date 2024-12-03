package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f9 {
	WebDriver driver;
	@Test(dataProvider="file")
	public void column(String email,String login,String password,String firstname,String lastname,String nickname) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-3/");
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_login")).sendKeys(login);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("nickname")).sendKeys(nickname);
		driver.findElement(By.id("user_url")).sendKeys("https://www.britannica.com/topic/love-emotion");
		driver.findElement(By.id("textarea_1530101155")).sendKeys("be alert");
		driver.findElement(By.xpath("//*[@id=\"date_box_1530101157_field\"]/span/input[1]")).click();
		driver.findElement(By.cssSelector("body > div.flatpickr-calendar.animate.arrowLeft.open.arrowBottom > div.flatpickr-months > div > div > div > input")).sendKeys("0002024");
		WebElement testDropDown=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select"));
		Select dropdown=new Select(testDropDown);
		dropdown.selectByVisibleText("March");
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[26]")).click();
	    driver.findElement(By.xpath("//*[@id=\"user-registration-form-32\"]/form/div[4]/button")).click();

		
	}
	@AfterTest
	public void column1() {
		driver.close();
	}
	@DataProvider(name="file")
	public Object[][]column2(){
		return new Object[][] {
			{"amalaq21@gmail.com","amalasuresh","sA@h8356lkmfv","amala","suresh","ammu"}
		};
		
	}
	

}
