package LoginTestPage;

import TestLoginPage.TestLogin;
import baseDriver.Base_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestPage extends Base_Driver {

    private WebDriver driver;


    @Test
    public void checkLoginPage()
    {

        TestLogin testLogin = new TestLogin(driver);
        testLogin.setUsernameFiled("student");
        testLogin.setPasswordField("Password123");

    }

}
