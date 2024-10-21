package LoginTestPage;

import TestLoginPage.TestLogin;
import baseDriver.Base_Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestPage {

    private WebDriver driver;


    @Test
    public void checkLoginPage()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        TestLogin testLogin = new TestLogin(driver);
        testLogin.setUsernameFiled("student");
        testLogin.setPasswordField("Password123");
        testLogin.setLoginButton();
    }

}
