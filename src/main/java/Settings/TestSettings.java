package Settings;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TestSettings{

    @JsonProperty("password")
    private String password;

    @JsonProperty("shapes")
    private static List<Integer> shapes;

    @JsonProperty("filePath")
    private static List<String> filePath;

    @JsonProperty("user")
    private static String user;

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setShapes(List<Integer> shapes){
        this.shapes = shapes;
    }

    public List<Integer> getShapes(){
        return shapes;
    }

    public void setFilePath(List<String> filePath){
        this.filePath = filePath;
    }

    public List<String> getFilePath(){
        return filePath;
    }

    public void setUser(String user){
        this.user = user;
    }

    public String getUser(){
        return user;
    }

    @Override
    public String toString(){
        return
                "Temp{" +
                        "password = '" + password + '\'' +
                        ",shapes = '" + shapes + '\'' +
                        ",filePath = '" + filePath + '\'' +
                        ",user = '" + user + '\'' +
                        "}";
    }
}