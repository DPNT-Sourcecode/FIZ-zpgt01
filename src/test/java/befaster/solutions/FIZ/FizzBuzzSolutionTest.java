package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {

    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() {
        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void fizzBuzz_3_and_3() {
        assertThat(fizzBuzzSolution.fizzBuzz(33), is(FizzBuzzSolution.FIZZ_DELUXE));
    }

    @Test
    public void fizzBuzz_5_and_5() {
        assertThat(fizzBuzzSolution.fizzBuzz(55), is(FizzBuzzSolution.FIZZ_BUZZ_DELUXE));
    }

    @Test
    public void fizzBuzz_3_and_5() {
        assertThat(fizzBuzzSolution.fizzBuzz(35), is(FizzBuzzSolution.FIZZ_BUZZ));
    }

    @Test
    public void fizzBuzz_3() {
        assertThat(fizzBuzzSolution.fizzBuzz(3), is(FizzBuzzSolution.FIZZ));
    }


    @Test
    public void fizzBuzz_other() {
        assertThat(fizzBuzzSolution.fizzBuzz(0), is("0"));
        assertThat(fizzBuzzSolution.fizzBuzz(1), is("1"));
    }

    @Test
    public void fizzBuzz_5() {
        assertThat(fizzBuzzSolution.fizzBuzz(5), is(FizzBuzzSolution.BUZZ));
    }

    @Test
    public void fizzBuzz_3and5() {
        assertThat(fizzBuzzSolution.fizzBuzz(15), is(FizzBuzzSolution.FIZZ_BUZZ));
    }

    @Test
    public void fizzBuzz_deluxe() {
        assertThat(fizzBuzzSolution.fizzBuzz(111), is(FizzBuzzSolution.FIZZ_DELUXE));
    }

    @Test
    public void isDeluxeNumber() {
        assertTrue("", fizzBuzzSolution.isDeluxeNumber(11));
        assertTrue("", fizzBuzzSolution.isDeluxeNumber(111));
        assertTrue("", fizzBuzzSolution.isDeluxeNumber(9999));
        assertFalse("", fizzBuzzSolution.isDeluxeNumber(1));
        assertFalse("", fizzBuzzSolution.isDeluxeNumber(12));
    }
}
