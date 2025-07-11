package structural.design.pattern.decorator.pattern;

// Concrete Decorators (Adding Behavior Dynamically)
class MilkDecorator extends CoffeeDecorator {
	
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return coffee.getCost() + 1.5;
    }
}