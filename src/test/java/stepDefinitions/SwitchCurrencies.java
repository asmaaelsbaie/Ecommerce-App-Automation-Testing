package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class SwitchCurrencies {
    @When("click List currency option")
    public void click_List_currency_option(){
        Hook.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]")).click();
    }
    @Then("US Appeare")
    public void US_Appeare(){
        Hook.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]/option[1]")).click();
    }
    @Then("EURO Appeare")
    public void EURO_Appeare(){
        Hook.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]/option[2]")).click();
    }
}
