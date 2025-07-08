package structural.design.pattern.decorator.pattern;

/*
  Decorator Pattern:
	🔧 Purpose: Adds new behavior to objects dynamically without altering their structure.

	✅ Real-World Analogy:
		Adding features (e.g., extra cheese or olives) to a base pizza.
 */


// Client Code (Where dynamic behavior is added)
public class Main {
    public static void main(String[] args) {
    	
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription()); // Simple Coffee
        System.out.println(coffee.getCost());        // 5.0

        // Add milk dynamically
        coffee = new MilkDecorator(coffee);
        // Add sugar dynamically
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription()); // Simple Coffee, Milk, Sugar
        System.out.println(coffee.getCost());        // 7.0
    }
}

