package observer.weather_monitoring;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver temperatureDisplay = new TemperatureObserver();
        WeatherObserver humidityObserver = new HumidityObserver();

        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(humidityObserver);

        weatherStation.setWeatherData(25.5f, 60.2f, 1013.5f);
        weatherStation.setWeatherData(23.8f, 57.9f, 1012.2f);
    }
}
