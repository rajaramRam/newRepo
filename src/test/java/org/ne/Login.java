package org.ne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends LibGlobal {
	
	public Login() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement uName;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getuName() {
		return uName;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	public void loginPage(String name,String pass) {
		// TODO Auto-generated method stub
		
		sendtext(getuName(), name);
		
		sendtext(getPass(), pass);
	
		click(getLogin());
		
		
		
		
		
		
		
		
		

	}
	
	
}
