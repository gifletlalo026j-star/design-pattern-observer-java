public class CurrentConditionsDisplay implements WeatherObserver {

    @Override
    public void update(
            float temperature,
            float humidity,
            float pressure) {

        System.out.printf(
                "Current conditions: %.1f°F, %.1f%% humidity%n",
                temperature,
                humidity
        );
    }
}
