package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class UberBookingSteps {
	
	@Given("User wants to select a car type as {string} from Uber app")
	public void user_wants_to_select_a_car_type_as_from_uber_app(String carType) {
	
		System.out.println("Step 1 : " +carType);
	  
	}

	@When("User selects car {string} and pick up point {string} and drop location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_location(String carType, String pickupLocation, String dropLocation) {
		System.out.println("Step 2 : "+carType+ " "+ pickupLocation +" "+ dropLocation+ " ");
	   
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	  
		 System.out.println("Step 3 : ");
	}

   @And("Driver ends the journey")
	public void driver_ends_the_journey() {
	 
	   System.out.println("Step 4 : ");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {

	    System.out.println("Step 5 : "+ price);
	}


}
