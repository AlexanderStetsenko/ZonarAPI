package Actions.BuildingActions;

import Actions.BaseAction;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.GeneralInfo.GeneralInfoRow;
import Entyties.Responses.OpenProjectResponse;
import ru.yandex.qatools.allure.annotations.Step;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class AllowedFrontagesTypeActions extends BaseAction {

    private enum FrontageTypes {
        isCommonLawn,
        isPorchAndFence,
        isTerraceOrLightwell,
        isForecourt,
        isStoop,
        isShopfront,
        isGallery,
        isArcade
    }

    private GeneralInfoRow getGeneralInformationRow(OpenProjectResponse project){
        return getZcCalibrations(project).
                getGeneralInfo().
                getRow();
    }

    @Step("Check Frontage {1}")
    private Boolean isFrontageTypeAvailable(OpenProjectResponse project, FrontageTypes name) throws Exception {
        Class c = GeneralInfoRow.class;
        Boolean result = null;
        Method[] methods = c.getMethods();
        GeneralInfoRow getGeneralInformationRow = getGeneralInformationRow(project);
        for (Method method : methods) {
            if(method.getName() == name.toString()){
                try {
                    result = (Boolean) method.invoke(getGeneralInformationRow);
                    break;
                } catch (IllegalAccessException e) {
                    throw new Exception("Test is Broken");

                } catch (InvocationTargetException e) {
                    throw new Exception("Test is Broken");
                }
            }
        }
        return result;
    }

    // Check value all Frontage (is disabled) types from enum list
    @Step("Check Frontage Types")
    public void checkFrontegeTypes(OpenProjectResponse project, OpenProjectResponse projectExpected) throws AssertionError, Exception {
        List<String> errors = new ArrayList<>();
        for (FrontageTypes frontageType : FrontageTypes.values()) {
            System.out.println(frontageType);
            try {
                assertThat(isFrontageTypeAvailable(project, frontageType),
                        is(isFrontageTypeAvailable(projectExpected, frontageType)));
            } catch (AssertionError e) {
                errors.add("\n\nExpected: "  + frontageType +" value is "+ isFrontageTypeAvailable(project, frontageType)  +
                        "\nbut Was: " + frontageType +" value is "+ isFrontageTypeAvailable(projectExpected, frontageType));
            }
        }
        assertThat(String.valueOf(errors), errors.isEmpty());
    }

    // Check one Frontage type value (is disabled)  by Frontage type name from enum list
    @Step("Check Frontage Type")
    public void checkFrontegeType(OpenProjectResponse project, OpenProjectResponse projectExpected, FrontageTypes frontegeTypeName) throws Exception  {
            assertThat(isFrontageTypeAvailable(project, frontegeTypeName),
                    is( isFrontageTypeAvailable(projectExpected, frontegeTypeName)));

    }

}
