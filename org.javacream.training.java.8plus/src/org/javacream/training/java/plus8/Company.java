package org.javacream.training.java.plus8;

public class Company implements AddressProvider{

	private String companyName;
	public String getName() {
		return companyName;
	}
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}
}
