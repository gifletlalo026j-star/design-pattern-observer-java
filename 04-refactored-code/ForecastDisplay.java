public class ForecastDisplay implements WeatherObserver {

    @Override
    public void update(
            float temperature,
            float humidity,
            float pressure) {

        String prediction;

        if (pressure < 29.92f) {
            prediction =
                    "Watch out for cooler, rainy weather";
        } else {
            prediction =
                    "Improving weather on the way!";
        }

        System.out.println(
                "Forecast: " + prediction
        );
    }
}
