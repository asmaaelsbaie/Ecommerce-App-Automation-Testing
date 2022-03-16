package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class AddDifferentProduct {
    @Then("^user click to add \"(.*)\" to cart$")
    public void click_to_add_to_cart(String xpath){
        Hook.driver.findElement(By.xpath(xpath)).click();
    }

}
