package Tests.CalculationTests.ProjectTests;

import Entyties.Responses.OpenProjectResponse;
import Tests.CalculationTests.BaseProjectTest;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


@Features("Calculation")
@Stories("Project Stories")
public class ProjectGeneralInformationTests extends BaseProjectTest {


//    public ProjectGeneralInformationTests(int shapeId, OpenProjectResponse projectExpected) {
//        super(shapeId, projectExpected);
//    }

    @Test
    @Title("Check Project Name")
    public void checkProjectName(){
        projectCreationAction.checkProjectName(project, projectExpected);
    }

    @Test
    @Title("Check Project Owner")
    public void checkProjectOwner(){
        projectCreationAction.checkProjectOwner(project, projectExpected);
    }

    @Test
    @Title("Check Zone Codes")
    public void checkZoneCodes(){
        projectCreationAction.checkZoneCodeName(project, projectExpected);
    }

}
