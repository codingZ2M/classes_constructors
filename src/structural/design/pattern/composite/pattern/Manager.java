package structural.design.pattern.composite.pattern;

import java.util.ArrayList;
import java.util.List;

// Composite Class (Group of Items)
// Both Developer and Manager implement the same interface (Employee), which defines the method:showDetails()
class Manager implements Employee {
    private String name;
    private List<Employee> team = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    // That’s polymorphism — same method, different behavior.
    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        for (Employee e : team) {
        	// "showDetails() inside Manager calls showDetails() on Developer objects" 
        	// It’s recursively delegating the call to the individual team members.
            e.showDetails();  // SAME METHOD WORKS FOR GROUP!
        }
    }
}

