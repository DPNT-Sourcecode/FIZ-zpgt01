package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class HelloSolutionTest {

    private HelloSolution helloSolution;


    @Before
    public void setUp() {

        helloSolution = new HelloSolution();
    }


    @Test
    public void hello() {
        final String fName = "John";
        assertThat(helloSolution.hello(fName), is("Hello, " + fName + "!"));
        assertThat(helloSolution.hello(null), is("Hello, World!"));
    }
}