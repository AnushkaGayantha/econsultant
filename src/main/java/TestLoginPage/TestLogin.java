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
        driver.findElement(this.loginButton).click();
    }

    public void setUsernameFiled(String usernameFiledValue) {
        driver.findElement(this.usernameFiled).sendKeys(usernameFiledValue);
    }

    public void setPasswordField(String passwordFieldVale) {
        driver.findElement(this.passwordField).sendKeys(passwordFieldVale);
    }











}
