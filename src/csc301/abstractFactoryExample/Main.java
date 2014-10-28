package csc301.abstractFactoryExample;

public class Main {

	public static void main(String[] args) {
		
		TripAdvisor1 advisor = new TripAdvisor1();
		
		System.out.println("Now I can test the trip advisor ...");
		double price = advisor.getCheapestPrice("Toronto", "Montreal");
		System.out.println("A cheapest trip from Toronto to Montreal costs " + price + "$.");
		
	}

}
