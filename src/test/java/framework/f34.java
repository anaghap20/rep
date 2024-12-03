package framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f34 {
	WebDriver driver;
	@Test
	public void store() {
		System.setProperty("webdriver.driver.chromechromedriver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
//		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("anagha0004");
//		driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("vjxsnak#$%^&");
//		driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
//		driver.findElement(By.xpath("//*[@id=\\\"signInModal\\\"]/div/div/div[3]/button[1]")).click();
//		driver.findElement(By)
//		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("anagha0004");
//		driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("vjxsnak#$%^&");
//		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		driver.findElement(By.cssSelector("#navbarExample > ul > li.nav-item.active > a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys("ajishma@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"recipient-name\"]")).sendKeys("ajishma");
		driver.findElement(By.xpath("//*[@id=\"message-text\"]")).sendKeys("hi");
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println("Alert message: " + alertMessage);
        alert.accept();
        driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
        driver.findElement(By.cssSelector("#navbarExample > ul > li.nav-item.active > a")).click();
        driver.findElement(By.linkText("About us")).click();
        driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
        WebElement closeButton = driver.findElement(By.className("close-about-us")); 
        closeButton.click();
        
	}
}
