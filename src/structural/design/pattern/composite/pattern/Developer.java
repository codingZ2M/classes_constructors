package structural.design.pattern.composite.pattern;

// Leaf Class (Single Item)
// Both Developer and Manager implement the same interface (Employee), which defines the method:showDetails()
class Developer implements Employee {
	
    private String name;
    private String role;

    public Developer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // That’s polymorphism — same method, different behavior.
    public void showDetails() {
        System.out.println(name + " - " + role);
    }
}
