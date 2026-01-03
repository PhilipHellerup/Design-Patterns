package Builder; // Project Organization

/* --- HouseBuilder Interface --- */
// Builder interface.
// Declares the steps required to build a House.
public interface HouseBuilder {
    // # Build Steps
    // Builds the floors of the house
    void buildFloors();

    // Builds the garage of the house
    void buildGarage();

    // Builds the garden of the house
    void buildGarden();

    // Returns the final constructed House
    House getResult();
}
