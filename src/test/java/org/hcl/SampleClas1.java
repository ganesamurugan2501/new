package org.hcl;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleClas1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass b=new BaseClass();
		WebDriver driver = b.LaunchBrowser("webdriver.chrome.driver","C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\Driver\\chromedriver.exe");
   b.lauchUrl("http://adactinhotelapp.com/");
   
   PojoClass pc= new PojoClass();
   WebElement txtuser = pc.getTxtuser();
   b.passValue(txtuser, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx", "Details", 6, 1));
		WebElement txtPass = pc.getTxtPass();
   
   b.passValue(txtPass, b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx", "Details", 7, 1));

   WebElement btnlogin = pc.getBtnlogin();
   b.btnClick(btnlogin);
   PojoClass1 pc1= new PojoClass1();
WebElement locat = pc1.getLocat();
b.selectLocation(locat,"Melbourne");
b.selectLocation(pc1.getHotel(), "Hotel Sunshine");
WebElement getrType = pc1.getrType();
b.selectLocation(pc1.getrType(), "Standard");
WebElement getrNos = pc1.getrNos();
b.selectLocation(getrNos, "2");
b.selectLocation(pc1.getDataIn(),b.getDataFromExcel("C:\\Users\\BE HAPPY\\Desktop\\Shanmugapriya\\Launch1\\ExcelData\\Excel.xlsx","Details",1,1));
   
	}
}