package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class AddToCompareList {
    By compareList = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[2]");

    @Then("Add to Compare List")
    public void Add_to_Compare_List(){
        Hook.driver.findElement(compareList).click();
    }
}
