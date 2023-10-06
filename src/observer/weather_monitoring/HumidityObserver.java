package observer.weather_monitoring;

public class HumidityObserver implements WeatherObserver{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Humidity Display: Current humidity is " + humidity + "%");
    }
}
