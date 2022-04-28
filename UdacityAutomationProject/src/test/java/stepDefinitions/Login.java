package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login {

    @Given("click login")
    public void click_login() {

        Hook.driver.findElement(By.linkText("Log in")).click();
    }

    @When("^enter valid \"(.*)\" and \"(.*)\"$")
    public void user_enter_validData(String Email, String password) {
        Hook.driver.findElement(By.id("Email")).sendKeys(Email);
        Hook.driver.findElement(By.id("Password")).sendKeys(password);

    }

    @And("click on login button")
    public void click_on_login_button() {
       Hook.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();
        System.out.println("click Login");

       // Hook.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
    }
    @When("^enter invalid \"(.*)\" and \"(.*)\"$")
    public void user_enter_inValidData(String Email, String password) {
        Hook.driver.findElement(By.id("Email")).sendKeys(Email);
        Hook.driver.findElement(By.id("Password")).sendKeys(password);
    }


}
