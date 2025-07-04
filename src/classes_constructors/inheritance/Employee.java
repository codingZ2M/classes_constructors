package classes_constructors.inheritance;

/*
 Goal of Inheritance:
 	Inherit fields and methods from a superclass and also define its own behavior.
 	Enables code reuse and creates a hierarchical relationship between classes.
 	All subclasses reuse name, salary, and displayDetails() from Employee - Avoids repeating common attributes and behavior
 */

// Creating a superclass Employee and extended it with subclasses like Manager and Engineer.
public class Employee {
	// A company with common attributes for all employees 
    protected String name;  // Allow access in subclasses
    protected int employeeId;
    protected double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Salary: ₹" + salary);
    }
}
