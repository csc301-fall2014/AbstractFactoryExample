package csc301.abstractFactoryExample.tripAdvisor;

public class TripAdvisorFactory {

	
	public TripAdvisor getInstance(String implName){
		if("TripAdvisor1".equals(implName)){
			return new TripAdvisor1();
		}
		if("TripAdvisor2".equals(implName)){
			return new TripAdvisor2();
		}
		throw new IllegalArgumentException("No such trip advisor implementation - " + implName);
	}
	
}
