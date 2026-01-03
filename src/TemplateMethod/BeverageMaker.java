package TemplateMethod; // Project Organization

/* --- BeverageMaker Class --- */
// Abstract class.
// Defines the Template Method (algorithm skeleton)
// and common steps shared by all beverages.
public abstract class BeverageMaker {
    // # Template Method
    // Defines the fixed sequence of steps for making a beverage.
    // Marked as final to prevent subclasses from changing the algorithm order.
    public final void makeBeverage() {
        boilWater();
        brew();          // Variable step (implemented by subclasses)
        pourIntoCup();
        addCondiments(); // Variable step (implemented by subclasses)
    }

    // # Fixed Steps
    // Shared implementation for boiling water
    private void boilWater() {
        System.out.println("Boiling water");
    }

    // Shared implementation for pouring into a cup
    private void pourIntoCup() {
        System.out.println("Pouring into cup");
    }

    // # Variable Steps
    // Steps that subclasses must implement
    protected abstract void brew();
    protected abstract void addCondiments();
}
