// Гражданин
public class Civilian extends Client {
    public Civilian(double salary) {
        super(salary);
    }

    @Override
    double getInterestRate() {
        double creditSize = getCreditSize();
        double interestRate;
        if (creditSize > 100000) {
            interestRate = 100000 / creditSize;
        } else if (creditSize > 10000) {
            interestRate = 5;
        } else {
            interestRate = 50;
        }
        return interestRate;
    }

    @Override
    double getCreditSize() {
        return salary * 10;
    }

}
