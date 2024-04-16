package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^User is on NetBanking Landing Page$")
	public void user_is_on_NetBanking_Landing() throws Throwable {
		System.out.println("Navigated to login url");
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Validated home page");
	}

	@When("User login into application with {string} and {string}")
	public void user_login_into_application_with_and(String string1, String string2) {
		System.out.println(string1);
		System.out.println(string2);
	}

	@Then("Cards are displayed are {string}")
	public void cards_are_displayed_are(String string) {
		System.out.println(string);
	}

	@When("User sign up with following details")
	public void user_sign_up_with_following_details(DataTable data) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<List<String>> obj = data.asLists();

		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));

	}

	@When("Login with {string} and {string}")
	public void login_with_and(String string, String string2) {
	    System.out.println(string);
	    System.out.println(string2);
	}
	
	@Given("Validate the browser")
	public void validate_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Validating Browser");
	}
	@When("Browser is triggered")
	public void browser_is_triggered() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Browser is triggered");
	}
	@Then("Check if browser is started")
	public void check_if_browser_is_started() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Browser started");
	}

	@Given("User is on Mobile Login Page")
	public void user_is_on_mobile_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Mobile login page");
	}
	@When("User login into mobile with {string} and {string}")
	public void user_login_into_mobile_with_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is logging with username and password");
	}
	@Then("Home screen is observed")
	public void home_screen_is_observed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Mobile home screen is loaded");
	}
	@Then("User can click on the apps")
	public void user_can_click_on_the_apps() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is clicking on the app");
	}

	@Given("User has logged in")
	public void user_has_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User has logged in already");
	}
	@When("User clicks on the app")
	public void user_clicks_on_the_app() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User clicked on the app");
	}
	@Then("App is launched")
	public void app_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("App is launched");
	}
	@Then("User can see app details")
	public void user_can_see_app_details() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User can see app details now");
	}


}
