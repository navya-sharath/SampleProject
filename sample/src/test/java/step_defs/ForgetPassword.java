package step_defs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgetPassword {
	WebDriver driver;
	@Given("i visit magento website")
	public void i_visit_magento_website() {
		driver = new ChromeDriver();
		  driver.get("https://magento.softwaretestingboard.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  

	}

	@When("i click on sign in linktext")
	public void i_click_on_sign_in_linktext() {
		driver.findElement(By.xpath("//li[@class='authorization-link']")).click();
	}

	@When("i click on forget password button")
	public void i_click_on_forget_password_button() {
		driver.findElement(By.xpath("//a[@class='action remind']")).click();

	}
	@When("i enter email {string}")
	public void i_enter_email(String string) {
		driver.findElement(By.id("email_address")).sendKeys(string);
	}
	@When("i click reset my password")
	public void i_click_reset_my_password() {
	    driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
	}

	@Then("i should see the {string} message")
	public void i_should_see_the_message(String string) {
	  driver.findElement(By.xpath("//div[@class='message-success success message']")).isDisplayed();
	}



	


}
