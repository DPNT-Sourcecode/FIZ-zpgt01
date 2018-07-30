package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzHipsterTest {

    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() {
        fizzBuzzSolution = new FizzBuzzSolution();
    }

    /**
     * The old rules for "deluxe" do not apply.
     * - A number is "fizz deluxe" if it is divisible by 3 AND it has a 3 in it
     * - A number is "buzz deluxe" if it is divisible by 5 AND it has a 5 in it
     * - We should still say "fake deluxe" if the "deluxe" number is odd
     * - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
     * - All the previous rules for "fizz" and "buzz" are still valid
     */
    @Test
    public void fizzBuzz_3_and_3() {
        //odd and repeated digits fso it is fake
        assertThat(fizzBuzzSolution.fizzBuzz(33), is(FizzBuzzSolution.FIZZ_FAKE_DELUXE));
    }

    @Test
    public void fizzBuzz_divides_by_5_and_contains_5() {
        //but no repeated digits so vanilla
        assertThat(fizzBuzzSolution.fizzBuzz(25), is(FizzBuzzSolution.BUZZ));
    }

    @Test
    public void fizzBuzz_divides_by_5_and_contains_5_multi() {
        //but no repeated digits so vanilla
        assertThat(fizzBuzzSolution.fizzBuzz(55), is(FizzBuzzSolution.BUZZ_FAKE_DELUXE));
    }


    @Test
    public void fizzBuzz_failed_test_data() {
        //odd and repeated digits fso it is fake
        assertThat(fizzBuzzSolution.fizzBuzz(36), is(FizzBuzzSolution.FIZZ_DELUXE));
        assertThat(fizzBuzzSolution.fizzBuzz(396), is(FizzBuzzSolution.FIZZ_DELUXE));
        assertThat(fizzBuzzSolution.fizzBuzz(936), is(FizzBuzzSolution.FIZZ_DELUXE));
    }
}
