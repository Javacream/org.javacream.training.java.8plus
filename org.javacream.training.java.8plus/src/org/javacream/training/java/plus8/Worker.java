package org.javacream.training.java.plus8;

public class Worker extends Person {

	private String company;

	public Worker(String lastname, String firstname, String company) {
		super(lastname, firstname);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
