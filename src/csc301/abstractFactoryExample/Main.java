package csc301.abstractFactoryExample;

import csc301.abstractFactoryExample.tripAdvisor.TripAdvisor;
import csc301.abstractFactoryExample.tripAdvisor.TripAdvisor1;
import csc301.abstractFactoryExample.tripAdvisor.TripAdvisor2;

public class Main {

	public static void main(String[] args) {
		 
		TripAdvisor advisor;
		// Now we can use whichever implementation we choose 
		advisor = new TripAdvisor1();
		advisor = new TripAdvisor2();
		
		// Regardless of which trip advisor we instantiated, we can run our test code ...
		System.out.println("Now I can test the trip advisor ...");
		double price = advisor.getCheapestPrice("Toronto", "Montreal");
		System.out.println("A cheapest trip from Toronto to Montreal costs " + price + "$.");
		
	}

}
