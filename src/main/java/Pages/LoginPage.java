package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    By emailField =By.id("Email");
    By passwordField=By.id("Password");
    By loginButton =By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void sendData(String Email , String password){
        driver.findElement(emailField).sendKeys(Email);
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

}
