package org.ne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search  extends LibGlobal{
	
	public Search() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement rType;
	
	@FindBy(id="room_nos")
	private WebElement rNo;
	
	@FindBy(id="datepick_in")
	private WebElement cIn;
	
	@FindBy(id="datepick_out")
	private WebElement cOut;
	
	
	@FindBy(id="adult_room")
	private WebElement aRoom;
	
	@FindBy(id="child_room")
	private WebElement cRoom;
	
	
	@FindBy(id="Submit")
	private WebElement butn;


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getrType() {
		return rType;
	}


	public WebElement getrNo() {
		return rNo;
	}


	public WebElement getcIn() {
		return cIn;
	}


	public WebElement getcOut() {
		return cOut;
	}


	public WebElement getaRoom() {
		return aRoom;
	}


	public WebElement getcRoom() {
		return cRoom;
	}


	public WebElement getButn() {
		return butn;
	}
	
	
	
	
	
	public void searcHotel(String location,String hotel,String roomType,String roomNo,String cIn,String cOut,
			String aRoom,String cRoom) {
		// TODO Auto-generated method stub

		selectByVisibleText(getLocation(), location);
		
		selectByVisibleText(getHotel(), hotel);
		
		selectByVisibleText(getrType(), roomType);
		
		selectByVisibleText(getrNo(), roomNo);
		
		sendtext(getcIn(), cIn);
		
		sendtext(getcOut(), cOut);
		
		selectByVisibleText(getaRoom(), aRoom);
		
		selectByVisibleText(getcRoom(), cRoom);
		
		click(getButn());	
		
	}
	
}
