package observer.weather_forecast;

public class CitizenSubscriber implements WeatherSubscriber {
    private float temperature;
    private float humidity;
    private float pressure;

    private final String subscriberName;

    public CitizenSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(Forecast forecast) {
        this.temperature = forecast.temperature();
        this.humidity = forecast.humidity();
        this.pressure = forecast.pressure();

        System.out.printf("Dear %s, there is forecast update for today! Current temperature is now %.2f, humidity " +
                "now is %.2f and pressure is %.2f%n", subscriberName, this.temperature, this.humidity, this.pressure);

    }
}
