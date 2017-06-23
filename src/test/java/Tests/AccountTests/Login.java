package Tests.AccountTests;

import Actions.UserAction;
import Tests.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class Login extends BaseTest {

    private static UserAction userAction;
    @Parameter
    public String login;
    @Parameter(1)
    public String pass;

    @BeforeClass
    public static void before(){
        userAction = new UserAction();
    }


    @Parameters(name = "{0} ")
    public static Iterable<Object[]> dataorTest() {
        return Arrays.asList(new Object[][]{
                {"admin@admin.com","123456"},
                {"admin@admin.com","123456"},
                {"admin@admin.com2","123456"},
        });
    }


    @Test
    public void loginTest() throws Exception {
        userAction.sendLoginRequest(login, pass);
        assertThat(UserAction.loginResponse.getMessage(), containsString("/account"));
        assertThat(UserAction.loginResponse.getResType(), containsString("success"));
    }

    @Test
    public void getUserData() throws Exception {
        userAction.sendGetUserDataRequest();
        System.out.println(UserAction.user.toString());
        assertThat(UserAction.user.getData().getEmail(), is("admin@admin.com"));
    }
}
