package framework;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class f32 {
	WebDriver driver;
	@Test
	public void xyzbank() {
		System.setProperty("webdriver.driver.chromedriver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/");
		driver.get("https://practice-automation.com/javascript-delays/");
		driver.findElement(By.xpath("//*[@id=\"start\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-wrap\"]/section/div/nav/span/span[1]/a")).click();
		driver.get("https://practice-automation.com/slider/");
		driver.findElement(By.xpath("//*[@id=\"slideMe\"]"));
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slideMe\"]"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(slider, 120, 0).perform();
		driver.get("https://practice-automation.com/tables/");
//		driver.get("https://practice-automation.com/ads/");
//		WebDriverWait wait=new WebDriverwait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"popmake-1272\"]")));
//		driver.findElement(By.xpath("//*[@id=\"popmake-1272\"]/button"));
		driver.get("https://practice-automation.com/click-events/");
		driver.findElement(By.xpath("//*[@id=\"post-3145\"]/div/div[3]/div/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"post-3145\"]/div/div[3]/div/div/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"post-3145\"]/div/div[5]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"post-3145\"]/div/div[5]/div[2]/button")).click();
		driver.get("https://practice-automation.com/iframes/");
		driver.get("https://practice-automation.com/accordions/");
		driver.findElement(By.xpath("//*[@id=\"post-1261\"]/div/div[1]/div/details/summary")).click();
		driver.get("https://practice-automation.com/form-fields/");
		driver.findElement(By.xpath("//*[@id=\"name-input\"]")).sendKeys("anjusha");
		driver.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[2]/input")).sendKeys("rneak%6728");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("color1")));
        element.click();
        driver.findElement(By.xpath("//*[@id=\"color1\"]")).click();
		
		
	
			
		
		
	}}


