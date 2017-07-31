package Services;

import org.hamcrest.MatcherAssert;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isIn;
import static org.hamcrest.core.Is.is;

/**
 * Created by Александр on 18.07.2017.
 */
public class MyAssertation {

    static List<String> Errors = new ArrayList<>();


    public void assertThatIsIfTesthasFewSteps(Object object, Object objectExpected){

        try {
            MatcherAssert.assertThat(object, is(objectExpected));
        }
        catch (AssertionError e){
            Errors.add(String.valueOf(e));
        }
    }

    public static void log()
    {
        Throwable t = new Throwable();
        StackTraceElement trace[] = t.getStackTrace();

        // Глубина стэка должна быть больше 1-го, поскольку интересующий
        // нас элемент стэка находится под индексом 1 массива элементов
        // Элемент с индексом 0 - это текущий метод, т.е. log
        if (trace.length > 1)
        {
            StackTraceElement element = trace[1];
            System.out.format("[%s] [%s, %d] %s", element.getClassName(), element.getMethodName(), element.getLineNumber());
        }
        else
            System.out.format("");
    }
    public void getErrors(){

        assertThat(String.valueOf(Errors), Errors.isEmpty());
    }

    public void assertThatIs(Object object, Object objectExpected) {
        assertThat(object, is(objectExpected));
    }

    public void assertThatIsIn(Object object, List<Object> objectExpected) {
        assertThat(object, isIn(objectExpected));

    }
}
