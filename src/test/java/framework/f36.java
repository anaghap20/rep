package framework;

import java.time.Duration;
import java.util.ArrayList;

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

public class f36 {
	
		WebDriver driver;
		@Test
		public void letcode () throws InterruptedException {
			System.setProperty("webdriver.driver.chromedriver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://letcode.in/test");
//			driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[1]")).click();
//			driver.findElement(By.id("name")).sendKeys("amala1");
//			driver.findElement(By.id("email")).sendKeys("amala1246786@gmail.com");
//			driver.findElement(By.id("pass")).sendKeys("ncdmcem1233");
//			driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div/div/div/form/div[5]/p/button")).click();
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
	        Thread.sleep(3000);
	        driver.get("https://letcode.in/test");
	        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();
	        driver.findElement(By.id("accept")).click();  // Replace with the actual ID or selector
	        Thread.sleep(3000);
            
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
	        System.out.println("hhhh");
	        
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
	        System.out.println("helo");
	        
	        driver.findElement(By.id("modern")).click();  // Replace with actual ID or selector
	        driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button")).click();
	        driver.get("https://letcode.in/test");
//	        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[1]/app-menu/div/footer/a")).click();
//	        driver.findElement(By.("body > app-root > app-frame-content > div > div > form > div:nth-child(1) > div > input")).sendKeys("anaghu");
//	        driver.findElement(By.name("lname")).sendKeys("p");
//	        driver.findElement(By.name("email")).sendKeys("anagha00@gmail.com");
	        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[2]/app-menu/div/footer/a")).click();
	        WebElement option1 = driver.findElement(By.id("yes"));
	        option1.click();

	        // Check if a radio button is selected
	        if (option1.isSelected()) {
	            System.out.println("Option 1 is selected.");
	        } else {
	            System.out.println("Option 1 is not selected.");
	        }
	        WebElement option2 = driver.findElement(By.id("two"));
	        option2.click();

	        // Check if a radio button is selected
	        if (option1.isSelected()) {
	            System.out.println("Option 2 is selected.");
	        } else {
	            System.out.println("Option 2 is not selected.");
	        }
	        WebElement option3 = driver.findElement(By.id("nobug"));
	        option3.click();

	        // Check if a radio button is selected
	        if (option3.isSelected()) {
	            System.out.println("Option 3 is selected.");
	        } else {
	            System.out.println("Option 3 is not selected.");
	        }
	        WebElement option4 = driver.findElement(By.id("foo"));
	        option4.click();

	        // Check if a radio button is selected
	        if (option4.isSelected()) {
	            System.out.println("Option 4 is selected.");
	        } else {
	            System.out.println("Option 4 is not selected.");
	        }
	        WebElement option5 = driver.findElement(By.id("notG"));
	        option5.click();

	        // Check if a radio button is selected
	        if (option5.isSelected()) {
	            System.out.println("Option 5 is selected.");
	        } else {
	            System.out.println("Option 5 is not selected.");
	        }
	        driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input")).isSelected();
	        driver.findElement(By.cssSelector("body > app-root > app-radio-check > section.section.has-background-white-ter > div > div > div.column.is-7-desktop.is-8-tablet > div > div > div:nth-child(7) > label.checkbox > input[type=checkbox]")).click();
	        driver.get("https://letcode.in/test");
	        String originalTab = driver.getWindowHandle();

	        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[3]/app-menu/div/footer/a")).click();
	        driver.findElement(By.id("home")).click();
	        
	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	        // Switch to the new tab (last opened)
	        driver.switchTo().window(tabs.get(1));
	        System.out.println("In new tab: " + driver.getTitle());

	        // Switch back to the original tab
	        driver.switchTo().window(originalTab);
	        System.out.println("Back to previous tab: " + driver.getTitle());
	        driver.findElement(By.id("multi")).click();
	        System.out.println("kkkl");
	      //  driver.get("https://letcode.in/test");
	        String originalTab1 = driver.getWindowHandle();
	        ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());

	        // Switch to the first new tab and close it
	        if (tabs1.size() > 1) {
	            driver.switchTo().window(tabs1.get(1));
	            System.out.println("Closing tab: " + driver.getTitle());
	            driver.close();
	        }

	        // Update the list of tabs to get current open tabs after closing one
	        tabs1 = new ArrayList<>(driver.getWindowHandles());

	        // Switch to the second new tab (which is now at index 1) and close it
	        if (tabs1.size() > 1) {
	            driver.switchTo().window(tabs1.get(1));
	            System.out.println("Closing tab: " + driver.getTitle());
	            driver.close();
	        }

	        // Switch back to the original tab
	        driver.switchTo().window(originalTab1);
	        System.out.println("Back to original tab: " + driver.getTitle());

	      // driver.close();
	        String originalTab2 = driver.getWindowHandle();

	        // Click the button to open a new tab
	        driver.findElement(By.id("home")).click();

	        // Get all tab handles
	        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());

	        // Check if there's a new tab open, then switch to it and close it
	        if (tabs.size() > 1) {
	            driver.switchTo().window(tabs2.get(1)); // Switch to the new tab
	            System.out.println("In new tab: " + driver.getTitle());
//	            driver.get("https://letcode.in/test");
//	            driver.get("https://letcode.in/draggable");
//	            WebElement container = driver.findElement(By.cssSelector("body > app-root > app-draggable > section.section.has-background-white-ter > div > div > div.column.is-7-desktop.is-8-tablet > div > div > div > div"));
//	            WebElement sourceElement = driver.findElement(By.xpath("//div[@style='transform: translate3d(32px, 41px, 0px);']"));
//	            int containerWidth = container.getSize().getWidth();
//	            int containerHeight = container.getSize().getHeight();
//	            int containerX = container.getLocation().getX();
//	            int containerY = container.getLocation().getY();
//	            int dragXOffset = Math.min(50, containerWidth - 20);  // X offset within container bounds
//	            int dragYOffset = Math.min(50, containerHeight - 20);
//	            Actions actions1 = new Actions(driver);
//	            actions.clickAndHold(sourceElement)
//	               .moveByOffset(dragXOffset, dragYOffset)  // Offset within container bounds
//	               .build()
//	               .perform();
//	            System.out.println("hai");
	            driver.get("https://letcode.in/test");
	            driver.get("https://letcode.in/dropable");
	            WebElement sourceElement1 = driver.findElement(By.id("draggable"));
	            WebElement targetElement = driver.findElement(By.id("droppable"));
	            Actions actions2 = new Actions(driver);
	            actions2.dragAndDrop(sourceElement1, targetElement).build().perform();
	            driver.get("https://letcode.in/test");
	            driver.get("https://letcode.in/sortable");
	            WebElement toDoElement = driver.findElement(By.id("sample-box1"));
	            WebElement doneSection = driver.findElement(By.id("cdk-drop-list-1"));
	            int doneX = doneSection.getLocation().getX();
	            int doneY = doneSection.getLocation().getY();
	            Actions actions1 = new Actions(driver);
	            actions1.clickAndHold(toDoElement)
                .moveToElement(doneSection) // Moves the element over the "Done" section
                .release() // Releases the element in the "Done" section
                .perform();
	            System.out.println("Content moved from 'To Do' to 'Done' section.");
//	            driver.get("https://letcode.in/test");
//	            driver.get("https://letcode.in/forms");
//	            driver.findElement(By.id("firstname")).sendKeys("ashiq");
//	            driver.findElement(By.id("lasttname")).sendKeys("oo");
//	            driver.findElement(By.id("email")).sendKeys("hello@kdxw");
//	            driver.findElement(By.id("Phno")).sendKeys("9895474097");
//	            driver.findElement(By.id("state")).sendKeys("kerala");
//	            driver.findElement(By.id("postalcode")).sendKeys("673009");
//	            driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[5]/div[2]/div/div/div/select")).sendKeys("India");
//	            driver.findElement(By.id("Date")).sendKeys("11/15/2024");
//	            driver.findElement(By.id("male")).click();
//	            driver.findElement(By.id("checkbox")).click();
//	            driver.findElement(By.cssSelector("body > app-root > app-forms > section.section.has-background-white-ter > div > div > div.column.is-7-desktop.is-8-tablet > div > div > form > div.field.is-grouped > div > input")).click();
//	            driver.findElement(By.xpath("//*[@id=\"Addl1\"]")).sendKeys("jnedmsjrekwp12q");
	            driver.get("https://letcode.in/test");
	            driver.get("https://letcode.in/shadow");
	            driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("anju");
	            driver.findElement(By.id("lname")).sendKeys("p");
	            driver.findElement(By.id("email")).sendKeys("anju@gmail.com");
	            




	            driver.close();
	        }

	        // Switch back to the original tab
	        driver.switchTo().window(originalTab2);
	        System.out.println("Back to original tab: " + driver.getTitle());

	        // Close the browser
	       driver.navigate().to("https://letcode.in/test");
	       driver.navigate().refresh();
	      // System.out.println("Back to original tab: ");
	      driver.navigate().to("https://letcode.in/elements");
	      driver.findElement(By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/form/div/p[1]/input")).sendKeys("goooo");
	      driver.findElement(By.id("search")).click();
	      driver.get("https://letcode.in/test");
	      driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[1]/app-menu/div/footer/a")).click();
	      driver.switchTo().frame(0);


	       

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



