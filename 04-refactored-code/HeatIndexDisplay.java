public class HeatIndexDisplay implements WeatherObserver {

    @Override
    public void update(
            float temperature,
            float humidity,
            float pressure) {

        float heatIndex =
                (temperature + humidity) / 2;

        System.out.printf(
                "Heat index: %.1f%n",
                heatIndex
        );
    }
}
