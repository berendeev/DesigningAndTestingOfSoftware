import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CivilianTest {
    private static final double DELTA = 0.001;

    @Test
    public void interestRateCalculationTest() {
        Client civilian1 = new Civilian(100000);
        assertEquals(0.1, civilian1.getInterestRate(), DELTA);

        Client civilian2 = new Civilian(10000);
        assertEquals(5, civilian2.getInterestRate(), DELTA);

        Client civilian3 = new Civilian(1000);
        assertEquals(50, civilian3.getInterestRate(), DELTA);
    }

    @Test
    public void creditSizeCalculationTest() throws Exception {
        Client civilian1 = new Civilian(1);
        assertEquals(10, civilian1.getCreditSize(), DELTA);

        Client civilian2 = new Civilian(14);
        assertEquals(140, civilian2.getCreditSize(), DELTA);
    }
}