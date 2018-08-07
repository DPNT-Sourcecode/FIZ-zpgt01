package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzzSolution();
    }

    @Test
    public void computeFizzBuzzForOne() {
        assertEquals("1 should return 1", "1", fizzBuzz.fizzBuzz(1));
    }

    @Test
    public void computeFizzBuzzForThree() {
        assertEquals("3 should return fizz fake deluxe", "fizz fake deluxe", fizzBuzz.fizzBuzz(1));
    }

}
