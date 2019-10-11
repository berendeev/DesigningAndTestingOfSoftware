import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeneficiaryTest {
    private static final double DELTA = 0.001;

    @Test
    public void interestRateCalculationTest() {
        Client client1 = new Beneficiary(10000000 / 12);
        assertEquals(0.1, client1.getInterestRate(), DELTA);

        Client client2 = new Beneficiary(10000);
        assertEquals(2, client2.getInterestRate(), DELTA);

        Client client3 = new Beneficiary(800);
        assertEquals(25, client3.getInterestRate(), DELTA);
    }

    @Test
    public void creditSizeCalculationTest() {
        Client client1 = new Beneficiary(1);
        assertEquals(12, client1.getCreditSize(), DELTA);

        Client client2 = new Beneficiary(1000);
        assertEquals(12000, client2.getCreditSize(), DELTA);
    }

}