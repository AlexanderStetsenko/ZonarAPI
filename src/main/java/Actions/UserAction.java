package Actions;

import Entyties.Entity;
import Entyties.User.User;
import Entyties.Responses.LoginResponse;
import HTTP.Requests.AccountArea.GetUserDataRequest;
import HTTP.Requests.AccountArea.UserLoginRequests;
import ru.yandex.qatools.allure.annotations.Step;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class UserAction extends BaseAction{

    private static UserLoginRequests userRequests = new UserLoginRequests();
    private static GetUserDataRequest getUserDataRequest = new GetUserDataRequest();

    public static LoginResponse loginResponse =  new LoginResponse();
    private static User user = new User();


    @Step("Login request Sending")
    public LoginResponse sendLoginRequest(String email, String password){
       loginResponse = (LoginResponse) jsonConverter.getObjectFromFile(userRequests.sendLoginRequest(email, password).getBody(), loginResponse);
       Entity.setUserToken(loginResponse.getToken());
       return loginResponse;
   }

    @Step("Get User Data request Sending")
    public User sendGetUserDataRequest()
    {
        user = (User) jsonConverter.getObjectFromFile(getUserDataRequest.getUserDataRequest().getBody(), user);
        return user;
    }

    @Step("Check User Email ")
    public void checkEmail(String email) {
        assertThat(String.format("Emai isn't equals Expected %s , but was %s", email, user.getData().getEmail()), user.getData().getEmail(), is(email));
    }

    @Step("Check OfficeCommercialRow after Login")
    public void checkLoginResponse() {
        assertThat("Login isn't done", UserAction.loginResponse.getMessage(), containsString("/account"));
        assertThat("Login isn't done", UserAction.loginResponse.getResType(), containsString("success"));
    }
}
