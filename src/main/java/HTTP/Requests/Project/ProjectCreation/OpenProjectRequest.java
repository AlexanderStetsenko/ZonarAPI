package HTTP.Requests.Project.ProjectCreation;

import Entyties.Entity;
import HTTP.RequestBase;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


public class OpenProjectRequest extends RequestBase {
    public String sendOpenProjectRequest(String projectID) {
        response = sendRequest("api/project/openProject", String.format("{\"ProjectId\":%s,\"InputData\":{}}", projectID));
        return response.getBody();
    }
}
