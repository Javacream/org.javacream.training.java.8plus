package org.javcream.training.java8plus.people;

public interface Addressable {
	Address getAddress();
	default String getCity() {
		return "Berlin";
	}
}
