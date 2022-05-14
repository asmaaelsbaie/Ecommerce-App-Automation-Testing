package stepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login {
LoginPage loginPage;
    @Given("click login")
    public void click_login() {
       loginPage= Hook.homePage.ClickLoginIn();
    }

    @When("^enter valid \"(.*)\" and \"(.*)\"$")
    public void user_enter_validData(String Email, String password) {
        loginPage.sendData(Email,password);

    }

    @And("click on login button")
    public void click_on_login_button() {
      loginPage.clickLoginButton();
    }
    @When("^enter invalid \"(.*)\" and \"(.*)\"$")
    public void user_enter_inValidData(String Email, String password) {
       loginPage.sendData(Email,password);
    }


}
