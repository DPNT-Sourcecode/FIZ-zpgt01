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
     *  The old rules for "deluxe" do not apply.
     *   - A number is "fizz deluxe" if it is divisible by 3 AND it has a 3 in it
     *   - A number is "buzz deluxe" if it is divisible by 5 AND it has a 5 in it
     *   - We should still say "fake deluxe" if the "deluxe" number is odd
     *   - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
     *   - All the previous rules for "fizz" and "buzz" are still valid
     */
    @Test
    public void fizzBuzz_3_and_3() {
        //odd and repeated digits fso it is fake
        assertThat(fizzBuzzSolution.fizzBuzz(33), is(FizzBuzzSolution.FIZZ_FAKE_DELUXE));
    }

}
