# Step 1

This is the bad example:

 * The application code in [`Main.java`](src/csc301/abstractFactoryExample/Main.java) uses the [`TripAdvisor1.java`](src/csc301/abstractFactoryExample/tripAdvisor/TripAdvisor1.java) class directly.
 * We didn't even bother to define a `TripAdvisor` interface.
 * Our code doesn't even take into account the possibility that we may want to implement different algorithms for our trip advisor.
