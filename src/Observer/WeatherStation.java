package Observer; // Project Organization

import java.util.ArrayList;
import java.util.List;

/* --- WeatherStation Class --- */
// Concrete Subject.
// Stores weather data and notifies observers
// when its state changes.
public class WeatherStation implements Subject {
    // # Attributes
    // List of registered observers
    private final List<Observer> observers = new ArrayList<>();

    // Subject state
    private float temperature;

    // # Observer Management
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // # State Change
    // Updates the temperature and notifies observers
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    // # Notification
    // Notifies all observers of the current temperature
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
