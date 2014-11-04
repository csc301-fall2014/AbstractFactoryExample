package csc301.abstractFactoryExample;

import csc301.abstractFactoryExample.tripAdvisor.TripAdvisorFactoryImpl1;

public class Main {

	public static void main(String[] args) {
		new Application(new TripAdvisorFactoryImpl1()).run();
	}

}
