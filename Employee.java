import java.util.*;
import java.util.function.Function;

class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Smith", 5000));
        employees.add(new Employee("Alice", "Brown", 6500));
        employees.add(new Employee("David", "Wilson", 4500));

        Function<Employee, String> card =
                e -> "Name: " + e.getLastName() + ", " + e.getFirstName()
                   + " - Salary: $" + e.getSalary();

        Function<Employee, Double> salaryPicker = Employee::getSalary;
        for (Employee e : employees) {
            System.out.println(card.apply(e));
            System.out.println("Salary only: $" + salaryPicker.apply(e));
            System.out.println("-----");
        }
    }
}
