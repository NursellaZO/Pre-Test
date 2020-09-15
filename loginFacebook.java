package AutomationFramework.AutomationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginFacebook {

	@Test
	public void login_facebook() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.bukalapak.com");
		
		//Masuk ke loginpage dari website Bukalapak
		driver.findElement(By.xpath("//a[@class='sigil-header__nav te-header-login']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[7]/div[5]/div/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("youremail@example.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	
		String actualURL = "https://www.bukalapak.com/";
		String expectedURL = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedURL, actualURL); 
		
	}
}
