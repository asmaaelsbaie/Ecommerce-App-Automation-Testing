package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class SelectDifferentTag {
    By awesomeTag = By.cssSelector("a[href =\"/awesome\"]");
    By computerTag= By.cssSelector("a[href=\"/computer\"");
    @Then("select awesome tag")
    public void select_awesome_tag() throws InterruptedException {
        Hook.driver.findElement(awesomeTag);

    }
    @Then("select computer tag")
    public void select_computer_tag(){
       // Hook.driver.navigate().back();
        Hook.driver.findElement(computerTag);
    }
}
