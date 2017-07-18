
package Actions.BuildingActions;

import Actions.BaseAction;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Uses.UsesRow;
import Entyties.Responses.OpenProjectResponse;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

/**
 * Created by Александр on 11.07.2017.
 */
public class UsesActions extends BaseAction {


    // Compare Uses by Label Name and Value
    private void checkUses(List<UsesRow> usesProject, List<UsesRow> usesExpected){

        List<String> errors = new ArrayList<String>();

        Map<String, String> usesLabelValue = new HashMap<String, String>();
        for(UsesRow uses : usesExpected)usesLabelValue.put(uses.getLabel(), uses.getValue());

        for (UsesRow uses : usesProject){
            for (UsesRow useEX : usesExpected) {
                if(uses.getLabel().equals(useEX.getLabel())){
                    try{
                        assertThat(uses.getValue(), equalToIgnoringCase(usesLabelValue.get(uses.getLabel())));
                    }catch (AssertionError e)
                    {
                        errors.add("\n" + uses.getLabel() + ": \n   Expected: " + usesLabelValue.get(uses.getLabel()) + "\n   but was: " + uses.getValue());
                    }
                }
            }
        }
        assertThat(String.valueOf(errors), errors.isEmpty());

    }


    @Step("Check Uses From Calibrations")
    public void checkUsesFromCalibrations(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        List<UsesRow> usesProject = getUsesFromZcCalibrations(project).getRow();
        List<UsesRow> usesExpected = getUsesFromZcCalibrations(projectExpected).getRow();
        checkUses(usesProject, usesExpected);
    }


    @Step("Check Uses From Original Calibrations")
    public void checkUsesFromOriginalCalibrations(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        List<UsesRow> usesProject = getUsesFromZcOriginalCalibrations(project).getRow();
        List<UsesRow> usesExpected = getUsesFromZcOriginalCalibrations(projectExpected).getRow();
        checkUses(usesProject, usesExpected);
    }


    @Step("Check Uses From Calibrations Without Uses")
    public void checkUsesFromCalibrationsWithoutVariances(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        List<UsesRow> usesProject = getUsesFromZcOriginalCalibrationsWithoutVariances(project).getRow();
        List<UsesRow> usesExpected = getUsesFromZcOriginalCalibrationsWithoutVariances(projectExpected).getRow();
        checkUses(usesProject, usesExpected);
    }
}
