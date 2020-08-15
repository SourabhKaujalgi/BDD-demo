package BDDSteps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobject.Pageobjectdemo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mystepdefination extends Base{
	WebDriverWait wait = new WebDriverWait(driver,30);
	Pageobjectdemo paged=new Pageobjectdemo(driver);
	
	  @Given("^User is on Greencart Landing Page$")
	    public void user_is_on_greencart_landing_page() throws Throwable {
			
			driver.manage().window().maximize();
	        
	    }

	  @When("^User Searched for \"([^\"]*)\" Vagitables$")
	    public void user_searched_for_something_vagitables(String strArg1) throws Throwable {
	    	paged.getsearch().sendKeys(strArg1);
	    	
	    	//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
	    	driver.findElement(By.xpath("//button[@class='search-button']")).click();
	    	
	    }
	  

	    @Then("^\"([^\"]*)\" should be displayed$")
	    public boolean something_should_be_displayed(String strArg1) throws Throwable {
	    	if(driver.findElement(By.xpath("//h4[@class='product-name']")).isDisplayed())
	    	{
	    		System.out.println("Element displayed");
	    		return true;
	    	}
	    	else{
		return false;
	    	}
	    }
	    
	    @Then("^added items to cart$")
	    public void added_items_to_cart() throws Throwable {
	    	
	    	driver.findElement(By.cssSelector("a.increment")).click();
	    	driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
	    	Thread.sleep(4000);
	    	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	    	System.out.println("Cart is clicked");
	    	Thread.sleep(4000);
	    	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='PROCEED TO CHECKOUT']"))).click();
	    	driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
	    	
	       
	    }


	    @Then("^\"([^\"]*)\" should be displayed in check out page$")
	    public void something_should_be_displayed_in_check_out_page(String strArg1) throws Throwable {
	    	driver.findElement(By.xpath("//p[@class='product-name']")).getText().contains(strArg1);
	        
	    }
	    

	    @And("^User proceed to checkout page for purchase$")
	    public void user_proceed_to_checkout_page_for_purchase() throws Throwable {
	    	
//	    	List<WebElement> placeorder= driver.findElements(By.xpath("//button[text()='Place Order']"));
//	       
//	    	for(int i=0;i<placeorder.size();i++)
//	    	{
//	    		placeorder.get(1).click();
//	    	}
//	       
	    	
	    	System.out.println("User is on checkout page");
	    }
	    
	    @When("^User Searched for (.+) Vagitable$")
	    public void user_searched_for_vagitable(String name) throws Throwable {
	    	paged.getsearch().sendKeys(name);
	        
	    }
	    
	    @Then("^(.+) should be displayed in check out page$")
	    public void should_be_displayed_in_check_out_page(String name) throws Throwable {
	    	driver.findElement(By.xpath("//p[@class='product-name']")).getText().contains(name);
	        
	    }
	

}
