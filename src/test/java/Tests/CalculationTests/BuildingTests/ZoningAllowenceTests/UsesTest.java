package Tests.CalculationTests.BuildingTests.ZoningAllowenceTests;

import Tests.CalculationTests.BaseProjectTest;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

@Features("Calculation")
@Stories("Uses")
public class UsesTest extends BaseProjectTest {

    @Test
    @Title("Uses from Calibrations")
    public void usesFromCalibrationsTest(){usesActions.checkUsesFromCalibrations(project, projectExpected);
    }

    @Test
    @Title("Uses from Original Calibrations")
    public void usesFromOriginalCalibrationsTest(){
        usesActions.checkUsesFromOriginalCalibrations(project, projectExpected);
    }

    @Test
    @Title("Uses from Calibrations Without Variances")
    public void usesFromCalibrationsWithoutVariancesTest(){
        usesActions.checkUsesFromCalibrationsWithoutVariances(project, projectExpected);
    }


}
