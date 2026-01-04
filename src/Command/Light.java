package Command; // Project Organization

/* --- Light Class --- */
// Receiver class.
// Contains the actual business logic
// that commands delegate to.
public class Light {
    // # Methods
    // Turns the light on
    public void turnOn() {
        System.out.println("Light is ON");
    }

    // Turns the light off
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}
