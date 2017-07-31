package HTTP.Requests.AccountArea;

import HTTP.RequestBase;
import Settings.MySettings;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Created by Александр on 14.06.2017.
 */
public class UserLoginRequests extends RequestBase {



    //should be refactored with baseClass method
    public HttpResponse<String> sendLoginRequest(String email, String password) {
        try {
            response = Unirest.post(MySettings.getRequestSettings().getBaseUrl() + "login")
                    .header("accept", "application/json, text/plain, */*")
                    .header("origin", MySettings.getRequestSettings().getBaseUrl())
//                    .header("x-devtools-emulate-network-conditions-client-id", "35839de4-25ed-4ae1-9027-625bd6cd5c3e")
//                    .header("x-devtools-request-id", "1728.1976")
                    .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")
                    .header("content-type", "application/json;charset=UTF-8")
                    .header("referer", MySettings.getRequestSettings().getBaseUrl() + "itech/login")
                    .header("accept-encoding", "gzip, deflate, br")
                    .header("accept-language", "en-US,en;q=0.8")
              //      .header("cache-control", "no-cache")
                   // .header("postman-token", "cbf1ef8a-9eb2-5dbf-5083-35e4b5426698")
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
