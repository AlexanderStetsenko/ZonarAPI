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


    @Test
    @Title("Check Zone and Municipality Names")
    public void checkZone(){
        buildingActions
                .checkZoneAndMunicipality(project, projectExpected);
    }

    }
