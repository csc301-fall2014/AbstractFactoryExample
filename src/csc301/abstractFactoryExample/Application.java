package csc301.abstractFactoryExample;

import csc301.abstractFactoryExample.tripAdvisor.TripAdvisor;
import csc301.abstractFactoryExample.tripAdvisor.TripAdvisorFactory;

public class Application {

	// Notice that this class depends only on interfaces, and not on
	// any specific implementation.
	
	private TripAdvisorFactory factory;
	
	
	public Application(TripAdvisorFactory factory){
		this.factory = factory;
	}
	
	
	public void run(){
		TripAdvisor advisor = factory.getInstance();
		
		System.out.println("Now I can test the trip advisor ...");
		double price = advisor.getCheapestPrice("Toronto", "Montreal");
		System.out.println("A cheapest trip from Toronto to Montreal costs " + price + "$.");
	}
	
	
}
