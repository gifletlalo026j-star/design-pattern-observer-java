import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private float temperature;
    private float humidity;
    private float pressure;

    private final List<WeatherObserver> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {

        for (WeatherObserver observer : observers) {

            observer.update(
                    temperature,
                    humidity,
                    pressure
            );
        }
    }

    public void setMeasurements(
            float temperature,
            float humidity,
            float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
