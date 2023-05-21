package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginTest3 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
   //WebdriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://login.yahoo.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id = 'login-username']")).sendKeys("harunchy1986@yahoo.com");
	
	driver.findElement(By.xpath("//input[@id = 'login-signin']")).click();
	
	
	
	}

}
