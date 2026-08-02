public class WeatherStationTest {

    public static void main(String[] args) {

        testWeatherMeasurements();
        testObserverRegistration();
        testObserverRemoval();

        System.out.println();
        System.out.println("All tests passed successfully!");
    }

    public static void testWeatherMeasurements() {

        WeatherStation weatherStation =
                new WeatherStation();

        weatherStation.setMeasurements(
                80.0f,
                65.0f,
                30.4f
        );

        assertEquals(
                80.0f,
                weatherStation.getTemperature(),
                "Temperature"
        );

        assertEquals(
                65.0f,
                weatherStation.getHumidity(),
                "Humidity"
        );

        assertEquals(
                30.4f,
                weatherStation.getPressure(),
                "Pressure"
        );

        System.out.println(
                "✓ Weather measurements test passed"
        );
    }

    public static void testObserverRegistration() {

        WeatherStation weatherStation =
                new WeatherStation();

        TestObserver observer =
                new TestObserver();

        weatherStation.registerObserver(observer);

        weatherStation.setMeasurements(
                80.0f,
                65.0f,
                30.4f
        );

        if (!observer.wasUpdated()) {

            throw new AssertionError(
                    "Observer was not notified"
            );
        }

        System.out.println(
                "✓ Observer registration test passed"
        );
    }

    public static void testObserverRemoval() {

        WeatherStation weatherStation =
                new WeatherStation();

        TestObserver observer =
                new TestObserver();

        weatherStation.registerObserver(observer);

        weatherStation.removeObserver(observer);

        weatherStation.setMeasurements(
                80.0f,
                65.0f,
                30.4f
        );

        if (observer.wasUpdated()) {

            throw new AssertionError(
                    "Observer was notified after removal"
            );
        }

        System.out.println(
                "✓ Observer removal test passed"
        );
    }

    private static void assertEquals(
            float expected,
            float actual,
            String fieldName) {

        if (Float.compare(expected, actual) != 0) {

            throw new AssertionError(
                    fieldName
                    + " expected "
                    + expected
                    + " but got "
                    + actual
            );
        }
    }

    static class TestObserver
            implements WeatherObserver {

        private boolean updated = false;

        @Override
        public void update(
                float temperature,
                float humidity,
                float pressure) {

            updated = true;
        }

        public boolean wasUpdated() {

            return updated;
        }
    }
}
