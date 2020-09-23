package org.javcream.training.java8plus.people;

public interface AddressProvider {

	Address getAddress();
	default String getCity() {
		return getAddress().getCity();
	}
	default String getStreet() {
		return getAddress().getStreet();
	}
	
	default Address getNormalizedAddress() {
		Address a = getAddress();
		Address result = new Address(a.getCity().toUpperCase(), a.getStreet().toUpperCase());
		return result;
	}
	
	default boolean validate() {
		return true;
	}
}
