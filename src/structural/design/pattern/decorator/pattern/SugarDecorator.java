package structural.design.pattern.decorator.pattern;

// Concrete Decorators (Adding Behavior Dynamically)
class SugarDecorator extends CoffeeDecorator {
	
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    public double getCost() {
        return coffee.getCost() + 0.5;
    }
}
