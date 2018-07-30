package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }


    @Test
    public void compute_sum_extreme_max() {
        assertThat(sum.compute(100, 100), equalTo(200));
    }

    @Test
    public void compute_sum_extreme_min() {
        assertThat(sum.compute(0, 0), equalTo(0));
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_outside_bounds_x_and_y() {
        assertThat(sum.compute(-1, -1), equalTo(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_outside_bounds_x() {
        assertThat(sum.compute(-1, 100), equalTo(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_outside_bounds_y() {
        assertThat(sum.compute(100, -1), equalTo(2));
    }

}
