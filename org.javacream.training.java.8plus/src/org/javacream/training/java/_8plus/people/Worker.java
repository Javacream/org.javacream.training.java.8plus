package org.javacream.training.java._8plus.people;

public class Worker extends Person {

	private String company;

	public Worker(String lastname, String firstname, Address address) {
		super(lastname, firstname, address);
	}

	public Worker(String lastname, String firstname) {
		super(lastname, firstname);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getStreet() {
		return "Auf Arbeit!";
	}
}
