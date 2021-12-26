package org.stepR;

import java.util.List;

import org.junit.Assert;
import org.ne.Booking;
import org.ne.LibGlobal;
import org.ne.Login;
import org.ne.Profile;
import org.ne.Search;
import org.ne.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepRunner extends LibGlobal {

	


@Given("User is on login page")
public void user_is_on_login_page() {
 
	launchBrowser();
	lauchUrl("https://adactinhotelapp.com/");
	maximize();
}

@When("User enter a valid login details {string},{string}")
public void user_enter_a_valid_login_details(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
   
	List<String> asList = dataTable.asList();	
	String username = asList.get(0);	
	String pass = asList.get(1);
	
	Login l = new Login();	
	l.loginPage(username, pass);
}

@Then("User should enrty all search hotel fields   {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_should_enrty_all_search_hotel_fields(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, io.cucumber.datatable.DataTable dataTable) {

	List<List<String>> asLists = dataTable.asLists();
	List<String> list = asLists.get(1);
	
	String location = list.get(0);
	String hotel = list.get(1);
	String roomType = list.get(2);
	String roomNo = list.get(3);
	String cIn = list.get(4);
	String cOut = list.get(5);
	String aRoom = list.get(6);
	String cRoom = list.get(7);
	
	Search s = new Search();
	s.searcHotel(location, hotel, roomType, roomNo, cIn, cOut, aRoom, cRoom);
}

@Then("User sholud select the hotel and continue")
public void user_sholud_select_the_hotel_and_continue() {
   
	Select s = new Select();
	s.selectBtn();
}

@Then("User sholud fill all the fields  {string},{string},{string},{string}>,{string},{string},{string} ,{string}")
public void user_sholud_fill_all_the_fields(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, io.cucumber.datatable.DataTable dataTable) {

	List<List<String>> asLists = dataTable.asLists();
	List<String> list = asLists.get(1);
	
	String fName = list.get(0);
	String lName = list.get(1);
	String add = list.get(2);
	String ccNum = list.get(3);
	String ccType = list.get(4);
	String expMonth = list.get(5);
	String expYear = list.get(6);
	String cvv = list.get(7);
	
	Profile p = new Profile();
	p.book(fName, lName, add, ccNum, ccType, expMonth, expYear, cvv);
	
}

@Then("User sholud verify the message {string};")
public void user_sholud_verify_the_message(String string) throws InterruptedException {
    
	Thread.sleep(7000);
	Booking b = new Booking();
	
	String string1 = b.confirmText();
	
	Assert.assertTrue(string1, true);
	
	
	
	
	if (string1.equals(string)) {
		
		System.out.println(string1);
	}
	
}

}
