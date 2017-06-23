package Tests.BuildingTests;

import HTTP.Requests.Project.ProjectCalculation.BuildingCalculationRequest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import Tests.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Александр on 14.06.2017.
 */
public class BuildingCalculation extends BaseTest {

    private static BuildingCalculationRequest buildingCalculation;

    @BeforeClass
    public static void before(){

        buildingCalculation = new BuildingCalculationRequest();
    }

    @Test
    public void buildingCreation() throws Exception {
        String response = buildingCalculation.buildingCalculationRequest().getBody().toString();
        System.out.println(response);
        assertThat(response, containsString("'id':4514"));
    }


}
