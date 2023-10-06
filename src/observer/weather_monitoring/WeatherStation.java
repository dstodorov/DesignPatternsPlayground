package observer.weather_monitoring;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<WeatherObserver> observers = new ArrayList<>();

    private float temperature;
    private float humidity;
    private float pressure;

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }

    private void notifyObservers() {
        this.observers.forEach(observer -> {
            observer.update(temperature, humidity, pressure);
        });
    }

}
