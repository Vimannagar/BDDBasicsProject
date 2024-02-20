package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithData {
	//CTRL + SHIFT + O
	
	@Given("I am at the landing page")
	public void i_am_at_the_landing_page() {
	   System.out.println("Given statement");
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String uname) {
	  System.out.println("Entered username is "+uname);
	}

	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
	   System.out.println("Entered password is "+string);
	}


@When("I click on submit {int} button")
public void i_click_on_submit_button(Integer int1) {
    System.out.println("Click on submit and data is "+int1);
}


	@Then("I should get logged into app")
	public void i_should_get_logged_into_app() {
	   System.out.println("User logged in");
	}

}
