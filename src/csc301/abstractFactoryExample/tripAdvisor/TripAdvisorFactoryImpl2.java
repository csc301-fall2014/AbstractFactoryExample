package csc301.abstractFactoryExample.tripAdvisor;

public class TripAdvisorFactoryImpl2 implements TripAdvisorFactory {

	@Override
	public TripAdvisor getInstance() {
		return new TripAdvisor2();
	}

}
