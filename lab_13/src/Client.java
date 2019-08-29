public abstract class Client {
    protected double salary;

    public Client(double salary) {
        this.salary = salary;
    }

    abstract double getInterestRate();

    abstract double getCreditSize();

    @Override
    public String toString() {
        return String.format("%s ; Зарплата: %.2f; Процентная ствака: %.4f; Размер кредита: %.2f;",
                this.getClass().getName(),
                salary,
                getInterestRate(),
                getCreditSize());
    }
}
