package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPasswordPage {
    public WebDriver driver;
    By clickEmail = By.id("Email");
    By clickRecover=By.cssSelector("button[class=\"button-1 password-recovery-button\"]");

    public ResetPasswordPage(WebDriver driver) {

        this.driver = driver;
    }
    public void enterEmail(String email){
        driver.findElement(clickEmail).sendKeys(email);
    }
    public void setClickRecover(){
        driver.findElement(clickRecover).click();
    }

}
