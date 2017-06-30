package HTTP.Requests.AccountArea;

import Actions.UserAction;
import HTTP.RequestBase;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import static Entyties.Entity.getUserToken;

/**
 * Created by Александр on 15.06.2017.
 */
public class GetUserDataRequest extends RequestBase{

    UserAction userAction = new UserAction();

    public HttpResponse<String> getUserDataRequest(){
        try {
            response = Unirest.post(baseUrl + "account/getUserData")
                    .headers(getHeaders())
                    .body("{}")
                    .asString();
        } catch (UnirestException e) {
            System.out.println("bad request");
        }
        return response;
    }
}
