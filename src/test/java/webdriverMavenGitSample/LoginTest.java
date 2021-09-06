package webdriverMavenGitSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	String baseURL="https://courses.letskodeit.com/login";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void Login()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("akshata@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Aksh");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
