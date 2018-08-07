package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number%3 == 0) {
            stringBuilder.append("fizz");
        }

        if (String.valueOf(number).contains("3")) {
            if (number%2 == 0) {
                stringBuilder.append("deluxe");
            } else {
                stringBuilder.append("fake deluxe");
            }
        }
    }

}
