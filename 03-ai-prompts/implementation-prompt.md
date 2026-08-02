# AI Prompt: Observer Pattern Implementation Guidance

## Prompt

I have analyzed my Java Weather Monitoring System and identified the Observer Pattern as an appropriate solution.

The original system contains a `WeatherStation` class that directly updates multiple weather displays.

I want to refactor the system using the Observer Pattern.

Please guide me through the implementation step by step.

The refactored system should include:

1. A `WeatherObserver` interface.
2. A `WeatherStation` subject class.
3. A `CurrentConditionsDisplay` observer.
4. A `StatisticsDisplay` observer.
5. A `ForecastDisplay` observer.
6. A `HeatIndexDisplay` observer.

The `WeatherStation` should be able to:

* Register observers.
* Remove observers.
* Notify observers when measurements change.

Please explain:

1. The responsibility of each class.
2. Why an interface is useful for the observers.
3. How the `WeatherStation` should communicate with observers.
4. How the Observer Pattern reduces coupling.
5. How the new implementation preserves the behavior of the original application.
6. How I can add a new display without modifying the `WeatherStation`.

Please explain each step clearly for a beginner Java developer.

Start with the `WeatherObserver` interface before creating the other classes.
