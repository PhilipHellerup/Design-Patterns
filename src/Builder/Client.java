package Builder; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Builder Pattern with a Director.
// The client does not know how the House is constructed.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Create a concrete builder
        HouseBuilder builder = new ModernHouseBuilder();

        // Create a director to control construction
        ConstructionDirector director = new ConstructionDirector();

        // Construct the house using the director
        House house = director.construct(builder);

        // Use the final product
        System.out.println(house);
    }
}
