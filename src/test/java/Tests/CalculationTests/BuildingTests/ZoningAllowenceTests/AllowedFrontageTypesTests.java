package Tests.CalculationTests.BuildingTests.ZoningAllowenceTests;

import Tests.CalculationTests.BaseProjectTest;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

@Features("Calculation")
@Stories("Allowed Frontage Types Stories")
public class AllowedFrontageTypesTests extends BaseProjectTest {


    @Test
    @Title("Check Allowed Frontage Type Calibrations")
    public void checkAllowedFrontageTypeCalibrations() throws Exception{
        allowedFrontageTypeActions.checkFrontageTypes(project, projectExpected);
    }

}
