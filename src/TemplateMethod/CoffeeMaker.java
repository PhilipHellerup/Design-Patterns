package TemplateMethod; // Project Organization

/* --- CoffeeMaker Class --- */
// Concrete class.
// Implements the variable steps of the template
// for preparing coffee.
public class CoffeeMaker extends BeverageMaker {
    // # Variable Step
    // Defines how coffee is brewed
    @Override
    protected void brew() {
        System.out.println("Brewing the coffee");
    }

    // # Variable Step
    // Defines which condiments are added to coffee
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
