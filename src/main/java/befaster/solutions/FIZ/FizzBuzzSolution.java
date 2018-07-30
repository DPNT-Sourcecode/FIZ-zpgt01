package befaster.solutions.FIZ;

import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class FizzBuzzSolution {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ_BUZZ = FIZZ + " " + BUZZ;
    public static final String DELUXE = "deluxe";

    /**
     * If the number is a multiple of three then you should write "fizz"
     * - If the number is a multiple of five then you should write "buzz"
     * - If the number is a multiple of both three and five then you should write "fizz buzz"
     * - If the number is not a multiple of five or three then write the number, example 1
     */
    private final IntFunction<String> FIZZ_BUZZ_IMPL = value -> {
        if (value == 0) {
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
     * - A number is "fizz" if it is divisible by 3 or if it has a 3 in it
     * - A number is "buzz" if it is divisible by 5 or if it has a 5 in it
     * - A number can be both "fizz" and "buzz" at the same time.
     * If this happens then write "fizz buzz"
     */
    private final IntFunction<String> FIZZ_BUZZ_IMPL_V2 = value -> {
        if (value == 0) {
            return Integer.toString(value);
        }
        String result = "";
        String number = Integer.toString(value);
        if (value % 3 == 0 || number.contains("3")) {
            result = FIZZ;
        }
        if (value % 5 == 0 || number.contains("5")) {
            if (result.isEmpty()) {
                result = BUZZ;
            } else {
                result = FIZZ_BUZZ;
            }
        }
        if (result.isEmpty()) {
            result = number;
        }
        return result;
    };

    private final Predicate<String> ALL_DIGITS_ARE_THE_SAME = new Predicate<String>() {
        @Override
        public boolean test(final String s) {
            if(null == s || s.isEmpty()){
                return false;
            }
            return false;
        }
    }


    /**
     * People like "fizz buzz" but the upper class of the society wants more.
     * Let's create a "Deluxe" version !
     * It goes like this, we are going to add a new rule:
     * - A number is considered to be "deluxe" if it is greater than 10 and all the digits are identical
     * - A number can be "fizz", "buzz" and "deluxe" at the same time.
     * If this happens then write "fizz buzz deluxe"
     */
    private final IntFunction<String> FIZZ_BUZZ_IMPL_DELUXE = value -> {
        if (value == 0) {
            return Integer.toString(value);
        }
        String result = "";
        String number = Integer.toString(value);
        if (value % 3 == 0 || number.contains("3")) {
            result = FIZZ;
        }
        if (value % 5 == 0 || number.contains("5")) {
            if (result.isEmpty()) {
                result = BUZZ;
            } else {
                result = FIZZ_BUZZ;
            }
        }

        if (value > 10 && ALL_DIGITS_ARE_THE_SAME.test(number)) {
            if (result.isEmpty()) {
                result = DELUXE;
            } else {
                result += " " + DELUXE;
            }
        }

        if (result.isEmpty()) {
            result = number;
        }
        return result;
    };


    /**
     * Notes:
     * - You do not have to test for illegal input.
     * - The input numbers are between 1-9999
     *
     * @param number
     * @return
     */
    public String fizzBuzz(final Integer number) {
        return FIZZ_BUZZ_IMPL_V2.apply(number);
    }

}
