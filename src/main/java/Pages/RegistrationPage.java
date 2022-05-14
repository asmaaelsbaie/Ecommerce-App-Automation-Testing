package Pages;


import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegistrationPage {
    public WebDriver driver;
    By FirstNameField = By.id("FirstName");
    By LastNameField  = By.id("LastName");
    By EmailField = By.id("Email");
    By PasswordField = By.id("Password");
    By ConfirmPasswordField =By.id("ConfirmPassword");
    By RegisterButton =By.id("register-button");
    By ContinueButton =By.className("button-1 register-continue-button");
    By result =By.className("result");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterData(String firstName,String lastName,String Email,String passWord,String confirmPassword){
        driver.findElement(FirstNameField).click();
        driver.findElement(FirstNameField).sendKeys(firstName);
        driver.findElement(LastNameField).click();
        driver.findElement(LastNameField).sendKeys(lastName);
        driver.findElement(EmailField).sendKeys(Email);
        driver.findElement(PasswordField).sendKeys(passWord);
        driver.findElement(ConfirmPasswordField).sendKeys(confirmPassword);
    }
    public void ClickRegisterButton(){
        driver.findElement(RegisterButton).click();
    }
    public void AssertMassage(){
        String msg =driver.findElement(result).getText();
       // Assert.assertTrue(msg.contains("Your registration completed"),"not Contain");
    }
    public void ClickContinueButton(){
        driver.findElement(ContinueButton).click();
    }

}
