package org.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
	
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="email")
	private List<WebElement> txtUsername;
	
	@FindBy(id="pass")
	private WebElement txtpassword;
    
	@FindBy(name="login")
	private WebElement btnlogin;

	public List<WebElement> getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	
	
  
	


    
	
}
	
	
	
		

