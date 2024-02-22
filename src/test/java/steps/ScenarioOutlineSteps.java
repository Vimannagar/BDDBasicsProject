package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	

@Given("user is at signup")
public void user_is_at_signup() {
    System.out.println("Given statement");
}

@When("user enters name as {string} in form")
public void user_enters_name_as_in_form(String string) {
   System.out.println("Entered name is "+string);
}

@When("user enters age as {int}")
public void user_enters_age_as(Integer int1) {
   System.out.println("Entered age is "+int1);
}

@When("user confirms {string} radio button")
public void user_confirms_radio_button(String string) {
  System.out.println("Confirmed radio button is "+string);
}

@Then("user gets created")
public void user_gets_created() {
    System.out.println("Then statement");
}

}
