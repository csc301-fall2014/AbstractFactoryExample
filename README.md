# Step 4

We solve our problem in the usual way ... we introduce a middleman (in the form of an interface).

 * We define the [`TripAdvisorFactory.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisorFactory.java) as an interface.
 * We create two different implementations - [`TripAdvisorFactoryImpl1.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisorFactoryImpl1.java) which creates instances of type `TripAdvisor1`, and [`TripAdvisorFactoryImpl2.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisorFactoryImpl2.java) which creates instances of type `TripAdvisor2`


Notice that the `run` method in [`Main.java`](src/csc301/abstractFactoryExample/Main.java) depends only on the `TripAdvisorFactory` and not the various implementation.

You may think that we are still cheating: 
 * In the main method of [`Main.java`](src/csc301/abstractFactoryExample/Main.java) we instantiate a `TripAdvisorFactoryImpl1` (which depends on `TripAdvisor1`), so we still depend on specific implementations.
 * This is true, but it's only because we trying to keep this example small:
   * The `run` method in [`Main.java`](src/csc301/abstractFactoryExample/Main.java) represents the application business logic (i.e. The "interesting stuff").
   * The `main` method in [`Main.java`](src/csc301/abstractFactoryExample/Main.java) represents the application initialization.
 * Also, notice that, if we delete `TripAdvisorFactoryImpl2` and `TripAdvisor2`, everything else still compiles.


To prove a point, and (hopefully) convince you that we are not cheating, let's see [step 5](https://github.com/csc301-fall2014/AbstractFactoryExample/tree/step5).

 
