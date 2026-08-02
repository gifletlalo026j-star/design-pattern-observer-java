# Reflection

## 1. How did implementing the pattern improve the code's maintainability?

Implementing the Observer Pattern improved maintainability by separating the weather station from the display components.

The original `WeatherStation` class contained methods for every display.

After refactoring, each display became an independent class.

This means changes to one display can be made without changing the weather station.

---

## 2. What future changes will be easier because of this pattern?

Adding new displays will be easier.

For example, if I want to create a humidity display, I can create a new class that implements the `WeatherObserver` interface.

I can then register the new display with the weather station.

I do not need to modify the existing `WeatherStation` notification logic.

This makes the application easier to extend.

---

## 3. Were there any unexpected challenges in implementing the pattern?

One challenge was understanding how the subject and observers communicate.

At first, it may seem simpler for the weather station to directly call each display.

However, the Observer Pattern requires thinking about the relationship differently.

The weather station is responsible for managing observers and notifying them.

The individual observers are responsible for deciding what to do with the updated information.

Another challenge was understanding how interfaces reduce coupling.

The `WeatherStation` does not need to know the exact class of each display.

It only needs to know that the object implements `WeatherObserver`.

---

## 4. What did I learn?

I learned that design patterns are reusable solutions to common software design problems.

The Observer Pattern is useful when one object needs to notify multiple other objects about changes.

I also learned that design patterns can make code easier to maintain and extend.

---

## 5. What would I improve?

In a larger application, I would improve the testing by using a professional testing framework such as JUnit.

I would also consider using immutable objects to represent weather measurements.

This could make the system safer and easier to reason about.

---

## 6. What will I learn next?

My next goal is to learn more Java design patterns.

I would like to study:

* Strategy Pattern
* Factory Pattern
* Adapter Pattern
* Singleton Pattern
* Decorator Pattern

I would also like to practice identifying when a design pattern is actually useful instead of applying patterns unnecessarily.
