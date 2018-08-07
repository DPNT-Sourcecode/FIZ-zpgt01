package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder stringBuilder = new StringBuilder();
        getString(number, 3, "fizz", stringBuilder);
        return stringBuilder.toString();
    }

    public void getString(int dividend, int divisor, String substitute, StringBuilder builder) {
        if (dividend%divisor == 0) {
            builder.append(substitute);
        }

        if (String.valueOf(dividend).contains(String.valueOf(divisor))) {
            if (dividend%2 == 0) {
                builder.append("deluxe");
            } else {
                builder.append("fake deluxe");
            }
        }
    }

}
