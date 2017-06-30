package Actions;

import Entyties.Entity;
import Entyties.Responses.CreateProjectResponse;
import Entyties.Responses.OpenProjectResponse;
import HTTP.Requests.Project.ProjectCreation.CreateProjectRequest;
import HTTP.Requests.Project.ProjectCreation.DeleteProjectRequest;
import HTTP.Requests.Project.ProjectCreation.OpenProjectRequest;
import ru.yandex.qatools.allure.annotations.Step;
import java.io.File;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ProjectCreationAction extends BaseAction {

    private CreateProjectRequest createProjectRequest = new CreateProjectRequest();
    private OpenProjectRequest openProjectRequest = new OpenProjectRequest();
    private DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();

    @Step("Create Project")
    public CreateProjectResponse createProject(int shapeId){
        CreateProjectResponse createProjectResponse = new CreateProjectResponse();
        createProjectResponse = (CreateProjectResponse) jsonConverter.getObjectFromString(createProjectRequest.sendCreateProjectRequest(shapeId), createProjectResponse);
        return createProjectResponse;
    }

    @Step("Open Project")
    public OpenProjectResponse openProject(String projectID){
        OpenProjectResponse openProjectResponse = new OpenProjectResponse();
        openProjectResponse = (OpenProjectResponse) jsonConverter.getObjectFromString(openProjectRequest.sendOpenProjectRequest(projectID), openProjectResponse);
        Entity.setProjectId(String.valueOf(openProjectResponse.getProject().getProjectInfo().getId()));
        return openProjectResponse;
    }

    public OpenProjectResponse createProjectObjectFromJson(File json){
        OpenProjectResponse openProjectResponse = new OpenProjectResponse();
        openProjectResponse = (OpenProjectResponse) jsonConverter.getObjectFromString(json, openProjectResponse);
        Entity.setProjectId(String.valueOf(openProjectResponse.getProject().getProjectInfo().getId()));
        return openProjectResponse;

    }


    public void deleteProject()
    {
        deleteProjectRequest.sendDeleteProjectRequest();
    }

    public void deleteProject(String projectID)
    {
        deleteProjectRequest.sendDeleteProjectRequest(projectID);
    }


    @Step("Check Project Name")
    public void checkProjectName(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(project.getProject().getProjectInfo().getName(), equalToIgnoringWhiteSpace(projectExpected.getProject().getProjectInfo().getName()));
    }


    @Step("Check Project Owner")
    public void checkProjectOwner(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(project.getProject().getProjectInfo().getOwner(), equalTo(projectExpected.getProject().getProjectInfo().getOwner()));

    }
}

