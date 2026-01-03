package Builder; // Project Organization

/* --- House Class --- */
// Product class.
// Represents the complex object that is built step by step.
public class House {
    // # Attributes
    private int floors;
    private boolean hasGarage;
    private boolean hasGarden;

    // # Methods
    // Sets the number of floors
    public void setFloors(int floors) {
        this.floors = floors;
    }

    // Sets whether the house has a garage
    public void setGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    // Sets whether the house has a garden
    public void setGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    // Returns a string representation of the house
    @Override
    public String toString() {
        return "House [floors=" + floors +
                ", garage=" + hasGarage +
                ", garden=" + hasGarden + "]";
    }
}
