package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver ;
    By searchField= By.id("small-searchterms");
    By searchButton=By.cssSelector("button[class=\"button-1 search-box-button\"]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void searchProduct(String productName){
        driver.findElement(searchField).sendKeys(productName);
        driver.findElement(searchButton).click();
    }
}
