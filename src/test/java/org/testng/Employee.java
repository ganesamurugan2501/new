 package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {
	@Parameters("browserName")
	@Test
	private void test1(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
			

           System.out.println("chrome");
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
	        WebDriver driver1=new FirefoxDriver();
		 
	           System.out.println("FireFox");

			
		}
		else if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
	        WebDriver driver1=new InternetExplorerDriver();
	           System.out.println("IE");

			
		}
		else {
			System.out.println("Invalid Browser");
		}

	}	
}
