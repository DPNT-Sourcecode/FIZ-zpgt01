package befaster.solutions.FIZ;

import java.util.function.IntFunction;

public final class FizzBuzzSolution {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ_BUZZ = FIZZ + " " + BUZZ;

    /**
     * If the number is a multiple of three then you should write "fizz"
     * - If the number is a multiple of five then you should write "buzz"
     * - If the number is a multiple of both three and five then you should write "fizz buzz"
     * - If the number is not a multiple of five or three then write the number, example 1
     */
    private final IntFunction<String> FIZZ_BUZZ_IMPL = value -> {
        if(value == 0){
            return Integer.toString(value);
        }
        if (value % 3 == 0 && value % 5 == 0) {
            return FIZZ_BUZZ;
        } else if (value % 3 == 0) {
            return FIZZ;
        } else if (value % 5 == 0) {
            return BUZZ;
        }
        return Integer.toString(value);
    };


    /**
     * 
     */
    private final IntFunction<String> FIZZ_BUZZ_IMPL_V2 = value -> {
        if(value == 0){
            return Integer.toString(value);
        }
        if (value % 3 == 0 && value % 5 == 0) {
            return FIZZ_BUZZ;
        } else if (value % 3 == 0) {
            return FIZZ;
        } else if (value % 5 == 0) {
            return BUZZ;
        }
        return Integer.toString(value);
    };

    /**
     * Notes:
     *  - You do not have to test for illegal input.
     *  - The input numbers are between 1-9999
     * @param number
     * @return
     */
    public String fizzBuzz(final Integer number) {
        return FIZZ_BUZZ_IMPL.apply(number);
    }

}
