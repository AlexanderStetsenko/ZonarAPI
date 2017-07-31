package Tests.CalculationTests;

import Actions.BuildingActions.*;
import Actions.BuildingActions.ZoningAllowanceActions.AllowedFrontagesTypeActions;
import Actions.BuildingActions.ZoningAllowanceActions.MaxCapacityActions;
import Actions.BuildingActions.ZoningAllowanceActions.UsesActions;
import Actions.ProjectCreationAction;
import Actions.UserAction;
import Entyties.Entity;
import Entyties.Responses.OpenProjectResponse;
import Settings.MySettings;
import Tests.BaseTest;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.File;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class BaseProjectTest extends BaseTest {
    protected static BuildingActions buildingActions = new BuildingActions();
    protected static MaxCapacityActions maxCapacityActions = new MaxCapacityActions();
    protected static ProjectCreationAction projectCreationAction = new ProjectCreationAction();
    protected AllowedFrontagesTypeActions allowedFrontageTypeActions = new AllowedFrontagesTypeActions();
    protected static UsesActions usesActions = new UsesActions();
    protected static OpenProjectResponse project;

    @Parameterized.Parameter
    public int shapeId;
    @Parameterized.Parameter(1)
    public static OpenProjectResponse projectExpected;


    @Parameterized.Parameters(name = "Shape number: {0}")
    public static Iterable<Object[]> dataForTest() {

        return Arrays.asList(new Object[][]{
        /*1*/                {MySettings.testSettings.getShapes().get(0),
                                projectExpected = projectCreationAction.createProjectObjectFromJson(new File(MySettings.getTestSettings().getFilePath().get(0)))},
       /* *//*2*//*                {MySettings.testSettings.getShapes().get(1),
                                projectExpected = projectCreationAction.createProjectObjectFromJson(new File(MySettings.getTestSettings().getFilePath().get(1)))},*/
        });
    }

    @BeforeClass
    public static void before(){
        //Login if User isn't login
        if (Entity.getUserToken() == null )
        {
                new UserAction().sendLoginRequest(MySettings.getTestSettings().getUser(),
                                                    MySettings.getTestSettings().getPassword());
        }
    }

    @Before
    public void setUp() throws Exception {
        //Check Project is Created
        if(project == null) {
            String projectID = projectCreationAction.createProject(shapeId).getSavedProjectID();
            project = projectCreationAction.openProject(projectID);
        }
    }

    @Step("After Class")
    @AfterClass
    public static void after(){
        project = null;
        projectExpected = null;
        projectCreationAction.deleteProject();
    }

}
