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
            response = Unirest.post("https://dev1-zonar.gridics.com/account/getUserData")
                    .header("accept", "application/json, text/plain, */*")
                    .header("origin", "https://dev1-zonar.gridics.com")
                    .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")
                    .header("token", getUserToken())
                    .header("content-type", "application/json;charset=UTF-8")
                    .header("referer", "https://dev1-zonar.gridics.com/login")
                    .header("accept-encoding", "gzip, deflate, br")
                    .header("accept-language", "en-US,en;q=0.8")
                    .header("cache-control", "no-cache")
                    .header("postman-token", "2d2a3fc2-632f-d2a9-5443-080f5c323214")
                    .body("{}")
                    .asString();
            System.out.println(response.getBody());
        } catch (UnirestException e) {
            System.out.println("bad request");
        }
        return response;
    }
}
