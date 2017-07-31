package Tests.CalculationTests.BuildingTests.ZoningAllowenceTests;

import Actions.BuildingActions.ZoningAllowanceActions.FrontagesActions;
import Tests.CalculationTests.BuildingTests.BuildingTests;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

@Features("Zoning Allowance Calculation")
@Stories("Frontages Tests")
public class FrontagesTests extends BuildingTests {

    FrontagesActions frontagesActions = new FrontagesActions();

    @Test
    @Title("Check Frontage Type")
    public void checkFrontageNumberTest() throws Exception {
        frontagesActions.checkFrontageNumber(project, projectExpected);
    }

    @Test
    @Title("Check Frontage Type")
    public void checkFrontageTypeTest() throws Exception {
            frontagesActions.checkFrontageType(project, projectExpected);
    }

    @Test
    @Title("Check Setbacks")
    public void checkSetbacksTest() throws Exception {
        frontagesActions.checkSetbacks(project, projectExpected);
    }
}
