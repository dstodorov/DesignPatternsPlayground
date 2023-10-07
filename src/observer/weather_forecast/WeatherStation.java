package observer.weather_forecast;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<WeatherSubscriber> weatherSubscribers = new ArrayList<>();

    private Forecast forecast;

    public void addSubscriber(WeatherSubscriber subscriber) {
        weatherSubscribers.add(subscriber);
    }

    public void removeSubscriber(WeatherSubscriber subscriber) {
        weatherSubscribers.remove(subscriber);
    }

    public void updateForecast(Forecast forecast) {
        this.forecast = forecast;

        notifySubscribers();
    }

    private void notifySubscribers() {
        weatherSubscribers.forEach(subscriber -> {
            subscriber.update(this.forecast);
        });
    }
}
