package HTTP.Requests.Project.ProjectCreation;

import Entyties.Entity;
import HTTP.RequestBase;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Created by Александр on 16.06.2017.
 */
public class OpenProjectRequest extends RequestBase {
    public String sendOpenProjectRequest(String projectID) {
        try {
            response = Unirest.post("https://dev1-zonarservice.gridics.com/api/project/openProject")
                    .headers(getHeaders())
                    .body(String.format("{\"ProjectId\":%s,\"InputData\":{}}", projectID))
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }
}
