package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        List<String> builder = new ArrayList();

        if (number%3 == 0) {
            builder.add("fizz");
        }

        if (number%5 == 0) {
            builder.add("buzz");
        }

        builder.addAll(getDeluxeCode(number, 3, 5));

        if (builder.isEmpty()) {
            builder.add(String.valueOf(number));
        }

        return String.join(" ", builder);
    }

    public List<String> getDeluxeCode(final int dividend, int... divisors) {
        List builder = new ArrayList<>();

        for (int divisor: divisors) {
            if (String.valueOf(dividend).contains(String.valueOf(divisor))) {
                if (dividend%2 == 0) {
                    builder.add("deluxe");
                } else {
                    builder.add("fake deluxe");
                }
                break;
            }
        }
        return builder;
    }

}
