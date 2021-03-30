package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegSteps {
	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
		
		System.out.println("User navigates to Registration Page");
	  
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable table) {
		
		List<List<String>> userList = table.asLists(String.class);
	 
		for(List<String> e : userList) {
			System.out.println(e);
		} 
		
	}
	
	@When("user enters following details with columns")
	public void user_enters_following_details_with_columns(DataTable table) {
		
		List<Map<String, String>> list= table.asMaps();
		System.out.println(list);
		
        for(Map<String,String> e : list) {
        	System.out.println(e.get("firstname"));
        	System.out.println(e.get("lastname"));
        	System.out.println(e.get("phone"));
        	System.out.println(e.get("email"));
        	System.out.println(e.get("location"));
        	
        }
		
		
		
			
			
}
		
	  
	

	
	

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
		System.out.println("User Registration is successful");
	   
	}


	
	
	

}
