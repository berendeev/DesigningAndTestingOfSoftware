// Граждане с плохой кредитной историей
public class BadCreditHistoryCivilian extends Client {

    public BadCreditHistoryCivilian(double salary) {
        super(salary);
    }

    @Override
    double getInterestRate() {
        return 50;
    }

    @Override
    double getCreditSize() {
        return salary * 6;
    }
}
