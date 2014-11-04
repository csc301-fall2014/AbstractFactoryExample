package csc301.abstractFactoryExample;
import java.lang.reflect.InvocationTargetException;

import csc301.abstractFactoryExample.tripAdvisor.TripAdvisorFactory;

public class Main {

	
	/**
	 * A helper function that creates an instance of class, given the class's name.
	 * NOTE: 
	 * This is (1) a fairly advanced topic (2) could be done better.
	 * It is not part of the course material, I just wanted you to see that it is possible
	 * to write a program that depends solely on the domain's interfaces, without 
	 * mentioning any specific implementation. 
	 */
	private static TripAdvisorFactory createFactory(String className) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException{
		Class<?> clazz = Class.forName(className);
		return (TripAdvisorFactory) clazz.getConstructor().newInstance();
	}
	
	
	
	public static void main(String[] args){
		try{
			new Application(createFactory(System.getenv("FACTORY_IMPL"))).run();
		} catch (Exception e){
			System.out.println("Ooops ... " + e.getMessage());
		}
	}

	
}
