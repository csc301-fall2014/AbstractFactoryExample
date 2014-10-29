package csc301.abstractFactoryExample;

import csc301.abstractFactoryExample.tripAdvisor.TripAdvisor;
import csc301.abstractFactoryExample.tripAdvisor.TripAdvisorFactory;
import csc301.abstractFactoryExample.tripAdvisor.TripAdvisorFactoryImpl1;

public class Main {

	
	// Notice how the code in this function only depends on the two interfaces:
	// TripAdvisorFactory and TripAdvisor.
	public static void run(TripAdvisorFactory factory){
		TripAdvisor advisor = factory.getInstance();
		
		System.out.println("Now I can test the trip advisor ...");
		double price = advisor.getCheapestPrice("Toronto", "Montreal");
		System.out.println("A cheapest trip from Toronto to Montreal costs " + price + "$.");
	}
	

	
	public static void main(String[] args) {
		run(new TripAdvisorFactoryImpl1());
	}

}
