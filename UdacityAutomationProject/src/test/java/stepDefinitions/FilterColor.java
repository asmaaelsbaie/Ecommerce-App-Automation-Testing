package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class FilterColor {
    By colorSelCate    = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a");
    By colorSelSubCate = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/ul/li[1]/a");
    By coloFilter      = By.cssSelector("input[id =\"attribute-option-15\"]");
    By colorCheck      = By.cssSelector("div[class=\"picture\"]");
    Actions act = new Actions(Hook.driver);

    @Given("selects Category and hover to open sub-Category")
    public void selects_Category_and_hover_to_open_sub_Category() throws InterruptedException {

        act.moveToElement(Hook.driver.findElement(colorSelCate))
                .moveToElement(Hook.driver.findElement(colorSelSubCate))
                .click().build().perform();
        Thread.sleep(5000);
    }
    @When("filter sub-Category with color")
    public void filter_sub_Category_with_color(){
        Hook.driver.findElement(coloFilter).click();
    }
    @Then("find product with the selected color")
    public void find_product_with_the_selected_color(){
        Hook.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue(Hook.driver.findElement(colorCheck).isDisplayed(),
                "Error Message: Selected Color Not Found!");
    }








}
