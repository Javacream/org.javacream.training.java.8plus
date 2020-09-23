package org.javcream.training.java8plus.people;

public class Company implements AddressProvider {
	
	@Override
	public Address getAddress() {
		return new Address("irgend", "wo");
	}

}
