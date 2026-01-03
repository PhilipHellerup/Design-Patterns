package TemplateMethod; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Template Method Pattern.
// The client interacts only with the template method
// and does not control individual algorithm steps.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Create a tea beverage using the template method
        BeverageMaker tea = new TeaMaker();
        tea.makeBeverage();

        System.out.println("----"); // Visual separator

        // Create a coffee beverage using the same template
        BeverageMaker coffee = new CoffeeMaker();
        coffee.makeBeverage();
    }
}
