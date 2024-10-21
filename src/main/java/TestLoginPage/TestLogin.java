package TestLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestLogin {


    private WebDriver driver;
    private By usernameFiled;
    private By passwordField;
    private By loginButton;

    public TestLogin (WebDriver driver)
    {
        this.driver= driver;
        this.usernameFiled = By.id("username");
        this.passwordField = By.id("password");
        this.loginButton = By.id("submit");
    }
    public void setLoginButton() {
        this.driver.findElement(this.loginButton).click();
    }

    public void setUsernameFiled(String usernameFiledValue) {
        this.driver.findElement(this.usernameFiled).sendKeys(usernameFiledValue);
    }

    public void setPasswordField(String passwordFieldVale) {
        this.driver.findElement(this.passwordField).sendKeys(passwordFieldVale);
    }











}
