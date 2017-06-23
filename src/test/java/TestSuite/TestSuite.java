package TestSuite;

import Tests.AccountTests.Login;
import Tests.BuildingTests.CreateProjectTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Александр on 22.06.2017.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        Login.class,
        CreateProjectTest.class
})
public class TestSuite {
}
