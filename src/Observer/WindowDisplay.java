package Observer; // Project Organization

/* --- WindowDisplay Class --- */
// Concrete Observer.
// Displays temperature updates on a window display.
public class WindowDisplay implements Observer {
    // # Methods
    // Reacts to temperature changes
    @Override
    public void update(float temperature) {
        System.out.println("Window display: " + temperature + "°C");
    }
}
