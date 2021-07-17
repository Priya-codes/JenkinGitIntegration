import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	
	WebDriver driver;
	String url="https://www.facebook.com/";
	@BeforeSuite
	public void setup()
	{		
		
		String chromepath=System.getProperty("user.dir" )+ "\\src\\test\\resources\\Chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath );
		driver= new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
	}
	
	
	@Test
	public void Login()
	{
		
		Fb_objectRepo obj= new Fb_objectRepo(driver);
		
		obj.email_Id();
		obj.password();
		
	obj.dispaly_info();
	}
	
	
	
	@AfterSuite
	public void tearDown()
	{
		if(!(url==null || url.isEmpty()))
		{
			driver.close();
		}
		
	}

}
