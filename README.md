# Step 4

We solve our problem in the usual way ... we introduce a middleman (in the form of an interface).

 * We define the [`TripAdvisorFactory.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisorFactory.java) as an interface.
 * We create two different implementations - [`TripAdvisorFactoryImpl1.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisorFactoryImpl1.java) which creates instances of type `TripAdvisor1`, and [`TripAdvisorFactoryImpl2.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisorFactoryImpl2.java) which creates instances of type `TripAdvisor2`


Notice that [`Application.java`](src/csc301/abstractFactoryExample/Application.java) depends only on the `TripAdvisorFactory` and `TripAdvisor`, not any specific implementation.

Our [`Main.java`](src/csc301/abstractFactoryExample/Main.java) has very clear responsibility - Instantiate a factory, pass it to the application, and run it.

This solution is a good example of an implementation of the abstract factory pattern.     

We can also do something cool, and remove the explicit dependency on `TripAdvisorFactoryImpl1` in `Main`.
Let's see it in [step 5](https://github.com/csc301-fall2014/AbstractFactoryExample/tree/step5).

 
