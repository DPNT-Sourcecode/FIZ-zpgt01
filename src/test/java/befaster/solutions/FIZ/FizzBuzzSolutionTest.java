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
    public void computeFizzBuzzFor1() {
        assertEquals("1 should return 1", "1", fizzBuzz.fizzBuzz(1));
    }

    @Test
    public void computeFizzBuzzFor3() {
        assertEquals("3 should return fizz fake deluxe", "fizz fake deluxe", fizzBuzz.fizzBuzz(3));
    }

    @Test
    public void computeFizzBuzzFor6() {
        assertEquals("36 should return fizz deluxe", "fizz deluxe", fizzBuzz.fizzBuzz(36));
    }

    @Test
    public void computeFizzBuzzFor5() {
        assertEquals("5 should return buzz fake deluxe", "buzz fake deluxe", fizzBuzz.fizzBuzz(5));
    }

}
