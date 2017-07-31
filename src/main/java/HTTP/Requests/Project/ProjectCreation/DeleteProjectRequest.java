package HTTP.Requests.Project.ProjectCreation;

import Entyties.Entity;
import HTTP.RequestBase;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Александр on 26.06.2017.
 */
public class DeleteProjectRequest extends RequestBase{


    @Step("Delete Project request")
    public void sendDeleteProjectRequest()
    {
        System.out.println("Deleting Project... ");
        sendRequest("api/project/deleteProject", "{\"ProjectId\":" + Entity.getProjectId() + "}");

        if(response.getBody().contains("\"message\": \"Success\"" ))
            System.out.println(String.format("Project %s is deleted", Entity.getProjectId()));
        else {
            System.out.println((String.format("Project %s isn't deleted, please check it", Entity.getProjectId() )));
        }
    }

    @Step("Delecte Project request {0}")
    public void sendDeleteProjectRequest(String projectID)
    {
        System.out.println("Deleting Project");
        sendRequest("api/project/deleteProject", projectID);
        System.out.println(String.format("Project %s is deleted", projectID));

    }
}
