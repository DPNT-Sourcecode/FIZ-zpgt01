package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(substituteForDivisor(number, 3, "fizz"));

        if (stringBuilder.length() == 0) {
            stringBuilder.append(number);
        }
        return stringBuilder.toString();
    }

    public String substituteForDivisor(int dividend, int divisor, String substitute) {
        StringBuilder builder = new StringBuilder();
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

        return builder.toString();
    }

}
