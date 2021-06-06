package stepdefinitions;

import com.pages.task1page;
import com.pages.task2page;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class task2 {

	private task2page page = new task2page(DriverFactory.getDriver());
	
	
	@Given("user is on paytm home page")
	public void user_is_on_paytm_home_page() {
		DriverFactory.getDriver().get("https://paytm.com/");
	}

	@When("user click on metro menu")
	public void user_click_on_metro_menu() {
	   page.ClickMetroMenu();
	}
	
	@And("^user enter the all detail \"([^\"]*)\" Card Type and Card Number and proceed$")
    public void user_enter_the_all_detail_something_card_type_and_card_number_and_proceed(String metroname) throws Throwable {
        page.fillvalue(metroname);
    }

	@And("user verify the card balance page")
	public void user_verify_the_card_balance_page() {
	    page.Verifypage();
	    
	}

	
}
