package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Aa {
	static WebDriver driver;


	@Test
	private void test21(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

}
}