package csc301.abstractFactoryExample.tripAdvisor;

public class TripAdvisorFactoryImpl1 implements TripAdvisorFactory{

	
	public TripAdvisor getInstance(){
			return new TripAdvisor1();
	}
	
	
}
