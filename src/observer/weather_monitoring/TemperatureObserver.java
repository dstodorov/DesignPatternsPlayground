package observer.weather_monitoring;

public class TemperatureObserver implements WeatherObserver{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Temperature Display: Current temperature is " + temperature + " degrees Celsius");
    }
}
