package org.hcl;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SampleClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass b=new BaseClass();
		WebDriver driver = b.LaunchBrowser("webdriver.chrome.driver","C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\Driver\\chromedriver.exe");
		b.lauchUrl("https://adactinhotelapp.com/");		
		WebElement txtUser = driver.findElement(By.id("username"));
		b.passValue(txtUser, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx","Details", 6, 1));
		WebElement txtPass = driver.findElement(By.id("password"));
		b.passValue(txtPass, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx","Details", 7, 1));
		WebElement btn = driver.findElement(By.id("login"));
b.btnClick(btn);
WebElement locat = driver.findElement(By.id("location"));
b.selectLocation(locat, "Melbourne");
WebElement hotel = driver.findElement(By.id("hotels"));
b.selectLocation(hotel, "Hotel Cornice");
WebElement rType = driver.findElement(By.id("room_type"));
b.selectLocation(rType, "Super Deluxe");
WebElement rNos = driver.findElement(By.id("room_nos"));
b.selectLocation(rNos, "2");
WebElement dataIn = driver.findElement(By.id("datepick_in"));
b.passValue(dataIn, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx","Details",1,1));
WebElement dataOut = driver.findElement(By.id("datepick_out"));
b.passValue(dataOut, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx","Details",2,1));
WebElement adult = driver.findElement(By.id("adult_room"));b.selectLocation(adult, "3");
WebElement child = driver.findElement(By.id("child_room"));b.selectLocation(child, "2");
WebElement click = driver.findElement(By.id("Submit"));b.btnClick(click);
WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));b.btnClick(radioBtn);
WebElement continu= driver.findElement(By.id("continue"));b.btnClick(continu);
WebElement firstNam= driver.findElement(By.id("first_name"));
b.passValue(firstNam, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx","Details",3,1));
WebElement lastNam= driver.findElement(By.id("last_name"));
b.passValue(lastNam, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx","Details",4,1));
WebElement addres= driver.findElement(By.id("address"));
b.passValue(addres, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx","Details",5,1));
WebElement ccNo= driver.findElement(By.id("cc_num"));
b.passValue(ccNo, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx","Details",8,1));
WebElement ccType = driver.findElement(By.id("cc_type"));
b.selectLocation(ccType, "VISA");
WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
b.selectLocation(expMonth, "2");
WebElement expYear = driver.findElement(By.id("cc_exp_year"));
b.selectLocation(expYear, "2022");
WebElement cvNo= driver.findElement(By.id("cc_cvv"));
b.passValue(cvNo, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx","Details",9,1));
WebElement bookNow = driver.findElement(By.id("book_now"));
b.btnClick(bookNow);
Thread.sleep(5000);
WebElement txt = driver.findElement(By.id("order_no"));
System.out.println("Order ID:"+b.printAttribute(txt));





		
		
		
		
		
	}

}
