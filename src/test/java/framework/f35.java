package framework;

import java.awt.Color;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class f35 {
	WebDriver driver;
	@Test
	public void letcode () throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://letcode.in/test");
//		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[1]")).click();
//		driver.findElement(By.id("name")).sendKeys("amala1");
//		driver.findElement(By.id("email")).sendKeys("amala1246786@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("ncdmcem1233");
//		driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div/div/div/form/div[5]/p/button")).click();
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a")).click();
		driver.findElement(By.id("fullName")).sendKeys("saravanan");
		WebElement text=driver.findElement(By.id("join"));
		text.clear();
		text.sendKeys("iam bad");
		WebElement text1=driver.findElement(By.id("getMe"));
		text1.clear();
		text1.sendKeys("incncckco");
		WebElement text2=driver.findElement(By.id("clearMe"));
		text2.clear();
		text2.sendKeys("jkdwndbnxsal");
		driver.findElement(By.cssSelector("#dontwrite")).click();
		driver.navigate().to("https://letcode.in/test");
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();
		driver.findElement(By.id("home")).click();
		driver.get("https://letcode.in/buttons");
		driver.findElement(By.id("position")).click();
		WebElement button = driver.findElement(By.id("color"));
        String backgroundColor = button.getCssValue("background-color");
        System.out.println("Original Background Color: " + backgroundColor);

        // Convert RGB/RGBA to Hex manually
        String hexColor = convertColorToHex(backgroundColor);
        System.out.println("Hex Color Code: " + hexColor);
        driver.findElement(By.id("property")).click();
        driver.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"isDisabled\"]/div/h2"))); // Replace with the actual selector

        // Scroll the button into view if necessary
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

        // Create an Actions instance
        Actions actions = new Actions(driver);

        try {
            // Perform click and hold on the button
            actions.clickAndHold(button).perform();

            // Hold the button for 2 seconds (2000 milliseconds)
            Thread.sleep(2000);

            // Release the button
            actions.release().perform();
        } catch (Exception e) {
            // Fallback using JavaScript if Actions don't work as expected
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].dispatchEvent(new MouseEvent('mousedown', {bubbles: true}));", button);
            Thread.sleep(2000); // Hold duration
            js.executeScript("arguments[0].dispatchEvent(new MouseEvent('mouseup', {bubbles: true}));", button);
        }
        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a")).click();
        WebElement dropdownElement = driver.findElement(By.id("fruits"));  // Replace with actual ID or selector
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Apple");     // Select by visible text
        driver.findElement(By.xpath("//*[@id=\"superheros\"]/option[3]")).click();
        WebElement dropdownElement1 = driver.findElement(By.id("lang"));  // Replace with actual ID or selector
        Select dropdown1 = new Select(dropdownElement1);
        dropdown1.selectByVisibleText("C#"); 
        WebElement dropdownElement2 = driver.findElement(By.id("country"));  // Replace with actual ID or selector
        Select dropdown2 = new Select(dropdownElement2);
        dropdown2.selectByVisibleText("Chile"); 
        driver.get("https://letcode.in/test");
        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();
        driver.findElement(By.id("accept")).click();  // Replace with the actual ID or selector

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get alert text
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);

        // Accept the alert (clicks "OK")
        alert.accept();
        
        driver.findElement(By.id("confirm")).click();  // Replace with the actual ID or selector

        // Switch to the confirm alert
        Alert confirmAlert = driver.switchTo().alert();

        // Get the text of the confirm alert
        String alertText1 = confirmAlert.getText();
        System.out.println("Confirm alert text: " + alertText1);

        // Accept the confirm alert (click "OK")
        confirmAlert.accept();
        
        driver.findElement(By.id("prompt")).click();  // Replace with the actual ID or selector

        // Switch to the prompt alert
        Alert promptAlert = driver.switchTo().alert();

        // Get the text of the prompt alert
        String alertText2 = promptAlert.getText();
        System.out.println("Prompt alert text: " + alertText2);

        // Enter text into the prompt alert
        promptAlert.sendKeys("prayag");

        // Accept the prompt alert (click "OK")
        promptAlert.accept();
        
        driver.findElement(By.id("modern")).click();  // Replace with actual ID or selector
        driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button")).click();
        driver.get("https://letcode.in/test");
//        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[1]/app-menu/div/footer/a")).click();
//        driver.findElement(By.("body > app-root > app-frame-content > div > div > form > div:nth-child(1) > div > input")).sendKeys("anaghu");
//        driver.findElement(By.name("lname")).sendKeys("p");
//        driver.findElement(By.name("email")).sendKeys("anagha00@gmail.com");
      )
        
        
        






       
        
//       driver.quit();
    }

    // Method to convert both RGB and RGBA color formats to Hex
    public static String convertColorToHex(String color) {
        String[] values;

        // Handle RGB and RGBA
        if (color.startsWith("rgba")) {
            values = color.replace("rgba(", "").replace(")", "").split(",");
        } else if (color.startsWith("rgb")) {
            values = color.replace("rgb(", "").replace(")", "").split(",");
        } else {
            return "Invalid color format"; 
        }

        // Parse the red, green, and blue values
        int r = Integer.parseInt(values[0].trim());
        int g = Integer.parseInt(values[1].trim());
        int b = Integer.parseInt(values[2].trim());

        // Convert to Hex format
        return String.format("#82486f", r, g, b).toUpperCase();
        
        
        
    }
 
		
		
		
		    }


