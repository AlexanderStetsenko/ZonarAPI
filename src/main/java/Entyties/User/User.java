package Entyties.User;

import Entyties.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Александр on 14.06.2017.
 */
public class User extends Entity {

    @JsonProperty("err")
    private String err;

    @JsonProperty("date")
    private Date date;

    public User() {
    }

    public User(String err, Date date) {
        this.err = err;
        this.date = date;
    }

    public String getErr(){
        return err;
    }
    public void setErr(String input){
        this.err = input;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date input){
        this.date = input;
    }

    @Override
    public String toString() {
        return "User{" +
                "err='" + err + '\'' +
                ", date=" + date +
                '}';
    }
}



