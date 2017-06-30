package Tests.ProjectTests;

import Entyties.Responses.OpenProjectResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


@Features("Project Feature")
@Stories("Project Stories")
@Title("Project General Information Tests")
public class ProjectGeneralInformationTests extends BaseProjectTest {


    public ProjectGeneralInformationTests(int shapeId, OpenProjectResponse projectExpected) {
        super(shapeId, projectExpected);
    }


    @Before
    public void setUp() throws Exception {
        String projectID = projectCreationAction.createProject(shapeId).getSavedProjectID();
        project = projectCreationAction.openProject(projectID);
    }




    @Test
    public void checkProjectName(){
        projectCreationAction.checkProjectName(project, projectExpected);
    }

    @Test
    public void checkProjectOwner(){
        projectCreationAction.checkProjectOwner(project, projectExpected);
    }

}
