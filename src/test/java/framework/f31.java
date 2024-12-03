package framework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f31 {
	WebDriver driver;
	@Test
	public void swaglab() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String expectedresult="https://www.saucedemo.com/v1/inventory.html";
		String actualresult=driver.getCurrentUrl();
		assertEquals(actualresult,expectedresult,"login not succesfull");
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
		String expectedresult1="https://www.saucedemo.com/v1/cart.html";
		String actualresult1=driver.getCurrentUrl();
		assertEquals(actualresult1,expectedresult1,"login not succesfull");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg/path")).click();
//		String expectedresult2="https://www.saucedemo.com/v1/inventory.html";
//		String actualresult2=driver.getCurrentUrl();
//		assertEquals(actualresult2,expectedresult2,"login not succesfull");
//		driver.findElement(By.xpath("//button[@class='btn_secondary cart_button']")).click();    
       driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button")).click();
       driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
       driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
       driver.findElement(By.id("shopping_cart_container")).click();
       driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
       String expectedresult3="https://www.saucedemo.com/v1/checkout-step-one.html";
       String actualresult3=driver.getCurrentUrl();
       assertEquals(actualresult3,expectedresult3,"checkout page is working");
       driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("adarsh");
       driver.findElement(By.id("last-name")).sendKeys("p");
       driver.findElement(By.id("postal-code")).sendKeys("528923");
       driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
       String expectedresult4="https://www.saucedemo.com/v1/checkout-step-two.html";
       String actualresult4=driver.getCurrentUrl();
       assertEquals(actualresult4,expectedresult4,"is working");
       driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
       String expectedresult5="https://www.saucedemo.com/v1/checkout-complete.html";
       String actualresult5=driver.getCurrentUrl();
       assertEquals(actualresult5,expectedresult5,"is working");
       
       
       
       
        
	}
	

}
