package Tests.AccountTests;

import Actions.UserAction;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
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
    private static UserAction userAction;
    @Parameter
    public String login;
    @Parameter(1)
    public String pass;

    @BeforeClass
    public static void before(){
        userAction = new UserAction();
    }


    @Parameters(name = "Login: {0} Password: {1} ")
    public static Iterable<Object[]> dataorTest() {
        return Arrays.asList(new Object[][]{
                {"admin@admin.com","123456"},
                {"admin@admin.com","123456"}
        });
    }


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
