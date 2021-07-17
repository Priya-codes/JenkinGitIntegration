import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_objectRepo {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//div[@class='_cqp']")
	WebElement display;
	
	public Fb_objectRepo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void email_Id()
	{
		email.sendKeys("Priya0903bisht@gmail.com");
	}
	public void password()
	{
		password.sendKeys("qwerrrt");
	}
	
	public String dispaly_info()
	{
		return display.getText();
	}
	
}
