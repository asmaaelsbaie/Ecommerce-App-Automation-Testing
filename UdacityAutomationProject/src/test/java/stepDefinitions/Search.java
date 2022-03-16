package stepDefinitions;

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


    @And("user navigates to home page")
    public void user_Navigates_to_home_page() {
       Hook.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user click on search field")
    public void user_click_on_search_field() {
     Hook.driver.findElement(By.id("small-searchterms")).click();
    }

    @And("^user search with \"(.*)\" of product$")
    public void user_search_with_name_of_product(String productName) {
      Hook.driver.findElement(By.id("small-searchterms")).sendKeys(productName);
      Hook.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();

    }

    @Then("user could find relative results")
    public void user_could_find_relative_results() {
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
