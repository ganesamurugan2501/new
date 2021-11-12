package org.testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Company {
	static WebDriver driver;
	@Parameters({"username","password"})
	@Test
	private void test21(@Optional("priya")String s1,String s2) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(s1);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(s2);		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
	}
	
	}
