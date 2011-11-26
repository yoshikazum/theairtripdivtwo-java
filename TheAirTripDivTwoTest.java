import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheAirTripDivTwoTest {

    protected TheAirTripDivTwo solution;

    @Before
    public void setUp() {
        solution = new TheAirTripDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] flights = new int[]{1, 2, 3, 4, 5, 6, 7};
        int fuel = 10;

        int expected = 4;
        int actual = solution.find(flights, fuel);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] flights = new int[]{7, 6, 5, 4, 3, 2, 1};
        int fuel = 10;

        int expected = 1;
        int actual = solution.find(flights, fuel);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] flights = new int[]{1};
        int fuel = 1000;

        int expected = 1;
        int actual = solution.find(flights, fuel);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] flights = new int[]{8, 7, 7, 1, 5, 7, 9};
        int fuel = 21;

        int expected = 2;
        int actual = solution.find(flights, fuel);

        Assert.assertEquals(expected, actual);
    }

}
