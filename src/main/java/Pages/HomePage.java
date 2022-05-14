package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    By loginText = By.linkText("Log in");
    By RegistrationText =By.linkText("Register");
    By ResetPasswordText =By.linkText("Forgot password?");
    By SearchText=By.id("small-searchterms");
    By switchCurrencyTab =By.xpath("//*[@id=\"customerCurrency\"]");
    By USCurrencyTab=By.xpath("//*[@id=\"customerCurrency\"]/option[1]");
    By EUROCurrencyTab=By.xpath("//*[@id=\"customerCurrency\"]/option[2]");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage ClickLoginIn(){
        driver.findElement(loginText).click();
        return new LoginPage(driver);
    }
    public RegistrationPage ClickRegistration(){
        driver.findElement(RegistrationText).click();
        return new RegistrationPage(driver);
    }
    public ResetPasswordPage clickResetPassword(){
        driver.findElement(ResetPasswordText).click();
        return new ResetPasswordPage(driver);
    }
    public SearchPage clickSearch(){
      driver.findElement(SearchText).click();
      return new SearchPage(driver);
    }
    public void SwitchCurrencies(){
     driver.findElement(switchCurrencyTab).click();
    }
    public void setUSCurrencyTab(){
        driver.findElement(USCurrencyTab).click();
    }
    public void setEUROCurrencyTab(){
        driver.findElement(EUROCurrencyTab).click();
    }
}
