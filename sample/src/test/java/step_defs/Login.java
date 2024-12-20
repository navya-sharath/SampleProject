package step_defs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
WebDriver driver;
@Given("I navigate to Magento Website")
public void i_navigate_to_magento_website() {
	driver = new ChromeDriver();
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@When("I click on {string} Linktext")
public void i_click_on_linktext(String string) {
	 driver.findElement(By.xpath("//li[@class='authorization-link']")).click();
}

@When("I enter the Email {string}")
public void i_enter_the_email(String string) {
	driver.findElement(By.id("email")).sendKeys(string);
}

@When("I enter the Password {string}")
public void i_enter_the_password(String string) {
	driver.findElement(By.id("pass")).sendKeys(string);
	
}

@When("I click on the {string} button")
public void i_click_on_the_button(String string) {
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();

}

@Then("I should see the {string} message")
public void i_should_see_the_message(String string) {
	System.out.println("dont enter in email");
}

@When("I dont enter the Email")
public void i_dont_enter_the_email() {
	driver.findElement(By.id("email")).isDisplayed();
}

@When("I dont enter the Password")
public void i_dont_enter_the_password() {
    System.out.println("i dont enter password");
  
}



}