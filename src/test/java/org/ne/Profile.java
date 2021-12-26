package org.ne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile extends LibGlobal {
	
	public Profile() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lName;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement ccNum;
	
	@FindBy(id="cc_type")
	private WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookBtn;
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}


	
	
	public void book(String fname,String lname,String add,String ccnum,String cctype,String em,String ey,String cvv) {
		// TODO Auto-generated method stub
		
		sendtext(getFname(), fname);
		
		sendtext(getlName(), lname);
		
		sendtext(getAdd(), add);
		
		sendtext(getCcNum(), ccnum);
		
		selectByVisibleText(getCcType(), cctype);
		
		selectByVisibleText(getExpMonth(), em);
		
		selectByVisibleText(getExpYear(), ey);
		
		sendtext(getCvv(), cvv);
		
		click(getBookBtn());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
