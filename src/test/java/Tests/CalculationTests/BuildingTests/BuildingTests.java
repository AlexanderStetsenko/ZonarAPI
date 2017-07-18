package Tests.CalculationTests.BuildingTests;

import Entyties.Responses.OpenProjectResponse;
import Tests.CalculationTests.BaseProjectTest;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

@Features("Calculation")
@Stories("Building Stories")
public class BuildingTests extends BaseProjectTest {

//    public BuildingTests(int shapeId, OpenProjectResponse projectExpected) {
//        super(shapeId, projectExpected);
//    }


    @Test
    @Title("Check Shape Width and Depth")
    public void checkShapeWidthDepth() throws Exception {
        buildingActions.checkBuildignShapeWidth(project, projectExpected);
        buildingActions.checkBuildignShapeDepth(project, projectExpected);
    }

    @Test
    @Title("Check Applied Variances by Id's list")

    public void checkAppliedVariances() throws Exception {
        buildingActions
                .checkVariancesList(project, projectExpected);
    }

    @Test
    @Title("Check Zone and Municipality Names")
    public void checkZone(){
        buildingActions
                .checkZoneAndMunicipality(project, projectExpected);
    }

    }
