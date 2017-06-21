package HTTP.Requests.Project.ProjectCreation;

import Entyties.Entity;
import HTTP.RequestBase;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Created by Александр on 16.06.2017.
 */
public class CreateProjectRequest extends RequestBase{


    public String sendCreateProjectRequest(){
        try {
            response = Unirest.post("https://dev1-zonarservice.gridics.com/api/project/createProject")
                    .headers(getHeaders())
                    .body("{\"createMode\":1,\"projectName\":\"Project 1\",\"addressIdList\":[858778],\"isAssamblege\":true}")
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }


}
