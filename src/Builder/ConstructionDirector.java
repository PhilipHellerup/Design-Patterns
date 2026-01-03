package Builder; // Project Organization

/* --- ConstructionDirector Class --- */
// Director class.
// Controls the order in which the build steps are executed.
public class ConstructionDirector {
    // # Methods
    // Constructs a house using the provided builder
    public House construct(HouseBuilder builder) {
        // Execute build steps in a fixed order
        builder.buildFloors();
        builder.buildGarage();
        builder.buildGarden();

        // Return the completed house
        return builder.getResult();
    }
}
