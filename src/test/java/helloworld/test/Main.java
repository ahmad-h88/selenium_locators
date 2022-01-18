package helloworld.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
	@Test
	public void test() throws InterruptedException {	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		
		loginButton.click();
		
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.linkText("Apply Leave"));
		link.click();
		Thread.sleep(3000);
//		String title = driver.getTitle();
//		System.out.println(title);
		driver.quit();
	}
}
