package BDDSteps;

import java.util.List; 	 	 	 	

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BDDsteps {
	int count;
	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is given 1");
	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_and_password(String arg1, String arg2) throws Throwable {
	    Assert.assertEquals(false, true);
	    System.out.println("Added Step");
	}

	
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is given 2");
	    System.out.println("Added Step");
	}

	@When("^User sign up following details$")
	public void user_sign_up_following_details(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>>obj = arg1.raw();
	System.out.println(obj.get(0).get(0));	
	System.out.println(obj.get(0).get(1));	
	System.out.println(obj.get(0).get(2));	
		
	}
	    

	
	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("I am on Landind Page");
	  
	}

	@Then("^cards are displayed$")
	public void cards_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("I am on Landind Page");
		 
		}
	@And("^cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
	}
	
	@Given("^User is login page$")
	public void user_is_login_page() throws Throwable {
		int count = 0;
	 System.out.println("I am in given of data driven");
	 
	 count=count+1;
	 System.out.println(count);
	}

	
	@When("^User Login Page following with (.+) and password (.+)$")
    public void user_login_page_following_with_and_password(String username, String password) throws Throwable {
		System.out.println("This is under rgression");
		System.out.println("UserName is and paddword is:"+username+password);
		System.out.println("UserName is and paddword is:"+username+password);
		System.out.println("UserName is and paddword is:"+username+password);
		
		
    }
	
	@Given("^User is on Account Page$")
    public void user_is_on_account_page() throws Throwable {
        System.out.println("User is on account page");
    }
	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This given should be executed before each test");
	}

	@When("^Browser is triggered$")
	public void browser_is_triggered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This when should be executed before each test");
	}

	@Then("^check browser is started$")
	public void check_browser_is_started() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This then should be executed before each test");
		
	}
	
	@Given("^use lands on page$")
	public void use_lands_on_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("This is before code");
	}

	@When("^User Login Page following with username(\\d+) and password(\\d+)$")
	public void user_Login_Page_following_with_username_and_password(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("landing page code");
	}

	@Then("^Home pageHM(\\d+) is populated$")
	public void home_pageHM_is_populated(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("dsds");
	}
	

	@Then("^New Test added for dry run$")
	public void new_Test_added_for_dry_run() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Test is for dry run");
	}
	
	


}
