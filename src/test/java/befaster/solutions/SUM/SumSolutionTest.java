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


    @Test(expected = IllegalArgumentException.class)
    public void test_outside_bounds_x_and_y(){
        assertThat(sum.compute(-1, -1), equalTo(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_outside_bounds_x(){
        assertThat(sum.compute(-1, 100), equalTo(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_outside_bounds_y(){
        assertThat(sum.compute(100, -1), equalTo(2));
    }

}