package Actions;

import Entyties.Entity;
import Entyties.User.User;
import Entyties.Responses.LoginResponse;
import HTTP.Requests.AccountArea.GetUserDataRequest;
import HTTP.Requests.AccountArea.UserLoginRequests;
import com.mashape.unirest.http.exceptions.UnirestException;


/**
 * Created by Александр on 14.06.2017.
 */
public class UserAction extends BaseAction{

    public static UserLoginRequests userRequests = new UserLoginRequests();
    public static GetUserDataRequest getUserDataRequest = new GetUserDataRequest();

    public static LoginResponse loginResponse =  new LoginResponse();
    public static User user = new User();

    public LoginResponse sendLoginRequest(String email, String password) throws UnirestException {

       loginResponse = (LoginResponse) jsonConverter.getObjectFromString(userRequests.sendLoginRequest(email, password).getBody(), loginResponse);
       Entity.setUserToken(loginResponse.getToken());
       return loginResponse;
   }

    public User sendGetUserDataRequest()
    {
        user = (User) jsonConverter.getObjectFromString(getUserDataRequest.getUserDataRequest().getBody(), user);
        return user;
    }

}
