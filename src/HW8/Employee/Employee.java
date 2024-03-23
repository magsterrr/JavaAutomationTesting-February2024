package HW8.Employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(int id, String firstName, String lastName, double monthlySalary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getName () {
        return firstName + " " + lastName;
    }
    public double getAnnualSalary () {
        return 12 * monthlySalary;
    }
    public double raiseMonthlySalary () {
        monthlySalary = monthlySalary + (0.10 * monthlySalary);
        return monthlySalary;
    }
    public String toString () {
        return "Employee (" +
                "ID = " + id +
                ", First Name = " + firstName  +
                ", Last Name = " + lastName  +
                ", Salary = " + monthlySalary +
                ')';


    }
}
