package org.ne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends LibGlobal {

	public Booking() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//td[@class=\"login_title\"]")
	private WebElement text;

	public WebElement getText() {
		return text;
	}
	
	
	
	public String confirmText() {
		// TODO Auto-generated method stub
		
	WebElement text2 = getText();
	
	 String text3 = text2.getText();
	 
	 return text3;
	
	
	

	}
	
	
	
}
