package observer.weather_forecast;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherSubscriber mitko = new CitizenSubscriber("Mitko");
        WeatherSubscriber dobrina = new CitizenSubscriber("Dobrina");

        weatherStation.addSubscriber(mitko);
        weatherStation.addSubscriber(dobrina);

        weatherStation.removeSubscriber(dobrina);

        weatherStation.updateForecast(new Forecast(35f, 23f, 0.5f));
    }
}
