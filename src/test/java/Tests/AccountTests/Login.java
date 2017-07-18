package Tests.AccountTests;

import Actions.UserAction;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.util.Arrays;

import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@Features("Account Feature")
@Stories("Account Stories")
@Title("Login Tests")
public class Login extends BaseAcountTest{



    @After
    public void setDown()throws Exception{
//        userAction.sendLoginRequest("","");
    }

    @Title("Login Test with valid Credentials")
    @Test
    public void loginTest() throws Exception {
        userAction.sendLoginRequest(login, pass);
        userAction.checkLoginResponse();
    }

    @Title("Get User Data after Login")
    @Test
    public void getUserData() throws Exception {
        userAction.sendGetUserDataRequest();
        userAction.checkEmail("admin@admin.com");
    }
}
