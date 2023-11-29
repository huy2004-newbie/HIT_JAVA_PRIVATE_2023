package bai2;

public class PartTimeEmployee extends Employee{

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour, workingHours);
    }

    @Override
    public int calculateSalary() {
        return super.getWorkingHours()*super.getPaymentPerHour();
    }
}
