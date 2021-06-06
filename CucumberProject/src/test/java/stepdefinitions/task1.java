package stepdefinitions;



import org.junit.Assert;

import com.pages.task1page;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class task1 {

	private task1page page = new task1page(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("user logs in to the application")
	public void user_logs_in_to_the_application() {
	    page.enterUserName();
		page.enterPassword();
		page.clickOnLogin();
	}

	@Then("user is on dashboard page")
	public void user_is_on_dashboard_page() {
		String title = page.getPageTitle();
		System.out.println("Page title is: " + title);
		String expectedTitleName = "OrangeHRM";
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("user nevigate to manager reviews page")
	public void user_nevigate_to_manager_reviews_page() {
		page.NevigateToManagerReview();
	}

	@When("user search for the employee")
	public void user_search_for_the_employee() throws InterruptedException {
		page.Searchfor();
		
	}

	@Then("user click to Evaluate option")
	public void user_nevigate_to_evaluate_option() {
	   page.clickOnEvaluate();
	}

	@Then("user add ratings and save")
	public void user_add_ratings_and_save() {
	    page.rating();
	}
}
