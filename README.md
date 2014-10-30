# Step 3

Seems like we solved the problem:

 * We created [TripAdvisorFactory.java](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisorFactory.java).    
 * When we call the `TripAdvisorFactory`'s `getInstance` method, we tell it the name of the implementation we are interested in.
 * The code in [`Main.java`](src/csc301/abstractFactoryExample/Main.java) no longer depends on neither `TripAdvisor1` nor `TripAdvisor2`.

The problem is that we "cheated":
 * `Main` depends on `TripAdvisorFactory`, which depends on both `TripAdvisor1` and `TripAdvisor2`.
 * The dependency is still there, we just made it implicit.

To make the point above clearer, you can think of it this way: If we delete one of the implementations (e.g. `TripAdvisor2`), then `TripAdvisorFactory` will not compile, and, therefore, `Main` will not compile.

Let's fix this problem in [step 4](https://github.com/csc301-fall2014/AbstractFactoryExample/tree/step4).
