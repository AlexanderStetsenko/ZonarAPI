package TestSuite;

import Tests.CalculationTests.BuildingTests.ZoningAllowence.AllowedFrontageTypes;
import Tests.CalculationTests.BuildingTests.BuildingTests;
import Tests.CalculationTests.BuildingTests.ZoningAllowence.MaximumLotCapacityTests;
import Tests.CalculationTests.BuildingTests.ZoningAllowence.UsesTest;
import Tests.CalculationTests.ProjectTests.ProjectGeneralInformationTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BuildingTests.class,
        ProjectGeneralInformationTests.class,
        MaximumLotCapacityTests.class,
        UsesTest.class,
        AllowedFrontageTypes.class
})
public class BuildingSuite {
}
