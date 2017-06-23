package Entyties.User;

import Entyties.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Александр on 14.06.2017.
 */
public class User extends Entity {

    @JsonProperty("err")
    private String err;

    @JsonProperty("data")
    private Data data;

    public User() {
    }

    public User(String err, Data data) {
        this.err = err;
        this.data = data;
    }

    public String getErr(){
        return err;
    }
    public void setErr(String input){
        this.err = input;
    }
    public Data getData(){
        return data;
    }
    public void setData(Data input){
        this.data = input;
    }

    @Override
    public String toString() {
        return "User{" +
                "err='" + err + '\'' +
                ", data=" + data +
                '}';
    }
}



