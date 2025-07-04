package classes_constructors.inheritance;

public class Engineer extends Employee {
	
	// Specific behaviors or fields for different roles
    private String specialization;

    public Engineer(String name, int employeeId, double salary, String specialization) {
        super(name, employeeId, salary);
        this.specialization = specialization;
    }

    // Redefines inherited method to add subclass-specific behavior, demonstrating polymorphism as well
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}
