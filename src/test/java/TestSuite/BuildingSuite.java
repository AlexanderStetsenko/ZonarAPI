package TestSuite;

import Tests.ProjectTests.BuildingTests.BuildingTests;
import Tests.ProjectTests.ProjectGeneralInformationTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BuildingTests.class,
        ProjectGeneralInformationTests.class
})
public class BuildingSuite {
}
