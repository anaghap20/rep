package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f2 {
	@Test
	public void parabank(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
	    driver.findElement(By.id("customer.firstName")).sendKeys("maalu");
	    driver.findElement(By.id("customer.lastName")).sendKeys("a");
	    driver.findElement(By.id("customer.address.street")).sendKeys("sm house,kozhikode,kerala");
	    driver.findElement(By.id("customer.address.city")).sendKeys("calicut");
	    driver.findElement(By.id("customer.address.state")).sendKeys("kerala");
	    driver.findElement(By.id("customer.address.zipCode")).sendKeys("673009");
	    driver.findElement(By.id("customer.phoneNumber")).sendKeys("568943039");
	    driver.findElement(By.id("customer.ssn")).sendKeys("12345678");
	    driver.findElement(By.id("customer.username")).sendKeys("anju.p");
	    driver.findElement(By.id("customer.password")).sendKeys("A345%$lh");
	    driver.findElement(By.id("repeatedPassword")).sendKeys("A345%$lh");
	    driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("anju.p");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("A345%$lh");
	    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
//	    driver.findElement(By.cssSelector("#headerPanel > ul.leftmenu > li:nth-child(2) > a")).click();
	    driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
	    //driver.findElement(By.xpath("//*[@id=\"results\"]/div/div[1]/div[1]/a/div/img")).click();
	    driver.get("https://parabank.parasoft.com/parabank/services.htm");
//	    driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
	  
	    
	    
	}}
