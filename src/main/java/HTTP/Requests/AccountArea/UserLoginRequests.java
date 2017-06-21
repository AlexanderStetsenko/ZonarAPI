package HTTP.Requests.AccountArea;

import HTTP.RequestBase;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Created by Александр on 14.06.2017.
 */
public class UserLoginRequests extends RequestBase {



    public HttpResponse<String> sendLoginRequest(String email, String password) {
        try {
            response = Unirest.post(baseUrl + "/login")
                    .header("accept", "application/json, text/plain, */*")
                    .header("origin", "https://dev1-zonar.gridics.com")
                    .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")
                    .header("content-type", "application/json;charset=UTF-8")
                    .header("referer", "https://dev1-zonar.gridics.com/login")
                    .header("accept-encoding", "gzip, deflate, br")
                    .header("accept-language", "en-US,en;q=0.8")
                    .header("cache-control", "no-cache")
                    .body("{\"signinEmail\":\""+ email+"\", \"signinPass\":\""+password+"\"}")
                    .asString();

        } catch (UnirestException e) {
            System.out.println("bad request");
        }
        return response;
    }

//    @Override
//    public HttpResponse<String> sendRequest(Object[] args) {
//        return null;
//    }

}
