package Decorator; // Project Organization

/* --- MilkDecorator Class --- */
// Concrete Decorator.
// Adds milk behavior to a Beverage.
public class MilkDecorator extends BeverageDecorator {
    // # Constructor
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    // # Methods
    // Adds milk to the description
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    // Adds milk cost to the base beverage
    @Override
    public double cost() {
        return beverage.cost() + 5.0;
    }
}
