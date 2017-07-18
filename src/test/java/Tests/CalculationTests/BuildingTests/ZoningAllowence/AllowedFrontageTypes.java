package Tests.CalculationTests.BuildingTests.ZoningAllowence;

import Tests.CalculationTests.BaseProjectTest;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

@Features("Calculation")
@Stories("Allowed Frontage Types Stories")
public class AllowedFrontageTypes extends BaseProjectTest {


    @Test
    @Title("Check Allowed Frontage Type Calibrations")
    public void checkAllowedFrontageTypeCalibrations() throws Exception{
        allowedFrontageTypeActions.checkFrontegeTypes(project, projectExpected);
    }

}
