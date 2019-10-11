import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankEmployeeTest {
    private static final double DELTA = 0.001;

    @Test
    public void interestRateCalculationTest() {
        Client client1 = new BankEmployee(12315);
        assertEquals(0.5, client1.getInterestRate(), DELTA);

        Client client2 = new BankEmployee(55246241);
        assertEquals(0.5, client2.getInterestRate(), DELTA);
    }

    @Test
    public void creditSizeCalculationTest() {
        Client client1 = new BankEmployee(10);
        assertEquals(240, client1.getCreditSize(), DELTA);

        Client client2 = new BankEmployee(15);
        assertEquals(15 * 24, client2.getCreditSize(), DELTA);
    }

}