package Observer; // Project Organization

/* --- PhoneDisplay Class --- */
// Concrete Observer.
// Displays temperature updates on a phone UI.
public class PhoneDisplay implements Observer {
    // # Methods
    // Reacts to temperature changes
    @Override
    public void update(float temperature) {
        System.out.println("Phone display: " + temperature + "°C");
    }
}
