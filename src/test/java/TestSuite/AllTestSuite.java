package TestSuite;

import Tests.AccountTests.BaseAcountTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginSuite.class,
        BuildingSuite.class
})
public class AllTestSuite {
}
