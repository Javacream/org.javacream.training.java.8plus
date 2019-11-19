package org.javacream.training.java._8plus.people;

public interface AddressProvider {

	Address getAddress();
	public default String getCity() {
		return getAddress().getCity();
	}
	public default String getStreet() {
		return getAddress().getCity();
	}
	
	public default Address getNormalizedAddress() {
		Address address =  getAddress();
		String normalizedCity = normalizeCity(address.getCity());
		String normalizedStreet = normalizeStreet(address.getStreet());
		return new Address(normalizedCity, normalizedStreet);
	}
	private String normalizeCity(String city) {
		return city.toUpperCase();
	}
	private String normalizeStreet(String street) {
		return street.toUpperCase();
	}
	
}
