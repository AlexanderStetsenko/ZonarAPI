package Tests.CalculationTests.BuildingTests.ZoningAllowenceTests;


import Actions.BuildingActions.ZoningAllowanceActions.ZoningAllowancesActions;
import Tests.CalculationTests.BaseProjectTest;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


@Features("Zoning Allowance Calculation")
public class ZoningAllowancesTests extends BaseProjectTest {

    protected ZoningAllowancesActions zoningAllowancesActions = new ZoningAllowancesActions();

    /*ZOne Parameters Tests*/
    @Test
    @Stories("Zone Parameters Checking")
    @Title("Check Zoning Code Id")
    public void checkZoningCodeIdTest() throws Exception {
        zoningAllowancesActions.checkZoningCodeId(project, projectExpected);
    }

    @Test
    @Stories("Zone Parameters Checking")
    @Title("Check Zoning Id")
    public void checkZoneIdTest() throws Exception {
        zoningAllowancesActions.checkZoneId(project, projectExpected);
    }

    @Test
    @Stories("Zone Parameters Checking")
    @Title("Check Zone Type Id")
    public void checkZoneTypeIdTest() throws Exception {
        zoningAllowancesActions.checkZoneTypeId(project, projectExpected);
    }

    @Test
    @Stories("Zone Parameters Checking")
    @Title("Check SubZone Id")
    public void checkSubZoneIdTest() throws Exception {
        zoningAllowancesActions.checkSubZoneId(project, projectExpected);
    }


    /*Overrides*/
    @Test
    @Stories("Applied Building Overrides Checking by Ids")
    @Title("Check Variance Ids List")
    public void checkVariancesIdTest() throws Exception {
        zoningAllowancesActions.
                checkVariancesList(project, projectExpected);
    }

    @Test
    @Stories("Applied Building Overrides Checking by Ids")
    @Title("Check Overlays Ids List")
    public void checkOverlayIdsTest() throws Exception {
        zoningAllowancesActions.checkOverlayList(project, projectExpected);
    }

    @Test
    @Stories("Applied Building Overrides Checking by Ids")
    @Title("Check Building Typology Ids List")
    public void checkBuildingTypologyIdsTest() throws Exception {
        zoningAllowancesActions.checkBuildingTypologyId(project, projectExpected);
    }

    /*Building Dimensions*/
    @Test
    @Stories("Building Dimensions Checking")
    @Title("Check Is Irregular")
    public void checkIsIrregular() throws Exception {
        zoningAllowancesActions.checkIsIrregular(project, projectExpected);
    }

    @Test
    @Stories("Building Dimensions Checking")
    @Title("Check Width")
    public void checkWidth() throws Exception {
        zoningAllowancesActions.checkBuildingShapeWidth(project, projectExpected);
    }

    @Test
    @Stories("Building Dimensions Checking")
    @Title("Check Depth")
    public void checkDepth() throws Exception {
        zoningAllowancesActions.checkBuildingShapeDepth(project, projectExpected);
    }

    @Test
    @Stories("Building Dimensions Checking")
    @Title("Check Irregular Area")
    public void checkIrregularArea() throws Exception {
        zoningAllowancesActions.checkIrregularArea(project, projectExpected);
    }

    @Test
    @Stories("Building Dimensions Checking")
    @Title("Check Irregular Frontage")
    public void checkIrregularFrontage() throws Exception {
        zoningAllowancesActions.checkIrregularFrontage(project, projectExpected);
    }

    @Test
    @Stories("Building Dimensions Checking")
    @Title("Check Height Limit")
    public void checkHeightLimit() throws Exception {
        zoningAllowancesActions.checkHeightLimit(project, projectExpected);
    }

    @Test
    @Stories("Building Dimensions Checking")
    @Title("Check Height Limit Value")
    public void checkHeightLimitValue() throws Exception {
        zoningAllowancesActions.checkHeightLimitValue(project, projectExpected);
    }
}

