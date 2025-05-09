package Step_Definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Login_Steps {

	WebDriver driver ;
	LoginPage lp ;

	@Given("user should be open chrome browser")
	public void user_should_be_open_chrome_browser() {
	    driver = new ChromeDriver ();
	    driver.get("https://javabykiran.com/liveproject/index.html");
	    lp = new LoginPage (driver) ;
	}

	@When("user enters username,password")
	public void user_enters_username_password() {
	    lp.enterUsername("kiran@gmail.com");
	    lp.enetrPassword("123456");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    lp.clickSignin();
	   
	}

	@Then("page should be navigate home page")
	public void page_should_be_navigate_home_page() {
	   Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	   
	}

	@When("user enters {string}, {string}")
	public void user_enters(String invalidusername, String invalidpassword) {
	    lp.enterUsername(invalidusername);
	    lp.enetrPassword(invalidpassword);
	}
		   
	
	 

	   @Then("error message should be display to the user")
	   public void error_message_should_be_display_to_the_user() {
	      String Actual = driver.findElement(By.id("email_error")).getText();
	      String Expected = "Please enter email as kiran@gmail.com";
		   Assert.assertEquals(Actual, Expected);
	       
	   }

	@Then("close the browser")
	public void close_the_browser() {
	   if (driver != null)
		   driver.quit();
	   
	   
	  

	    
	}



	
	
}
