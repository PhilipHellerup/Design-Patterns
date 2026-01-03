package TemplateMethod; // Project Organization

/* --- TeaMaker Class --- */
// Concrete class.
// Implements the variable steps of the template
// for preparing tea.
public class TeaMaker extends BeverageMaker {
    // # Variable Step
    // Defines how tea is brewed
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    // # Variable Step
    // Defines which condiments are added to tea
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
