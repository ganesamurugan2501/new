package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data3 {
   @Test
	private void test2() {
	   // Soft assert

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		SoftAssert s =new SoftAssert();
		s.assertTrue(driver.getCurrentUrl().contains("adactinhotelapp"), "Verify Url");
		
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("priya");
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("priya@123");	
		s.assertEquals(txtPass.getAttribute("value"),"priya@123","verify password");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		
	
}
}
