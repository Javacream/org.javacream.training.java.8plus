package org.javacream.training.java.plus8;

public interface Info {
	Address getAddress();
	String getCity();
	default String getStreet() {
		//e.g. databaseaccess, ...
		return "Alexanderplatz";
	}
}
