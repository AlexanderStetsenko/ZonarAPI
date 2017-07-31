package Actions.BuildingActions.ZoningAllowanceActions;

import Actions.BaseAction;
import Entyties.Project.Development.BuildingWrapper.BuildingObject.ZoningAllowances.ZoningAllowances;
import Entyties.Responses.OpenProjectResponse;
import Services.MyString;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.List;

import static Services.MyString.divideStringToArrayByChar;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class ZoningAllowancesActions extends BaseAction {


    private ZoningAllowances zoningAllowanceProject;
    private ZoningAllowances zoningAllowanceProjectExpected;


    /*Zone Parameters Steps*/
    @Step("Check Zoning Parameters")
    public void checkZoningParameters(OpenProjectResponse project, OpenProjectResponse projectExpected){
            checkZoningCodeId(project, projectExpected);
            checkZoneId(project, projectExpected);
            checkZoneTypeId(project, projectExpected);
            checkSubZoneId(project, projectExpected);
    }
    @Step("Check Zoning Code Id")
    public void checkZoningCodeId(OpenProjectResponse project, OpenProjectResponse projectExpected) {

        myAssertation.assertThatIs(getZoningAllowance(project).getZoningCodeId(),
                    getZoningAllowance(projectExpected).getZoningCodeId());
    }
    @Step("Check Zoning Id")
    public void checkZoneId(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        myAssertation.assertThatIs(getZoningAllowance(project).getZoneId(),
                getZoningAllowance(projectExpected).getZoneId());
    }
    @Step("Check Zone Type Id")
    public void checkZoneTypeId(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        myAssertation.assertThatIs(getZoningAllowance(project).getZoneTypeId(),
                getZoningAllowance(projectExpected).getZoneTypeId());
    }
    @Step("Check SubZone Id")
    public void checkSubZoneId(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        myAssertation.assertThatIs(getZoningAllowance(project).getSubZoneId(),
                getZoningAllowance(projectExpected).getSubZoneId());
    }

   
   
    /*Overrides */
    private ArrayList<String> getOverridesIdsList(String overridesIdsList) {/*method create Ids list from string*/
       return (ArrayList<String>)
                MyString.divideStringToArrayByChar(overridesIdsList, ',');
    }
    
    @Step("Check Applyed Variances Id List")
    public void checkVariancesList(OpenProjectResponse project, OpenProjectResponse projectExpected) {
              assertThat(getOverridesIdsList(getZoningAllowance(project).getVariancesIds()),
                      is(getOverridesIdsList(getZoningAllowance(projectExpected).getVariancesIds())));
    }
    
    @Step("Check Applyed Overlay Ids List")
    public void checkOverlayList(OpenProjectResponse project, OpenProjectResponse projectExpected) {

        assertThat(getOverridesIdsList(getZoningAllowance(project).getOverlayIds()),
                is(getOverridesIdsList(getZoningAllowance(projectExpected).getOverlayIds())));
    }

    @Step("Check Applyed Building Typology Ids List")
    public void checkBuildingTypologyId(OpenProjectResponse project, OpenProjectResponse projectExpected) {

        assertThat(getZoningAllowance(project).getBuildingTypologyId(),
                is(getZoningAllowance(projectExpected).getBuildingTypologyId()));
    }
    
    
    /*Building dimensions*/
    @Step("Check Irregular Parametr")
    public void checkIsIrregular(OpenProjectResponse project, OpenProjectResponse projectExpected){
        zoningAllowanceProject =  getZoningAllowance(project);
        zoningAllowanceProjectExpected = getZoningAllowance(projectExpected);

        assertThat(zoningAllowanceProject.isIrregular(), is(zoningAllowanceProjectExpected.isIrregular()));
    }

    @Step("Check BuildingObject Width")
    public void checkBuildingShapeWidth(OpenProjectResponse project, OpenProjectResponse projectExpected) {
            assertThat(getZoningAllowance(project).getWidth(), is(getZoningAllowance(projectExpected).getWidth()));
    }

    @Step("Check BuildingObject Depth")
    public void checkBuildingShapeDepth(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getZoningAllowance(project).getDepth(), is(getZoningAllowance(projectExpected).getDepth()));

    }

    @Step("Check Irregular Area")
    public void checkIrregularArea(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getZoningAllowance(project).getIrregularArea(), is(getZoningAllowance(projectExpected).getIrregularArea()));
    }


    @Step("Check Irregular Frontage")
    public void checkIrregularFrontage(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getZoningAllowance(project).getIrregularFrontage(), is(getZoningAllowance(projectExpected).getIrregularFrontage()));
    }

    @Step("Check Height Limit")
    public void checkHeightLimit(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getZoningAllowance(project).isHeightLimit(), is(getZoningAllowance(projectExpected).isHeightLimit()));
    }

    @Step("Check Height Limit Value")
    public void checkHeightLimitValue(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getZoningAllowance(project).getHeightLimitValue(), is(getZoningAllowance(projectExpected).getHeightLimitValue()));
    }
}
