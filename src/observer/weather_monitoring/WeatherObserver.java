package observer.weather_monitoring;

public interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}
