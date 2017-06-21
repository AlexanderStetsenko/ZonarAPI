package Entyties.Responses;

import Entyties.Entity;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Created by Александр on 14.06.2017.
 */
public class LoginResponse extends Entity {


    private String resType;
    private String message;
    private String token;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
