import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BadCreditHistoryCivilianTest {
    private static final double DELTA = 0.001;

    @Test
    public void interestRateCalculationTest() throws Exception {
        Client client1 = new BadCreditHistoryCivilian(10);
        assertEquals(50, client1.getInterestRate(), DELTA);

        Client client2 = new BadCreditHistoryCivilian(999999999);
        assertEquals(50, client2.getInterestRate(), DELTA);
    }

    @Test
    public void creditSizeCalculationTest() throws Exception {
        Client client1 = new BadCreditHistoryCivilian(10);
        assertEquals(60, client1.getCreditSize(), DELTA);

        Client client2 = new BadCreditHistoryCivilian(1000000);
        assertEquals(6000000, client2.getCreditSize(), DELTA);
    }

}