package org.javacream.training.java._8plus.people;

public class Worker extends Person {

	private String company;

	public Worker(String lastname, String firstname, Address address) {
		super(lastname, firstname, address);
		// TODO Auto-generated constructor stub
	}

	public Worker(String lastname, String firstname) {
		super(lastname, firstname);
		// TODO Auto-generated constructor stub
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
