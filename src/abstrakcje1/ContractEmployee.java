package abstrakcje1;

public class ContractEmployee extends  Employee{

    private double wage;
    private double hours;

    @Override
    public double getPaymentAmount() {
        return wage*hours;
    }

    public ContractEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                super.toString()+
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }
}
