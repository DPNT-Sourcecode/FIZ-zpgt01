package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

import java.util.function.IntFunction;

public class FizzBuzzSolution {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ_BUZZ = FIZZ + " " + BUZZ;

    /**
     * If the number is a multiple of three then you should write "fizz"
     * - If the number is a multiple of five then you should write "buzz"
     * - If the number is a multiple of both three and five then you should write "fizz buzz"
     * - If the number is not a multiple of five or three then write the number, example 1
     */
    private final IntFunction<String> FIZZ_BUZZ_IMPL = new IntFunction<String>() {
        @Override
        public String apply(int value) {
            if(value %3 == 0 && value % 5 == 0){

            }
            return null;
        }
    };

    public String fizzBuzz(Integer number) {
        throw new SolutionNotImplementedException();
    }

}
