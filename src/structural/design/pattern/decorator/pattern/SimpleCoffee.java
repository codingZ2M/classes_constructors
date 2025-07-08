package structural.design.pattern.decorator.pattern;

// Concrete class
class SimpleCoffee implements Coffee {
	
    public String getDescription() {
        return "Simple Coffee";
    }

    public double getCost() {
        return 5.0;
    }
    
}
