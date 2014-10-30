# Step 5

We changed the code in [`Main.java`](src/csc301/abstractFactoryExample/Main.java):

 * We instantiate a `TripAdvisorFactory` using reflections, and choose the implementation based on an [environment variable](http://en.wikipedia.org/wiki/Environment_variable).
 * If you look at the import list, at the top of [`Main.java`](src/csc301/abstractFactoryExample/Main.java), you can see that we don't depend on any specific implementation.
 * By using an environment variable to choose the implementation, we can run the same code in different environment, and load the proper `TripAdvisorFactory` implementation (based on the running environment).

Please note that instantiating an object using reflections is __not__ part of the course material.    
We are showing this solution to prove a point:
 * We designed our application in a modular way.
 * It allowed us to completely separate responsibilities:
   * A `TripAdvisorFactory` is any class that creates `TripAdvisor` instances.
   * Our application can use any `TripAdvisorFactory` in order to instantiate `TripAdvisor`s.
   * `TripAdvisorFactoryImpl1` knows how to create `TripAdvisor1` instances.
   * `TripAdvisorFactoryImpl2` knows how to create `TripAdvisor2` instances.
   * There is a separate part of our application that is in charge of instantiating a `TripAdvisorFactory`.
 * Separating the responsibilities allows us to:
   * Change one part of the application without affecting others.
   * Improve our application incrementally (we can improve one component at a time).
   
