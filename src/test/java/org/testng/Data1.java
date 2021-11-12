package org.testng;

import org.hcl.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data1 {
	static Select s;
	@Test(dataProvider = "result")
	private void test2(String s1, String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(s1);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(s2);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		WebElement loc = driver.findElement(By.id("location"));
		s = new Select(loc);
		s.selectByValue("Melbourne");
		WebElement hotel = driver.findElement(By.id("hotels"));
		s = new Select(hotel);
		s.selectByValue("Hotel Sunshine");
		WebElement roomType = driver.findElement(By.id("room_type"));
		s = new Select(roomType);
		s.selectByValue("Double");
		WebElement roomNo = driver.findElement(By.id("room_nos"));
		s = new Select(roomNo);
		s.selectByValue("4");
		WebElement dataIn = driver.findElement(By.id("datepick_in"));
		dataIn.sendKeys(s3);
		WebElement dataOut = driver.findElement(By.id("datepick_out"));
		dataOut.sendKeys(s4);
		WebElement adult = driver.findElement(By.id("adult_room"));
		s = new Select(adult);
		s.selectByValue("4");
		WebElement child = driver.findElement(By.id("child_room"));
		s = new Select(child);
		s.selectByValue("2");
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement ftName = driver.findElement(By.id("first_name"));
		ftName.sendKeys(s5);
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys(s6);
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(s7);
		WebElement ccNo = driver.findElement(By.id("cc_num"));
		ccNo.sendKeys(s8);
		WebElement ccType = driver.findElement(By.id("cc_type"));
		s = new Select(ccType);
		s.selectByValue("MAST");
		WebElement ccMonth = driver.findElement(By.id("cc_exp_month"));
		s = new Select(ccMonth);
		s.selectByValue("4");
		WebElement ccYear = driver.findElement(By.id("cc_exp_year"));
		s = new Select(ccYear);
		s.selectByValue("2021");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys(s9);
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		Thread.sleep(5000);
		WebElement orderNo = driver.findElement(By.id("order_no"));
	String attribute = orderNo.getAttribute("value");
		System.out.println("order No is " +attribute);	
		}

	@DataProvider(name = "result")
	private Object[][] test1() {
		return new Object[][] { { "akrithik1", "krithik","01/11/2021",
		"10/11/2021","vethika","ganesh","chennai","4356789009087656","234"} };

	}
}
