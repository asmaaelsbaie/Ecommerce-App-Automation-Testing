package stepDefinitions;

import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook {
  static   WebDriver driver ;
  protected static HomePage homePage;

    @Before
    public static  void user_open_chrome_browser() {
        // System.setProperty("","");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
         homePage = new HomePage(driver);
    }
    @After
    public static  void user_close_the_driver() throws InterruptedException{
        Thread.sleep(2000);
        //driver.quit();
    }
}
