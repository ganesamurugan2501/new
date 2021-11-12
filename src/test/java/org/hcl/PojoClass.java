package org.hcl;  // SampleClas1 and BaseClass

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	public PojoClass() {
		
	PageFactory.initElements(driver, this);			
	}
	// using FindBys 
	@FindBys({@FindBy(id="username"),@FindBy(xpath="//input[@type='text']")})
    private WebElement txtuser;
	//Using FindAll
	@FindAll({@FindBy(id="password"),@FindBy(name="pass")})
    private WebElement txtPass;
	//Using FindBy
	@FindBy(id="login")
    private WebElement btnlogin;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}


    
}

