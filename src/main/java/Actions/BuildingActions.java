package Actions;

import Entyties.Responses.OpenProjectResponse;
import Services.MyString;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isIn;
import static org.hamcrest.core.Is.is;

/**
 * Created by Александр on 30.06.2017.
 */
public class BuildingActions {

    @Step("Check BuildingObject Width")
    public void checkBuildignShapeWidth(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        String actual = String.valueOf(project.getProject()
                .getDevelopmentsWrapper().get(0)
                .getBuildingsWrappers().get(0)
                .getBuildingObject()
                .getZoningAllowances()
                .getWidth());

        String expected = String.valueOf(projectExpected.getProject()
                .getDevelopmentsWrapper().get(0)
                .getBuildingsWrappers().get(0)
                .getBuildingObject()
                .getZoningAllowances()
                .getWidth());
        assertThat(actual, is(expected));
    }

    @Step("Check BuildingObject Depth")
    public void checkBuildignShapeDepth(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        String actual = String.valueOf(project.getProject()
                .getDevelopmentsWrapper().get(0)
                .getBuildingsWrappers().get(0)
                .getBuildingObject()
                .getZoningAllowances()
                .getDepth());

        String expected = String.valueOf(projectExpected.getProject()
                .getDevelopmentsWrapper().get(0)
                .getBuildingsWrappers().get(0)
                .getBuildingObject()
                .getZoningAllowances()
                .getDepth());
        assertThat(actual, is(expected));
    }

    @Step("Check Applyed Variences Id List")
    public void checkVariansesList(OpenProjectResponse project, OpenProjectResponse projectExpected) {

        ArrayList<String> variances = (ArrayList<String>)
                MyString.divideStringToArrayByChar(project.getProject().getDevelopmentsWrapper().get(0)
                        .getBuildingsWrappers().get(0)
                        .getBuildingObject()
                        .getZoningAllowances()
                        .getVariancesIds(), ',');


        ArrayList<String> variancesExpected = (ArrayList<String>)
                MyString.divideStringToArrayByChar(projectExpected.getProject().getDevelopmentsWrapper().get(0)
                        .getBuildingsWrappers().get(0)
                        .getBuildingObject()
                        .getZoningAllowances()
                        .getVariancesIds(), ',');

        for (String variance : variances){
            assertThat(variance, isIn(variancesExpected));
        }






    }
}
