package stepDefinitions;

import Pages.SearchPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Search {
SearchPage searchPage ;

    @Given("click on search field")
    public void click_on_search_field() {
     searchPage =Hook.homePage.clickSearch();

    }

    @When("^search with \"(.*)\" of product$")
    public void search_with_name_of_product(String productName) {
          searchPage.searchProduct(productName);

    }

    @Then("find relative results")
    public void find_relative_results() {
        int count = Hook.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();
        System.out.println(count);
        Assert.assertTrue(count>0);

        ArrayList prodList=new ArrayList <String>();

        for (int x = 0; x < count; x++) {
            System.out.println(Hook.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            prodList.add(Hook.driver.findElement(By.cssSelector("h2[class=\"product-title\"] a")).getText());
           Assert.assertTrue(Hook.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().toLowerCase().contains("book"));

        }
        System.out.println(prodList);
    }


}
