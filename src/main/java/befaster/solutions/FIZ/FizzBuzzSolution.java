package befaster.solutions.FIZ;

import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class FizzBuzzSolution {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ_BUZZ = FIZZ + " " + BUZZ;
    public static final String DELUXE = "deluxe";
    public static final String FIZZ_BUZZ_DELUXE = FIZZ_BUZZ + " " + DELUXE;
    public static final String FIZZ_DELUXE = FIZZ + " " + DELUXE;

    public static final String BUZZ_DELUXE = BUZZ + " " + DELUXE;
    public static final String FAKE = "fake";
    public static final String FAKE_DELUXE = FAKE + " " + DELUXE;
    public static final String FIZZ_FAKE_DELUXE = FIZZ + " " + FAKE_DELUXE;
    public static final String BUZZ_FAKE_DELUXE = BUZZ + " " + FAKE_DELUXE;
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

    private final Predicate<String> ALL_DIGITS_ARE_THE_SAME = s -> {
        if (null == s || s.isEmpty() || s.length() == 1) {
            return false;
        }
        boolean result = true;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != chars[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    };


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
     * Turns out that people do not like odd numbers, they call them "fake".
     * The want us to change the Deluxe version so that:
     * - If a "deluxe" number is odd, we should call him "fake deluxe"
     * - A number cannot be both "deluxe" and "fake deluxe" at the same time
     * - All the previous rules are still valid
     */
    private final IntFunction<String> FIZZ_BUZZ_IMPL_DELUXE_FAKE = value -> {
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
            //this is a deluxe number...
            String howDeluxe;
            //how deluxe is it?
            if (value % 2 == 0) {
                howDeluxe = DELUXE;
            } else {
                //odd so it is fake
                howDeluxe = FAKE_DELUXE;
            } //even therefore not fake
            if (result.isEmpty()) {
                result = howDeluxe;
            } else {
                result += " " + howDeluxe;
            }
        }

        if (result.isEmpty()) {
            result = number;
        }
        return result;
    };


    /**
     * - The old rules for "deluxe" do not apply.
     * - A number is "fizz deluxe" if it is divisible by 3 AND it has a 3 in it
     * - A number is "buzz deluxe" if it is divisible by 5 AND it has a 5 in it
     * - We should still say "fake deluxe" if the "deluxe" number is odd
     * - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
     * - All the previous rules for "fizz" and "buzz" are still valid
     */
    private final IntFunction<String> FIZZ_BUZZ_HIPSTER = value -> {
        if (value == 0) {
            return Integer.toString(value);
        }
        String result = "";
        String number = Integer.toString(value);

        final boolean dividesBy3 = (value % 3 == 0);
        final boolean contains3 = number.contains("3");

        final boolean dividesBy5 = (value % 5 == 0);
        final boolean contains5 = number.contains("5");

        //  - A number is "fizz deluxe" if it is divisible by 3 AND it has a 3 in it
        if (dividesBy3 || contains3) {
            result = FIZZ;
        }
        if (dividesBy5 || contains5) {
            if (result.isEmpty()) {
                result = BUZZ;
            } else {
                result = FIZZ_BUZZ;
            }
        }

        //if (value > 10 /*&& ALL_DIGITS_ARE_THE_SAME.test(number)*/) {

        if ((dividesBy3 && contains3) || (dividesBy5 && contains5)) {

            String howDeluxe;
            if (value % 2 == 0) {
                howDeluxe = DELUXE;
            } else {
                howDeluxe = FAKE_DELUXE;
            }
            //this is a deluxe number


            if ((dividesBy3 && contains3) && (dividesBy5 && contains5)) {
                result = FIZZ_BUZZ + " " + howDeluxe;
            } else if (dividesBy3 && contains3) {
                if (!result.isEmpty()) {
                    result = FIZZ + " " + howDeluxe;
                } else {
                    result += howDeluxe;
                }
            } else if (dividesBy5 && contains5) {
                if (!result.isEmpty()) {
                    result = BUZZ + " " + howDeluxe;
                } else {
                    result += howDeluxe;
                }
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
        return FIZZ_BUZZ_HIPSTER.apply(number);
    }

    public boolean isDeluxeNumber(final Integer integer) {
        return ALL_DIGITS_ARE_THE_SAME.test(Integer.toString(integer));
    }

}
