package Decorator; // Project Organization

/* --- SugarDecorator Class --- */
// Concrete Decorator.
// Adds sugar behavior to a Beverage.
public class SugarDecorator extends BeverageDecorator {
    // # Constructor
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    // # Methods
    // Adds sugar to the description
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    // Adds sugar cost to the base beverage
    @Override
    public double cost() {
        return beverage.cost() + 2.0;
    }
}
