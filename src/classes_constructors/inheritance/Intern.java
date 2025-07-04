package classes_constructors.inheritance;

public class Intern extends Employee {
	
	// Specific behaviors or fields for different roles
    private int internshipDurationMonths;

    public Intern(String name, int employeeId, double salary, int duration) {
        super(name, employeeId, salary);
        this.internshipDurationMonths = duration;
    }

    // Redefines inherited method to add subclass-specific behavior, demonstrating polymorphism as well
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDurationMonths + " months");
    }
}
