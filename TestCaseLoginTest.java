package AutomationFramework.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestCaseLoginTest {

  @Test
	public void login_member() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.bukalapak.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='sigil-header__nav te-header-login']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement txt_username = driver.findElement(By.id("user_session_username"));
		txt_username.sendKeys("nursellazenioctavina@gmail.com");
		driver.findElement(By.id("user_session_password")).sendKeys("Nursella1610.");
		driver.findElement(By.xpath("//*[@id=\"new_user_session\"]/button")).click();
		
		String actualURL = "https://www.bukalapak.com/";
		String expectedURL = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedURL, actualURL); 
		
	}  
}


