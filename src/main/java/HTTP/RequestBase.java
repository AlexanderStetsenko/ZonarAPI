package HTTP;

import Entyties.Entity;
import Settings.MySettings;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.HashMap;
import java.util.Map;


public  class RequestBase{


    protected HttpResponse<String> response;
    protected String baseUrl;
    private String baseUrlService;
    private Map<String, String > headers = new HashMap<>();
//    private static MySettings Settings = MySettings.settingsInit();
//

    public RequestBase()
    {
        if(!MySettings.getIsInit()){
            MySettings.settingsInit();
            System.out.println(MySettings.getRequestSettings().getBaseUrl());
            System.out.println(MySettings.getRequestSettings().getBaseUrlService());
        }
        setBaseUrl(MySettings.getRequestSettings().getBaseUrl());
        setBaseUrlService(MySettings.getRequestSettings().getBaseUrlService());
    }

    //Method return typicall request Header Token is got from static variable
    protected Map<String, String> getHeaders(){
        if (headers.isEmpty()){
            //headers.put("accept", "application/json, text/plain, */*");
           // headers.put("origin", "https://dev1-zonar.gridics.com");
            headers.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36");
            headers.put("token", Entity.getUserToken());
            headers.put("content-type", "application/json;charset=UTF-8");
            headers.put("accept-encoding", "gzip, deflate, br");
            headers.put("accept-language", "en-US,en;q=0.8");
            //headers.put("cache-control", "no-cache");
            return headers;}
        else return headers;
       }

    //Method sends typicall request Parameters is URI and Body of request
    protected HttpResponse<String> sendRequest(String url, String body){
        try {
            response = Unirest.post(baseUrlService + url).headers(getHeaders())
                    .body(body)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public HttpResponse<String> getResponse() {
        return response;
    }

    public void setResponse(HttpResponse<String> response) {
        this.response = response;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    private void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrlService() {
        return baseUrlService;
    }

    private void setBaseUrlService(String baseUrlService) {
        this.baseUrlService = baseUrlService;
    }

//    public static MySettings getSettings() {
//        return Settings;
//    }
//
//    public static void setSettings(MySettings settings) {
//        RequestBase.Settings = settings;
//    }
}
