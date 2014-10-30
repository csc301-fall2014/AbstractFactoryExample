# Step 2

This is much better:

 * We created the [`TripAdvisor.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisor.java) interface.
 * We created two dummy implemntations, [`TripAdvisor1.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisor1.java) and [`TripAdvisor2.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisor2.java).
 * Our code in [`Main.java`](src/csc301/abstractFactoryExample/Main.java) now declares the `advisor` variable as `TripAdvisor`.
 
There is still a problem though ...

If you look at the import lists, at the top of [`Main.java`](src/csc301/abstractFactoryExample/Main.java), you can see that we have a dependency on `TripAdvisor1` and `TripAdvisor2`.

These dependencies exist because the code in `Main` is responsible for instantiating a `TripAdvisor` instance.
Therefore, it has to know about any implementation that it might use.

We will solve this problem by creating a `TripAdvisorFactory` class, and give it the responsibility of instantiating `TripAdvisor`s.     
Let's see how this is done in [step 3](https://github.com/csc301-fall2014/AbstractFactoryExample/tree/step3).
