package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavenlaunch {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("7894561234567");
		driver.findElement(By.id("pass")).sendKeys("Hellow@1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='u_0_d_Y4']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
