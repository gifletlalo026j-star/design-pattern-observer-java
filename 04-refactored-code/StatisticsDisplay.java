public class StatisticsDisplay implements WeatherObserver {

    @Override
    public void update(
            float temperature,
            float humidity,
            float pressure) {

        System.out.printf(
                "Weather statistics: Avg/Max/Min temperature = %.1f/%.1f/%.1f%n",
                temperature - 2,
                temperature + 2,
                temperature - 5
        );
    }
}
