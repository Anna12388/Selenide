package tests;

import com.codeborne.selenide.Configuration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.PropertyReader;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    String email, password;

    LoginPage loginPage;


    @BeforeMethod
    public void setUp(){
        Configuration.baseUrl = System.getenv().getOrDefault("QASE_URL", PropertyReader.getProperty("qase.url"));
        email = System.getenv().getOrDefault("QASE_EMAIL", PropertyReader.getProperty("qase.email"));
        password = System.getenv().getOrDefault("QASE_PASSWORD", PropertyReader.getProperty("qase.password"));

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
