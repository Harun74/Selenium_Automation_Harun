package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginTest1 {
	
	public static void main(String[] args) {
		
	
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/login ");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@name ='email'])[1]")).sendKeys("harunchy.1986@gmail.com");
		
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("H9682c");
		
		driver.findElement(By.xpath("(//button[@type ='submit'])[1]")).click();
		
		String text = driver.findElement(By.xpath("//*[text() =' Home']")).getText();
		System.out.println("Visible text ::" + text);
		Assert.assertEquals("Home", text);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text() = ' Products']")).click();
		
		String text2 = driver.findElement(By.xpath("//*[text()='All Products']")).getText();
		System.out.println("All products are on screen ::" + text2);
		Assert.assertEquals("All Products", text2);
 
	    driver.close();
		
	}

}
