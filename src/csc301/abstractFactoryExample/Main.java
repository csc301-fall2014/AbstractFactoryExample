package csc301.abstractFactoryExample;

public class Main {

	public static void main(String[] args) {
		
		// We can decide which line to use ...
		TripAdvisor advisor = new TripAdvisor1();
//		TripAdvisor advisor = new TripAdvisor2();
		
		// Regardless of which trip advisor we instantiated, we can run our test code ...
		System.out.println("Now I can test the trip advisor ...");
		double price = advisor.getCheapestPrice("Toronto", "Montreal");
		System.out.println("A cheapest trip from Toronto to Montreal costs " + price + "$.");
		
	}

}
