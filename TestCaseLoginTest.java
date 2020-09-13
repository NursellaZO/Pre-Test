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
	public void login() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.bukalapak.com/login?");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement txt_username = driver.findElement(By.id("user_session_username"));
		txt_username.sendKeys("nursellazenioctavina@gmail.com");
	
		driver.findElement(By.id("user_session_password")).sendKeys("Nursella1610.");
		driver.findElement(By.name("commit")).click();
		
		String actualURL = "https://www.bukalapak.com/";
		String expectedURL = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedURL, actualURL); 
		
		driver.close();
		driver.quit();
	}

}
