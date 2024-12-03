package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class jpet {
	WebDriver driver;
	@Test(dataProvider="file")
	public void jpet1(String userlogin,String password,String repeatpass,String firstname,String lastname,String email,String phoneno,String address1,String address2,String city,String state,String zip,String country,String language,String category,String username,
			String password1) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     driver=new ChromeDriver();
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userlogin);
	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input")).sendKeys(repeatpass);
	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input")).sendKeys(firstname);
	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input")).sendKeys(lastname);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input")).sendKeys(email);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input")).sendKeys(phoneno);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input")).sendKeys(address1);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[6]/td[2]/input")).sendKeys(address2);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input")).sendKeys(city);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input")).sendKeys(state);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input")).sendKeys(zip);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[10]/td[2]/input")).sendKeys(country);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[1]/td[2]/select")).sendKeys(language);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select")).sendKeys(category);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input")).click();
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input")).click();
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
    driver.get("https://petstore.octoperf.com/actions/Catalog.action");
    driver.findElement(By.cssSelector("#SidebarContent > a:nth-child(1) > img")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
    driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[3]/img")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[4]/img")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]/img")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();  
//    driver.findElement(By.id("stripes--2076011615")).sendKeys(username);
//    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).sendKeys(password1);
  //  driver.findElement(By.cssSelector("#Catalog > form > input[type=submit]")).click();
}
	@AfterTest
	public void jpet2() {
		driver.close();
	}
	@DataProvider(name="file")
	public Object[][]jpet3(){
		return new Object[][] {
			{"jikewmpq","A@jh4738uej63789","A@jh4738uej6378","arunima","kpp","arunima@gmail.com","9876543234","fvgsxgyhasxvxghshjajx","uierdneftdwejdsn","kozhikode","kerala","4567","India","english","FISH",
				"jikewmpq","A@jh4738uej63789"}
		};
		
	
	
		}
	}


