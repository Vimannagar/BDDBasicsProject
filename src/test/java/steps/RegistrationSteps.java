package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {

	@Given("User should be at accounts page")
	public void user_should_be_at_accounts_page() {
		System.out.println("Given statement");
	}

	@When("User enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();

		for (List<String> ll : data) {
			//System.out.println(ll);
		}

		List<String> firstList = data.get(0);

		String value = firstList.get(0);

		System.out.println(value);//Erin
		
	String lastName	= data.get(0).get(1);
	
	System.out.println(lastName);//Smith
	
	String mobile = data.get(1).get(3);
	
	System.out.println(mobile);

	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("Clicking on submit button");
	}

	@Then("User should see confirmation")
	public void user_should_see_confirmation() {
		System.out.println("confirmation message");
	}

}
