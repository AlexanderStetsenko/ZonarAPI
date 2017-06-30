package Tests.ProjectTests;

import Actions.BuildingActions;
import Actions.ProjectCreationAction;
import Actions.UserAction;
import Entyties.Entity;
import Entyties.Responses.OpenProjectResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.File;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class BaseProjectTest {

        protected static BuildingActions buildingActions = new BuildingActions();
        protected static ProjectCreationAction projectCreationAction = new ProjectCreationAction();
        protected static OpenProjectResponse projectExpected;
        protected OpenProjectResponse project;
        protected int shapeId;

    public BaseProjectTest(int shapeId, OpenProjectResponse projectExpected) {
        this.projectExpected = projectExpected;
        this.shapeId = shapeId;
    }


    @BeforeClass
    public static void before(){
        if (Entity.getUserToken() == null )
        {
            try {
                new UserAction().sendLoginRequest("admin@admin.com", "123456");
            } catch (UnirestException e) {
                e.printStackTrace();
            }

        }
    }


    @Step("After Test")
    @After
    public void after(){
        project = null;
        projectExpected = null;
        projectCreationAction.deleteProject();
    }


    @Parameterized.Parameters(name = "{index}:{0} shape number ")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {858778, projectExpected = projectCreationAction.createProjectObjectFromJson(
                        new File("D:\\Project\\ZonarAPI\\src\\test\\resources\\Project\\project858778"))},
                {829031, projectExpected = projectCreationAction.createProjectObjectFromJson(
                        new File("D:\\Project\\ZonarAPI\\src\\test\\resources\\Project\\project829031"))},
        });
    }
}
