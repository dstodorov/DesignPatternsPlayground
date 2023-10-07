package observer.weather_forecast;

public interface WeatherSubscriber {
    void update(Forecast forecast);
}
