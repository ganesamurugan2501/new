package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2{
	static WebDriver driver;
	@AfterClass
	public static void afterClass() {
		//driver.quit();
	}
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 String currentUrl = driver.getCurrentUrl();
		 boolean b = currentUrl.contains("flipkart");
		 Assert.assertTrue("Verify Url", b);
	}
	@After
	public void after() {
		Date d=new Date();
		System.out.println("End Time is" +d);
	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println("Start Time is" + d);
	}	
	@Test
	public void testJava() {
		WebElement txtUser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtUser.sendKeys("priya@gmail.com");
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		txtPass.sendKeys("priya234");//Priya234
		String a = txtPass.getAttribute("value");
		Assert.assertEquals("Verify Password", "priya234", a);// using Except Password o/p is passed
		
		WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnLogin.click();
	}	
}
