# Step 4

We solve our problem in the usual way ... we introduce a middleman (in the form of an interface).

 * We define the [`TripAdvisorFactory.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisorFactory.java) as an interface.
 * We create two different implementations - [`TripAdvisorFactoryImpl1.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisorFactoryImpl1.java) which creates instances of type `TripAdvisor1`, and [`TripAdvisorFactoryImpl2.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisorFactoryImpl2.java) which creates instances of type `TripAdvisor2`


Notice that the `run` method in [`Main.java`](src/csc301/abstractFactoryExample/Main.java) depends only on the `TripAdvisorFactory` and not the various implementation.

You may think that we are still cheating: 
 * In the main method of [`Main.java`](src/csc301/abstractFactoryExample/Main.java) we instantiate a `TripAdvisorFactoryImpl1` (which depends on `TripAdvisor1`), so we still depend on specific implementations.
 * This is true, but this is only because we are trying to keep this example small:
   * The code in the `run` method in [`Main.java`](src/csc301/abstractFactoryExample/Main.java) represents our application business logic (i.e. The "interesting stuff").
   * The `main` method in [`Main.java`](src/csc301/abstractFactoryExample/Main.java) represents the part that instantiates objects.

To convince you that we are not cheating, and that abstract factories allow you to write your application code without any dependencies on specific implementations, let's see [step 5](https://github.com/csc301-fall2014/AbstractFactoryExample/tree/step5).

 
