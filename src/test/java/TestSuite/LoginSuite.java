package TestSuite;

import Tests.AccountTests.Login;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        Login.class
})
public class LoginSuite {
}
