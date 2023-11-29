package bai2;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour, 8);
    }

    @Override
    public int calculateSalary() {
        return 8*super.getPaymentPerHour();
    }
}
