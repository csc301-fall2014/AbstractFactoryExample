# The Factory Method Design Pattern

The _factory method_ design pattern solves the following problem:

 * Your application code needs to create instances of type T.       
 * T is an interface (or an abstract class) with different concrete implementations.
 * Your application code should __not__ depend on any specific implementation of T.

As usual, we will develop our solution one step at a time.     
Let's start from [step 1](https://github.com/csc301-fall2014/AbstractFactoryExample/tree/step1).
