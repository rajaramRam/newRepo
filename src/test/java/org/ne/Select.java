package org.ne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select extends LibGlobal {
	
	
	public Select() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement selectBtn;
	
	@FindBy(id="continue")
	private WebElement cntBtn;

	public WebElement getSelectBtn() {
		return selectBtn;
	}

	public WebElement getCntBtn() {
		return cntBtn;
	}
	
	
	public void selectBtn() {
		// TODO Auto-generated method stub
		
	click(getSelectBtn());
	click(getCntBtn());

	}
}
