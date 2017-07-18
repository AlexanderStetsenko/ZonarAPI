package Tests.AccountTests;

import Actions.UserAction;
import HTTP.RequestBase;
import Settings.MySettings;
import Tests.BaseTest;
import com.mashape.unirest.request.BaseRequest;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class BaseAcountTest extends BaseTest{

    protected static UserAction userAction;
    @Parameterized.Parameter
    public String login;
    @Parameterized.Parameter(1)
    public String pass;


    @Parameterized.Parameters(name = "Login: {0} Password: {1} ")
    public static Iterable<Object[]> dataForTest() {
        RequestBase req = new RequestBase();
        System.out.println("Inicialize Data for Test");
        return Arrays.asList(new Object[][]{
                {MySettings.testSettings.getUser(), MySettings.testSettings.getPassword()},
                {MySettings.testSettings.getUser(), MySettings.testSettings.getPassword()}

        });
    }

    @BeforeClass
    public static void before(){
        System.out.println("Before Login Class");
        userAction = new UserAction();
    }

}
