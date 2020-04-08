package com.elblogdesanti.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	WebDriver driver = new ChromeDriver();
        driver.get("https://elblogdesanti.com");
        driver.findElement(By.className("cs-icon-search")).click();
        driver.findElement(By.className("search-field")).sendKeys("la regla de los dos minutos");
        driver.findElement(By.className("search-submit")).click();
    }
}
