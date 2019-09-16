package com.veriboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://localhost:3000");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        
        WebElement loginbutton = driver.findElement(By.name("login"));
        loginbutton.click();
        
        Thread.sleep(3000);
        
        driver.quit();
		

	}

}
