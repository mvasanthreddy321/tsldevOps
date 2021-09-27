package LoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UdemyLogin {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void afterTest() throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void doLogin()
	{   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.udemy.com/");
	//	driver.findElement(By.xpath("//span[normalize-space()='Login in']")).click();
		driver.findElement(By.linkText("Log in")).click(); 
	    Assert.assertEquals(driver.getTitle(), "Attention Required! | Cloudflare");
	    
		
	/*	driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("admin123456");
		driver.findElement(By.name("submit")).click();
		boolean x=driver.findElement(By.xpath("//div[contains(text(),'There was a problem logging in. Check your email a')]")).isDisplayed();
		Assert.assertTrue(x); */
		
	
	}

}
