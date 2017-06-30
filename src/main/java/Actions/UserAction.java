package Actions;

import Entyties.Entity;
import Entyties.User.User;
import Entyties.Responses.LoginResponse;
import HTTP.Requests.AccountArea.GetUserDataRequest;
import HTTP.Requests.AccountArea.UserLoginRequests;
import com.mashape.unirest.http.exceptions.UnirestException;
import ru.yandex.qatools.allure.annotations.Step;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Created by Александр on 14.06.2017.
 */
public class UserAction extends BaseAction{

    public static UserLoginRequests userRequests = new UserLoginRequests();
    public static GetUserDataRequest getUserDataRequest = new GetUserDataRequest();

    public static LoginResponse loginResponse =  new LoginResponse();
    public static User user = new User();


    @Step("Login request Sending")
    public LoginResponse sendLoginRequest(String email, String password) throws UnirestException {
       loginResponse = (LoginResponse) jsonConverter.getObjectFromString(userRequests.sendLoginRequest(email, password).getBody(), loginResponse);
       Entity.setUserToken(loginResponse.getToken());
       return loginResponse;
   }

    @Step("Get User Data request Sending")
    public User sendGetUserDataRequest()
    {
        user = (User) jsonConverter.getObjectFromString(getUserDataRequest.getUserDataRequest().getBody(), user);
        return user;
    }

    @Step("Check User Email ")
    public void checkEmail(String email) {
        assertThat(user.getData().getEmail(), is(email));
    }

    @Step("Check Response after Login")
    public void checkLoginResponse() {
        assertThat(UserAction.loginResponse.getMessage(), containsString("/account"));
        assertThat(UserAction.loginResponse.getResType(), containsString("success"));
    }
}
