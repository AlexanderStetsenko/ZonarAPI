package Actions.BuildingActions;

import Actions.BaseAction;
import Entyties.Project.Development.BuildingWrapper.BuildingObject.BuildingObject;
import Entyties.Project.Development.BuildingWrapper.BuildingsWrappers;
import Entyties.Responses.OpenProjectResponse;
import Services.MyString;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isIn;
import static org.hamcrest.core.Is.is;


public class BuildingActions extends BaseAction {



    @Step("Check BuildingObject Width")
    public void checkBuildignShapeWidth(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        String actual = String.valueOf(
                getBuilding(project)
                .getZoningAllowances()
                .getWidth());

        String expected = String.valueOf(
                getBuilding(projectExpected)
                .getZoningAllowances()
                .getWidth());
        assertThat(actual, is(expected));
    }

    @Step("Check BuildingObject Depth")
    public void checkBuildignShapeDepth(OpenProjectResponse project, OpenProjectResponse projectExpected) {

        String actual = String.valueOf(getBuilding(project)
                .getZoningAllowances()
                .getDepth());

        String expected = String.valueOf(getBuilding(projectExpected)
                .getZoningAllowances()
                .getDepth());
        assertThat(actual, is(expected));
    }

    @Step("Check Applyed Variances Id List")
    public void checkVariancesList(OpenProjectResponse project, OpenProjectResponse projectExpected) {

        ArrayList<String> variances = (ArrayList<String>)
                MyString.divideStringToArrayByChar(getBuilding(project)
                        .getZoningAllowances()
                        .getVariancesIds(), ',');

        ArrayList<String> variancesExpected = (ArrayList<String>)
                MyString.divideStringToArrayByChar(getBuilding(projectExpected)
                        .getZoningAllowances()
                        .getVariancesIds(), ',');

        assertThat(variances, is(variancesExpected));
    }

    @Step("Check Applied Zone and Municipality for Building")
    public void checkZoneAndMunicipality(OpenProjectResponse project, OpenProjectResponse projectExpected) {

        //Building is got from First Development!!!
        List<BuildingsWrappers> buildings = project.getProject().getDevelopmentsWrapper().get(0).getBuildingsWrappers();
        List<BuildingsWrappers> buildingsExpected  = projectExpected.getProject().getDevelopmentsWrapper().get(0).getBuildingsWrappers();
        List<String> municipalityExpected = new ArrayList<String>();
        List<String> zoneNamesExpected = new ArrayList<String>();

        for(BuildingsWrappers buildingWrapper : buildingsExpected){
            zoneNamesExpected.add(buildingWrapper.getBuildingObject().getGeneralInformation().getZoningName());
            municipalityExpected.add(buildingWrapper.getBuildingObject().getGeneralInformation().getMunicipality());
        }
        for(BuildingsWrappers building : buildings){
            assertThat(building.getBuildingObject().getGeneralInformation().getZoningName(), isIn(zoneNamesExpected));
            assertThat(building.getBuildingObject().getGeneralInformation().getMunicipality(), isIn(municipalityExpected));
        }



    }
}
