package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage{

    public LoginPage open(){
        Selenide.open("/login");
        return this;
    }
    public LoginPage inputEmailAndPassAndSubmit(String email, String pass){
        $(By.name("email")).setValue("annab2022@internet.ru");
        $(By.xpath("//*[@placeholder = 'Password']")).setValue("Oscar202010").submit();
        return this;
    }

    public static final By PASSWORD_INPUT = By.xpath("//*[@placeholder = 'Password']");
    @Override
    public boolean isPageOpen(){
        return isExist(PASSWORD_INPUT);
    }
}
