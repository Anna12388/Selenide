package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    LoginPage loginPage;


    @BeforeMethod
    public void setUp(){
        Configuration.baseUrl = "https://app.qase.io";
        Configuration.headless = true;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.savePageSource = false;
        Configuration.screenshots = false;
        Configuration.timeout = 5000;


        loginPage = new LoginPage();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        getWebDriver().quit();
    }

}
