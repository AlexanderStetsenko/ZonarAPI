package Rule;

import org.junit.Rule;
import org.junit.rules.Verifier;

import static org.junit.Assert.assertTrue;

public class MyVirifierRule extends Verifier {

    @Override
    protected void verify() throws Throwable {
        System.out.println("it works");
    }


}
