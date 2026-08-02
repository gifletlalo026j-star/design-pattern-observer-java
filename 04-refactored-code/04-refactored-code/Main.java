public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation =
                new WeatherStation();

        WeatherObserver currentConditions =
                new CurrentConditionsDisplay();

        WeatherObserver statistics =
                new StatisticsDisplay();

        WeatherObserver forecast =
                new ForecastDisplay();

        WeatherObserver heatIndex =
                new HeatIndexDisplay();

        weatherStation.registerObserver(
                currentConditions
        );

        weatherStation.registerObserver(
                statistics
        );

        weatherStation.registerObserver(
                forecast
        );

        weatherStation.registerObserver(
                heatIndex
        );

        System.out.println(
                "--- Weather Update 1 ---"
        );

        weatherStation.setMeasurements(
                80.0f,
                65.0f,
                30.4f
        );

        System.out.println(
                "\n--- Weather Update 2 ---"
        );

        weatherStation.setMeasurements(
                82.0f,
                70.0f,
                29.2f
        );

        System.out.println(
                "\n--- Weather Update 3 ---"
        );

        weatherStation.setMeasurements(
                78.0f,
                90.0f,
                29.2f
        );
    }
}
