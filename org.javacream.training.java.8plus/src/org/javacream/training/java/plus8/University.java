package org.javacream.training.java.plus8;

public class University implements AddressProvider, Info{

	private String name;
	private Address address;
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public University(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getCity() {
		return AddressProvider.super.getCity();
	}
	@Override
	public String getStreet() {
		return Info.super.getStreet();
	}

}
