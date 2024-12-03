package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f13 {
	WebDriver driver;
	@Test(dataProvider="form")
	public void form14(String email,String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/donation-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		WebElement element=driver.findElement(By.cssSelector("#user-registration-form-311 > form > div.ur-form-row > div > div.ur-field-item.field-range > div > div.ur-range-number > input"));
		element.clear();
		element.sendKeys("54");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-311\"]/form/div[2]/button")).click();
       
	}
	@AfterTest
	public void form12() {
		driver.close();
	}
	@DataProvider(name="form")
	public Object[][]form24(){
		return new Object[][] {
			{"anaghap123@gmail.com","A#n4agha"}
	};

}}
