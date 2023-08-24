package tests;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login(){
        loginPage.open()
                .inputEmailAndPassAndSubmit("annab2022@internet.ru","Oscar202010");

        
    }
}
