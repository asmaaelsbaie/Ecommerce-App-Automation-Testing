package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class SwitchCurrencies {
    @When("click List currency option")
    public void click_List_currency_option(){
      Hook.homePage.SwitchCurrencies();
    }
    @Then("US Appeare")
    public void US_Appeare(){
        Hook.homePage.setUSCurrencyTab();
    }
    @Then("EURO Appeare")
    public void EURO_Appeare(){
        Hook.homePage.setEUROCurrencyTab();
    }
}
