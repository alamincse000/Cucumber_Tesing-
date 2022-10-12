package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(className="login")
    WebElement linkLogin;
    WebDriver driver;
    @FindBy(id="email")
    WebElement txtEmail;
    @FindBy(id="passwd")
    WebElement txtPassword;
    @FindBy(id="SubmitLogin")
   public WebElement btnSubmitLogin;
    @FindBy(className = "logout")
    WebElement logOutbtn;


    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public void doLogin(String email,String password) throws InterruptedException {
        linkLogin.click();
        Thread.sleep(1000);
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        Thread.sleep(1000);
        btnSubmitLogin.click();
        logOutbtn.click();
    }

}
