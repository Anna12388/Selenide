package tests;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class LoginTest extends BaseTest {

    @Test
    public void login(){
        loginPage.open()
                .inputEmailAndPassAndSubmit(email, password);

//        $(By.id("createButton")).shouldBe(Condition.visible);


    }
}
