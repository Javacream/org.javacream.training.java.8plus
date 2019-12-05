package org.javacream.training.java.plus8;

public interface AddressProvider {

	Address getAddress();
	default String getShortAddress() {
		return "city=" + getAddress().getCity() + ", street=" + getAddress().getStreet();
	}
	
	default String getCity() {
		return getAddress().getCity();
	}

	default String getStreet() {
		return getAddress().getStreet();
	}
	
	default Address getNormalizedAddress() {
		return new Address(getNormalizedCity(getCity()), getNormalizedStreet(getStreet()));
	}
	private String getNormalizedCity(String city) {
		return city.toUpperCase();
	}
	private String getNormalizedStreet(String street) {
		return street.toLowerCase();
	}

}