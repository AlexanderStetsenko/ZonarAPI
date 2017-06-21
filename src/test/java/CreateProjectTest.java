import Actions.ProjectCreationAction;
import Actions.UserAction;
import Entyties.Entity;
import Entyties.Responses.OpenProjectResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Александр on 16.06.2017.
 */
public class CreateProjectTest {

    private static ProjectCreationAction projectCreationAction;


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
        projectCreationAction = new ProjectCreationAction();
    }

    @Test
    public void buildingCreation() throws Exception {
        String projectID  = projectCreationAction.createProject().getSavedProjectID();
        System.out.println("Project " + projectID + " is created");
        OpenProjectResponse project = projectCreationAction.openProject(projectID);
                int zonninAlId = project.getProject()
                .getDevelopmentsWrapper().get(0)
                .getBuildingsWrappers().get(0)
                .getBuildingObject()
                .getBuilding()
                .getZoningAllowancesId();

        System.out.println(project.getProject().getDevelopmentsWrapper().get(0).getBuildingsWrappers().get(0).getBuildingObject().getZoningAllowances());




//        System.out.println("Project " + projectID + " is created");
//

    }


}
