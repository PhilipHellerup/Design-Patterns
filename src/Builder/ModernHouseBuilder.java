package Builder; // Project Organization

/* --- ModernHouseBuilder Class --- */
// Concrete builder.
// Implements the steps to build a modern-style house.
public class ModernHouseBuilder implements HouseBuilder {
    // # Attributes
    private House house = new House();

    // # Build Steps
    @Override
    public void buildFloors() {
        house.setFloors(2);
    }

    @Override
    public void buildGarage() {
        house.setGarage(true);
    }

    @Override
    public void buildGarden() {
        house.setGarden(true);
    }

    // # Result
    // Returns the constructed house
    @Override
    public House getResult() {
        return house;
    }
}
