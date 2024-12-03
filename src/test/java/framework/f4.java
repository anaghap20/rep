package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f4{
	WebDriver driver;
	@Test(dataProvider="file")
	public void parabank(String first,String last,String address,String city,String state,String code,String phone,String ssd,String user,String password,String confirm) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=AE84F58741A075DCEF1AF1219B873A4A");
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
	driver.findElement(By.id("customer.firstName")).sendKeys(first);
	driver.findElement(By.id("customer.lastName")).sendKeys(last);
	driver.findElement(By.id("customer.address.street")).sendKeys(address);
	driver.findElement(By.id("customer.address.city")).sendKeys(city);
	driver.findElement(By.id("customer.address.state")).sendKeys(state);
	driver.findElement(By.id("customer.address.zipCode")).sendKeys(code);
	driver.findElement(By.id("customer.phoneNumber")).sendKeys(phone);
	driver.findElement(By.id("customer.ssn")).sendKeys(ssd);
	driver.findElement(By.id("customer.username")).sendKeys(user);
	driver.findElement(By.id("customer.password")).sendKeys(password);
	driver.findElement(By.id("repeatedPassword")).sendKeys(confirm);
	driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
}
	@AfterTest
	public void parabank1() {
		driver.close();
	}
	@DataProvider(name="file")
	public Object[][]parabank2() {
		return new Object[][] {
			{"ramu","p","dfjkfkv","mnrjd","kfjdka","24565","2345675432","345","ramu","jrtgqw%","jrtgqw%"},
			{"raji","kk","gedhujis","fvhjnd","jjfjrm","4356","765843902","906","raji","Zxc%^fg","Zxc%^fg"},
			{"amala","aul","LKjidfk","ikmfcdf","itugrmk","65748","9765543346","890","amala","XC%&jrnced","XC%&jrnced"}
		};
		
	}


}
