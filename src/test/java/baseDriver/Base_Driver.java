package baseDriver;

import LoginTestPage.LoginTestPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Base_Driver {


    protected WebDriver driver;



    @BeforeClass
    public void access() throws IOException
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(file.toPath(), new File("C:\\Users\\Anushka\\Downloads\\screenshots\\screenshot.jpg").toPath());
    }
//    @AfterClass
//    public void GenerateReports()
//    {
//        ExtentReports reports = new ExtentReports("C:\\Users\\Anushka\\Downloads\\reports");
//        ExtentTest test = reports.startTest("Report 1");
//    }
}

