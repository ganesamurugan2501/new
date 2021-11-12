package org.hcl;  
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class BaseClass {
	static WebDriver driver;
public WebDriver LaunchBrowser(String key,String value) {
	System.setProperty(key, value);
	 driver=new ChromeDriver();
	return driver;
	}
public void lauchUrl(String url) {
	 driver.get(url);
	 driver.manage().window().maximize();
	 }
public void passValue(WebElement element,String data) {
element.sendKeys(data);
}
public void btnClick(WebElement element) {
	element.click();
	}
public void selectLocation(WebElement element,String value) {
Select s= new Select(element);
s.selectByValue(value);
}
public String printText(WebElement element) {
   String text = element.getText();
return text;
}
public String printAttribute(WebElement element) {
String attribute = element.getAttribute("value");
return attribute;
}
public String getDataFromExcel(String pathname,String name,int rNo,int cNo) throws IOException {
	 String value=null;
File f =new File(pathname);
FileInputStream fIn= new FileInputStream(f);
Workbook wb=new XSSFWorkbook(fIn);
Sheet s = wb.getSheet(name);
Row r = s.getRow(rNo);
Cell c = r.getCell(cNo);
int type = c.getCellType();
if (type==1) {
	 value = c.getStringCellValue();
}
else if (type==0) {
	if (DateUtil.isCellDateFormatted(c)) {
		Date dateCellValue = c.getDateCellValue();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yy");
		 value = sdf.format(dateCellValue);
	}
	else {
		double numericCellValue = c.getNumericCellValue();
		Long l= (long)numericCellValue;
		 value = String.valueOf(l);
	}
}
return value;



}













}
