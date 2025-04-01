import java.util.Scanner;
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
    
    public abstract double calculatePay();
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}

public class MyEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee type (hourly/salaried): ");
        String type = scanner.nextLine();

        Employee employee;

        if (type.equalsIgnoreCase("hourly")) {
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter Hourly Rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Enter Hours Worked: ");
            int hours = scanner.nextInt();
            
            employee = new HourlyEmployee(name, id, rate, hours);
        } else if (type.equalsIgnoreCase("salaried")) {
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            
            employee = new SalariedEmployee(name, id, salary);
        } else {
            System.out.println("Invalid employee type!");
            scanner.close();
            return;
        }

        System.out.println("\nEmployee Details:");
        employee.getEmployeeDetails();
        System.out.println("Pay: $" + employee.calculatePay());

        scanner.close();
    }
}
