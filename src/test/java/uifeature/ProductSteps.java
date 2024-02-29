package uifeature;

import io.cucumber.java.en.When;
import pages.ProductPage;
import qa.DriverFactory;

public class ProductSteps {

	ProductPage product = new ProductPage(DriverFactory.getDriver());
	
	@When("user clicks on cart icon")
	public void user_clicks_on_cart_icon() {
	   product.clickOnIcon();
	}

	@When("user click on signin")
	public void user_click_on_signin() {
	  product.clickOnsignIn();
	}
}
