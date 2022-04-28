package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class WishList {
    By wishList1 =By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[3]");
     @Then("Click Wish Button")
    public void Click_Wish_Button(){
         Hook.driver.findElement(wishList1).click();
     }
}
