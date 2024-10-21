package TestLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestLoginSuccessfully {


    private WebDriver driver;
    private By SuccessfullyPage = By.xpath("//h1[@class='post-title']");

    public TestLoginSuccessfully(WebDriver driver)
    {
        this.driver=driver;
    }

    public String getText()
    {
        return driver.findElement(SuccessfullyPage).getText();
    }
}
