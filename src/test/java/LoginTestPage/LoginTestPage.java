package LoginTestPage;

import TestLoginPage.TestLogin;
import TestLoginPage.TestLoginSuccessfully;
import baseDriver.Base_Driver;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestPage extends Base_Driver {

    private WebDriver driver;

    @Test
    public void checkLoginPage()
    {
        driver = super.driver;
        TestLogin testLogin = new TestLogin(driver);
        testLogin.setUsernameFiled("student");
        testLogin.setPasswordField("Password123");
        testLogin.setLoginButton();
    }
    @Test
    public void checkValidationMessage()
    {
        TestLoginSuccessfully testLoginSuccessfully = new TestLoginSuccessfully(driver);
        Assert.assertEquals(testLoginSuccessfully.getText(),"Logged In Successfully","Page is not found");

    }
}
