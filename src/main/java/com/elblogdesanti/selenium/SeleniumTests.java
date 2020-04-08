package com.elblogdesanti.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTests {
	
	WebDriver driver;
	
	@BeforeMethod
	public void start() {
		driver = new ChromeDriver();
        driver.get("https://elblogdesanti.com");
	}
	
	@AfterMethod
	public void end() {
		driver.close();
	}
	
	@Test
    public void myFirstTest()
    {
        driver.findElement(By.className("cs-icon-search")).click();
        driver.findElement(By.className("search-field")).sendKeys("la regla de los dos minutos");
        driver.findElement(By.className("search-submit")).click();
    }
	
	@Test
    public void mySecondTest()
    {
        driver.findElement(By.className("cs-icon-search")).click();
        driver.findElement(By.className("search-field")).sendKeys("la tecnica pomodoro");
        driver.findElement(By.className("search-submit")).click();
    }

}
