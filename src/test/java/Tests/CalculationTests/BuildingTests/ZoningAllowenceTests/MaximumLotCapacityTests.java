package Tests.CalculationTests.BuildingTests.ZoningAllowenceTests;

import Tests.CalculationTests.BaseProjectTest;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

@Features("Calculation")
@Stories("Maximum Lot Capacity Calculation")
public class MaximumLotCapacityTests extends BaseProjectTest {


    @Test
    @Title("Lot Area (PR) Calculation")
    public void lotAreaPRCalculation(){
        maxCapacityActions.checkLotAreaPR(project, projectExpected);
    }
    @Test
    @Title("Lot Area in Acres")
    public void lotAreaInAcresTest(){
        maxCapacityActions.checkLotAreaInAcres(project, projectExpected);
    }

    @Test
    @Title("Floor Area Ratio")
    public void floorAreaRatio(){
        maxCapacityActions.checkFloorAreaRatio(project, projectExpected);
    }

    @Test
    @Title("Dwelling Units per Acre")
    public void dwellingUnitsperAcreTest(){
        maxCapacityActions.checkDwellingUnitsperAcre(project, projectExpected);
    }


    @Test
    @Title("Dwelling Units Allowed")
    public void dwellingUnitsAllowedTest(){
        maxCapacityActions.checkDwellingUnitsAllowedTest(project, projectExpected);
    }

    @Test
    @Title("Lot Coverage")
    public void lotCoverageTest(){
        maxCapacityActions.checkLotCoverage(project, projectExpected);
    }

    @Test
    @Title("Maximum Built Area")
    public void maximumBuiltAreaTest(){
        maxCapacityActions.checkmaximumBuiltArea(project, projectExpected);
    }

    @Test
    @Title("Minimum Open Space")
    public void minOpenSpaceTest(){
        maxCapacityActions.checkMinOpenSpace(project, projectExpected);
    }


    @Test
    @Title("Principal Building Max. Height (Podium)")
    public void principalBuildingMaxHeightPodiumTest(){
        maxCapacityActions.checkPrincipalBuildingMaxHeightPodium(project, projectExpected);}

    @Test
    @Title("Principal Building Min. Height (Podium)")
    public void principalBuildingMinHeightPodiumTest(){
        maxCapacityActions.checkPrincipalBuildingMinHeightPodium(project, projectExpected);}

    @Test
    @Title("Principal Tower Height")
    public void principalTowerHeight(){
        maxCapacityActions.checkPrincipalTowerHeight(project, projectExpected);}

    @Test
    @Title("Max Building Area Allowed")
    public void maxBuildingAreaAllowed(){
        maxCapacityActions.checkMaxBuildingAreaAllowed(project, projectExpected);}

    @Test
    @Title("Max Office Height Allowed")
    public void maxOfficeHeightAllowed(){
        maxCapacityActions.checkMaxOfficeHeightAllowed(project, projectExpected);}

    @Test
    @Title("Max Commercial Area Allowed")
    public void maxCommercialAreaAllowed(){
        maxCapacityActions.checkMaxCommercialAreaAllowed(project, projectExpected);}

    @Test
    @Title("Max Commercial Height")
    public void maxCommercialHeight(){
        maxCapacityActions.checkMaxCommercialHeight(project, projectExpected);}
    @Test
    @Title("Max Commercial Established Area")
    public void checkMaxCommercialEstablishedArea(){
        maxCapacityActions.checkMaxCommercialEstablishedArea(project, projectExpected);}

}
