package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass1 extends BaseClass {
	public PojoClass1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement locat;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private	WebElement rType;
	@FindBy(id="room_nos")
	private WebElement rNos;
	@FindBy(id="datepick_in")
	private	WebElement dataIn;
	@FindBy(id="datepick_out")
	private WebElement dataOut;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement click;
	public WebElement getLocat() {
		return locat;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getrType() {
		return rType;
	}
	public WebElement getrNos() {
		return rNos;
	}
	public WebElement getDataIn() {
		return dataIn;
	}
	public WebElement getDataOut() {
		return dataOut;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getClick() {
		return click;
	}
	
	
	
	
	
	
	
}
