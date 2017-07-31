package TestSuite;

import Tests.CalculationTests.BuildingTests.ZoningAllowenceTests.*;
import Tests.CalculationTests.BuildingTests.BuildingTests;
import Tests.CalculationTests.ProjectTests.ProjectGeneralInformationTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BuildingTests.class,
        ProjectGeneralInformationTests.class,
        MaximumLotCapacityTests.class,
        UsesTest.class,
        AllowedFrontageTypesTests.class,
        ZoningAllowancesTests.class,
        FrontagesTests.class
})
public class BuildingSuite {
}
