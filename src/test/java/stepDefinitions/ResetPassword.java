package stepDefinitions;

import Pages.ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ResetPassword {
    ResetPasswordPage resetPasswordPage;
   @And("click Forget password")
    public void click_Forget_password(){

       resetPasswordPage =Hook.homePage.clickResetPassword();
   }
   @And("^enter login email\"(.*)\"$")
    public void enter_login_email(String email){
       resetPasswordPage.enterEmail(email);

    }
    @When("click recovre Button")
    public void click_recovre_Button(){
       resetPasswordPage .setClickRecover();  }
}
