package cucumber.stepDef;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;

    String baseUrl = "https://kasirdone.belajarqa.com/";

    @Given("user is on KasirAja login page")
    public void user_is_on_kasir_aja_login_page(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(false);

        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(time):60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }


    @When("user input (.*) as email$")
    public  void  user_input_tdd_selenium_gmail_com_as_email(String email){
        driver.findElement(By.id("email")).sendKeys(email);
    }


    @And("user input (.*) as password$")
    public  void  user_input_tdd_selenium_as_password(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }
}
