package Tests.ProjectTests.BuildingTests;

import Entyties.Responses.OpenProjectResponse;
import Tests.ProjectTests.BaseProjectTest;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

@Features("Project Feature")
@Stories("Project Stories")
@Title("Building General Information Tests")
public class BuildingTests extends BaseProjectTest {

    public BuildingTests(int shapeId, OpenProjectResponse projectExpected) {
        super(shapeId, projectExpected);
    }

    @Test
    public void checkShapeWidthDepth() throws Exception {
        String projectID = projectCreationAction.createProject(shapeId).getSavedProjectID();
        project = projectCreationAction.openProject(projectID);
        buildingActions.checkBuildignShapeWidth(project, projectExpected);
        buildingActions.checkBuildignShapeDepth(project, projectExpected);
    }

    @Test
    public void checkAppliedVariances() throws Exception {
        String projectID = projectCreationAction
                .createProject(shapeId)
                .getSavedProjectID();
        project = projectCreationAction
                .openProject(projectID);
        buildingActions
                .checkVariansesList(project, projectExpected);
    }
}
