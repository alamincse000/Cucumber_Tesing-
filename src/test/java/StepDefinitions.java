

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    LoginPage loginPage;
    WebDriver driver;

    @Given("^User visits e-commerce website$")
    public void user_visits_e_commerce_website() throws Exception {
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        FirefoxOptions ops = new FirefoxOptions();
        ops.addArguments("--headed"); //uncomment if you want to run in headless mode
        driver = new FirefoxDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/");

    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin(username,password);

    }

    @Then("^User can logged in successfully$")
    public void user_can_logged_in_successfully() throws Exception {
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.btnSubmitLogin.isDisplayed());
        loginPage.btnSubmitLogin.click();
        driver.close();


    }


}
