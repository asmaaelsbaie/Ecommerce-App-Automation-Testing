package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectDifferentCatogies {
    List<WebElement>Categories;
    int randomCat;

    @Given("make list of all categories")
    public void list_of_all_categories(){
        Categories =Hook.driver.findElements(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li/a"));


    }
    @When("select Random product")
    public void select_Random_product(){

        Random random= new Random();
       randomCat =random.nextInt(Categories.size());
    }
    @Then("open product Details")
    public void open_product_Details(){
        Categories.get(randomCat).click();
    }
}
