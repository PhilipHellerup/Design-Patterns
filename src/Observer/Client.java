package Observer; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Observer Pattern.
// The client creates the subject and observers
// and wires them together.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Create the subject
        WeatherStation station = new WeatherStation();

        // Create observers
        Observer phone = new PhoneDisplay();
        Observer window = new WindowDisplay();

        // Register observers
        station.registerObserver(phone);
        station.registerObserver(window);

        // Trigger state changes
        station.setTemperature(22.5f);
        station.setTemperature(25.0f);
    }
}
