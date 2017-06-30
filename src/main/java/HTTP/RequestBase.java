package HTTP;

import Entyties.Entity;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Александр on 14.06.2017.
 */
public  class RequestBase{

    protected HttpResponse<String> response;
    protected String baseUrl = "https://dev1-zonar.gridics.com/";
    protected String baseUrlService = "https://dev1-zonarservice.gridics.com/";


    protected List<String> header;
    protected String body;

    protected Map<String, String > headers = new HashMap<String, String>();

    public Map<String, String> getHeaders()
    {
        headers.put("accept", "application/json, text/plain, */*");
        headers.put("origin", "https://dev1-zonar.gridics.com");
        headers.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36");
        headers.put("token", Entity.getUserToken());
        headers.put("content-type", "application/json;charset=UTF-8");
        headers.put("referer", "https://dev1-zonar.gridics.com/");
        headers.put("accept-encoding", "gzip, deflate, br");
        headers.put("accept-language", "en-US,en;q=0.8");
        headers.put("cache-control", "no-cache");
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }


//    protected HttpResponse<String> sendRequest(String url, String body){
//        try {
//            response = Unirest.post(baseUrl + url)
//                    .headers(getHeaders())
//                    .body(body)
//                    .asString();
//        } catch (UnirestException e) {
//            e.printStackTrace();
//        }
//        return response;
//    }


    protected HttpResponse<String> sendRequest(String url, String body)
    {
        try {
            response = Unirest.post(baseUrlService + url).headers(getHeaders())
                    .body(body)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response;
    }
}
