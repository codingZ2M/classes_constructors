package classes_constructors.inheritance;

public class Manager extends Employee {
	// Specific behaviors or fields for different roles
    private int teamSize;

    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary); // 🪜 Call to parent constructor
        this.teamSize = teamSize;
    }

    // Redefines inherited method to add subclass-specific behavior, demonstrating polymorphism as well
    @Override
    public void displayDetails() {
        super.displayDetails(); // Reuse base info
        System.out.println("Team Size: " + teamSize);
    }
}
