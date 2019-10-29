package abstrakcje1;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee fullTimeEmp = new FullTimeEmployee("Jan", "nowak", "123415", 4560);
        Employee contractEmp = new ContractEmployee("Jan", "nowak", "123415", 25, 168);
        System.out.println(fullTimeEmp);
        System.out.println(contractEmp);
        Employee[] employees = new Employee[2];
        employees[0] = fullTimeEmp;
        employees[1] = contractEmp;
        printInfo(employees);
        Payable[] payable = new Payable[3];
        payable[0] = fullTimeEmp;
        payable[1] = contractEmp;
        payable[2] = new Invoice("dlugopis", 450, 3);
        printPayable(payable);
    }
    private static void printPayable(Payable[] payable) {
        for (Payable emp : payable) {
            System.out.println(emp);
            System.out.println(emp.getPaymentAmount());
        }
    }
    private static void printInfo(Employee[] employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
            System.out.println(emp.getPaymentAmount());
        }
    }
}

