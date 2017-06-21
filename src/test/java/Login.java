import Actions.UserAction;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class Login extends BaseTest {

    private static UserAction userAction;


    @BeforeClass
    public static void before(){
        userAction = new UserAction();
    }



    @Test
    public void loginTest() throws Exception {
        userAction.sendLoginRequest("admin@admin.com", "123456");
        assertThat(UserAction.loginResponse.getMessage(), containsString("/account"));
        assertThat(UserAction.loginResponse.getResType(), containsString("success"));
    }

    @Test
    public void getUserData() throws Exception {
        userAction.sendGetUserDataRequest();
        System.out.println(UserAction.user.toString());
        assertThat(UserAction.user.getDate().getEmail(), is("admin@admin.com"));
    }
}
