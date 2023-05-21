package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("harunchy1986@yahoo.com");
		
		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("96820901711harun");
		
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
		
		driver.close();
		
		
	}

}
