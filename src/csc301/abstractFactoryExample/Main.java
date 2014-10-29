package csc301.abstractFactoryExample;

import csc301.abstractFactoryExample.tripAdvisor.TripAdvisor;
import csc301.abstractFactoryExample.tripAdvisor.TripAdvisorFactory;

public class Main {

	public static void main(String[] args) {
		
		// We can decide which line to use ...
		TripAdvisorFactory factory = new TripAdvisorFactory();
		TripAdvisor advisor = factory.getInstance("TripAdvisor1");
		
		// Regardless of which trip advisor we instantiated, we can run our test code ...
		System.out.println("Now I can test the trip advisor ...");
		double price = advisor.getCheapestPrice("Toronto", "Montreal");
		System.out.println("A cheapest trip from Toronto to Montreal costs " + price + "$.");
		
	}

}
