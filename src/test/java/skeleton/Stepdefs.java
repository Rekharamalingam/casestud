package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		    
	}

	@When("user provides {string}")
	public void user_provides(String username) {
	   driver.findElement(By.name("userName")).sendKeys(username);
	}

	@Given("user provides the {string}")
	public void user_provides_the(String password) {
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Given("press login button")
	public void press_login_button() {
	    driver.findElement(By.name("Login")).click();
	}

	@Then("user rendered to TestMeApp home page")
	public void user_rendered_to_TestMeApp_home_page() {
	    driver.findElement(By.tagName("span")).click();
	}

	}

