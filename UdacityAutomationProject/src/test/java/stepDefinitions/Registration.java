package stepDefinitions;

import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.sql.SQLOutput;

public class Registration {
    RegistrationPage registrationPage;
    @And("click on Register")
    public void click_on_Register() {
        registrationPage=Hook.homePage.ClickRegistration();
    }

    @When("^user enter \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\"$")
    public void user_enter_data(String firstName, String lastName, String Email, String password, String confirmedPssword) {
        registrationPage.enterData(firstName,lastName,Email,password,confirmedPssword);

    }
    @And("click on Register Button")
    public void click_Register_Button(){

        registrationPage.ClickRegisterButton();
    }
    @Then("complete massage appear")
    public void complete_massage_appear() {
     registrationPage.AssertMassage();
    }
    @And("click Continue Button")
    public void click_Continue_Button(){
       registrationPage.ClickContinueButton();
    }

}
