package org.javcream.training.java8plus.people;

public class Worker extends Person {
	private String company;
	
	public Worker(String lastname, String firstname, Address address, String company) {
		super(lastname, firstname, address);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
