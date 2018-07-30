package befaster.solutions.SUM;

public class SumSolution {

    /**
     * @param x
     * @param y
     * @return
     */
    public int compute(final int x, final int y) {



        if (x < 0 || x > 100) {
            throw new IllegalArgumentException("x must be between 0 and 100");
        }
        if (y < 0 || y > 100) {
            throw new IllegalArgumentException("y must be between 0 and 100");
        }
        return x + y;
    }

}
