package Actions;

import Entyties.Entity;
import Entyties.Project.ProjectZoningCodes.ProjectZoningCodes;
import Entyties.Responses.CreateProjectResponse;
import Entyties.Responses.OpenProjectResponse;
import HTTP.Requests.Project.ProjectCreation.CreateProjectRequest;
import HTTP.Requests.Project.ProjectCreation.DeleteProjectRequest;
import HTTP.Requests.Project.ProjectCreation.OpenProjectRequest;
import ru.yandex.qatools.allure.annotations.Step;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ProjectCreationAction extends BaseAction {

    private CreateProjectRequest createProjectRequest = new CreateProjectRequest();
    private OpenProjectRequest openProjectRequest = new OpenProjectRequest();
    private DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();


    public OpenProjectResponse createProjectObjectFromJson(File json){
        OpenProjectResponse openProjectResponse = new OpenProjectResponse();
        openProjectResponse = (OpenProjectResponse) jsonConverter.getObjectFromFile(json, openProjectResponse);
        Entity.setProjectId(String.valueOf(openProjectResponse.getProject().getProjectInfo().getId()));
        return openProjectResponse;

    }

    public void deleteProject() {
        deleteProjectRequest.sendDeleteProjectRequest();
    }

    public void deleteProject(String projectID)
    {
        deleteProjectRequest.sendDeleteProjectRequest(projectID);
    }

    @Step("Create Project")
    public CreateProjectResponse createProject(int shapeId){
        System.out.println("Project Creation");
        CreateProjectResponse createProjectResponse = new CreateProjectResponse();
        createProjectResponse = (CreateProjectResponse) jsonConverter.getObjectFromFile(createProjectRequest.sendCreateProjectRequest(shapeId), createProjectResponse);
        return createProjectResponse;
    }

    @Step("Open Project")
    public OpenProjectResponse openProject(String projectID){
        OpenProjectResponse openProjectResponse = new OpenProjectResponse();
        openProjectResponse = (OpenProjectResponse) jsonConverter.getObjectFromFile(openProjectRequest.sendOpenProjectRequest(projectID), openProjectResponse);
        Entity.setProjectId(String.valueOf(openProjectResponse.getProject().getProjectInfo().getId()));
        return openProjectResponse;
    }

    @Step("Check Project Name")
    public void checkProjectName(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(project.getProject().getProjectInfo().getName(), equalToIgnoringWhiteSpace(projectExpected.getProject().getProjectInfo().getName()));
    }

    @Step("Check Project Owner")
    public void checkProjectOwner(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(project.getProject().getProjectInfo().getOwner(), equalTo(projectExpected.getProject().getProjectInfo().getOwner()));
    }

    @Step("Check Project ZoneCodes Names")
    public void checkZoneCodeName(OpenProjectResponse project, OpenProjectResponse projectExpected) {
       List<String> namesExpectedList = new ArrayList<String>();
        for (ProjectZoningCodes zoningCodes : projectExpected.getProject().getProjectZoningCodes()){
            namesExpectedList.add(zoningCodes.getName());
        }
        for (ProjectZoningCodes zoningCodes : project.getProject().getProjectZoningCodes())
        {
            assertThat(zoningCodes.getName(), isIn(namesExpectedList));
        }
    }
}

