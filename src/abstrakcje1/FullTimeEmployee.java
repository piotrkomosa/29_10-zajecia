package abstrakcje1;

public class FullTimeEmployee extends Employee {

    private double salary;

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    public FullTimeEmployee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                super.toString()+
                "salary=" + salary +
                '}';
    }
}
