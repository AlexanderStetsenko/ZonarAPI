package Actions;

import Entyties.Responses.CreateProjectResponse;
import Entyties.Responses.OpenProjectResponse;
import HTTP.Requests.Project.ProjectCreation.CreateProjectRequest;
import HTTP.Requests.Project.ProjectCreation.OpenProjectRequest;

/**
 * Created by Александр on 21.06.2017.
 */
public class ProjectCreationAction extends BaseAction {

    private CreateProjectRequest createProjectRequest = new CreateProjectRequest();
    private OpenProjectRequest openProjectRequest = new OpenProjectRequest();


    public CreateProjectResponse createProject(){
        CreateProjectResponse createProjectResponse = new CreateProjectResponse();
        createProjectResponse = (CreateProjectResponse) jsonConverter.getObjectFromString(createProjectRequest.sendCreateProjectRequest(), createProjectResponse);
        return createProjectResponse;
    }

    public OpenProjectResponse openProject(String projectID){
        OpenProjectResponse openProjectResponse = new OpenProjectResponse();
        openProjectResponse = (OpenProjectResponse) jsonConverter.getObjectFromString(openProjectRequest.sendOpenProjectRequest(projectID), openProjectResponse);
        return openProjectResponse;
    }
}
