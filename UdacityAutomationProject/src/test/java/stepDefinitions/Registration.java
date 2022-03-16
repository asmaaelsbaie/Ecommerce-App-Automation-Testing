package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.sql.SQLOutput;

public class Registration {
    @And("click on Register")
    public void click_on_Register() {
        Hook.driver.findElement(By.linkText("Register")).click();

    }

    @When("^user enter \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\"$")
    public void user_enter_data(String fristName, String lastName, String Email, String password, String confirmedPssword) {

        Hook.driver.findElement(By.id("FirstName")).sendKeys(fristName);
        Hook.driver.findElement(By.id("LastName")).sendKeys(lastName);
        Hook.driver.findElement(By.id("Email")).sendKeys(Email);
        Hook.driver.findElement(By.id("Password")).sendKeys(password);
        Hook.driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmedPssword);

    }
    @And("click on Register Button")
    public void click_Register_Button(){
        Hook.driver.findElement(By.id("register-button")).click();
    }
    @Then("complete massage appear")
    public void complete_massage_appear(){
        System.out.println(Hook.driver.findElement(By.className("result")).getText());
        //Assert.assertTrue(Hook.driver.findElement(By.className("result")).getText().contains("Your registration completed"));
    }
    @And("click Continue Button")
    public void click_Continue_Button(){
        Hook.driver.findElement(By.className("button-1 register-continue-button")).click();
    }

}
