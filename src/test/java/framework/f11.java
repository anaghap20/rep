package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class f11 {
	WebDriver driver;
	@Test(dataProvider="form")
	public void form8() {
		System.setProperty("webdriver.chome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/course-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys("renju");
		driver.findElement(By.id("last_name")).sendKeys("R");
		driver.findElement(By.id("textarea_1623050614")).sendKeys("renj7908@gmail.com");
		driver.findElement(By.id("input_box_1623050696")).sendKeys("kozhikode");
		driver.findElement(By.id("input_box_1623050759")).sendKeys("kerala");
		driver.findElement(By.id("country_1623050729")).sendKeys("India");
		driver.findElement(By.id("input_box_1623050879")).sendKeys("673009");
		driver.findElement(By.name("phone_1623051660")).sendKeys("073060 56789");
		driver.findElement(By.xpath("//*[@id=\"radio_1623051748_Male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"date_box_1623051693_field\"]/span/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input")).sendKeys("0002012");
		WebElement testDropDown=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select"));
		Select dropdown=new Select(testDropDown);
		dropdown.selectByVisibleText("March");
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[17]")).click();
		driver.findElement(By.id("user_email")).sendKeys("renju908@gmail.com");
		driver.findElement(By.id("user_confirm_email")).sendKeys("renju908@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Renju%$@123");
		driver.findElement(By.id("user_confirm_password")).sendKeys("Renju%$@123");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-303\"]/form/div[7]/button")).click();
		

	}

}
