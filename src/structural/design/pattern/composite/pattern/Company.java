package structural.design.pattern.composite.pattern;


/*
Composite Pattern:
	🔧 Purpose: Treat individual objects and groups of objects uniformly.
				You can write one set of code that works the same way for a single item and a group of items.
				
	🏢 Real-World Example: Company Employees (Organization Tree)
		Imagine you're building a system to represent a company hierarchy.
		You have:
			Individual employees (like a developer)
			Managers, who have teams of employees
		But both:
			Developers (leaf nodes)
			Managers (composite nodes)
			
		Should be able to do things like: employee.showDetails();
 */


/*
  🧠 Why Use Composite Pattern?
		You want to write one method like showDetails() that works for:
			A single employee (e.g., a developer)
			A group of employees (e.g., a manager with a team)
 */

public class Company {
    public static void main(String[] args) {
        // Individual developers
        Employee dev1 = new Developer("Alice", "Frontend Developer");
        Employee dev2 = new Developer("Bob", "Backend Developer");

        // Manager
        Manager manager = new Manager("Carol");
        manager.addEmployee(dev1);
        manager.addEmployee(dev2);

        // Show details of individual
        dev1.showDetails();  // Works on single object

        // Show details of manager's team
        manager.showDetails();  // SAME METHOD works on group
    }
}
