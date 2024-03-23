package HW8.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(2, "Magdalena", "Trifonova", 2000 );
        String name = employee.getName();
        System.out.println("Full name is: " + name );
        double annualSalary = employee.getAnnualSalary();
        System.out.println("Annual salary is: " +annualSalary);
        System.out.println(employee);

        double raisedMonthlySalary = employee.raiseMonthlySalary();
        System.out.println("The raised by 10% monthly salary is: " + raisedMonthlySalary);
        annualSalary = employee.getAnnualSalary();
        System.out.println("The new anual salary is: "+ annualSalary);
        System.out.println(employee);
    }
}
