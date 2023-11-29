package bai2;

public abstract class Employee implements IEmployee{
    protected String name;
    protected int paymentPerHour;
    protected int workingHours;

    public Employee(String name, int paymentPerHour, int workingHours) {
    }

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }


    @Override
    public String getName() {
        return null;
    }
}
