package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ResetPassword {
   @And("click Forget password")
    public void click_Forget_password(){
       Hook.driver.findElement(By.linkText("Forgot password?")).click();
   }
   @And("^enter login email\"(.*)\"$")
    public void enter_login_email(String email){
       Hook.driver.findElement(By.id("Email")).sendKeys(email);

    }
    @When("click recovre Button")
    public void click_recovre_Button(){
       Hook.driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]")).click();
    }
}
