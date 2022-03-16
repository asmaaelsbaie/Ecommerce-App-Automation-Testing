package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class CreateOrder {
    @Then("click Shopping cart")
    public void click_Shopping_cart(){
        Hook.driver.findElement(By.className("cart-label")).click();
    }
    @When("check Agree Services")
    public void check_Agree_Services(){
        Hook.driver.findElement(By.id("termsofservice")).click();
    }
    @Then("Click Checkout Button")
    public void Click_Checkout_Button(){
        Hook.driver.findElement(By.id("checkout")).click();
    }
}
