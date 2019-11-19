package org.javacream.training.java._8plus.people;

public class Freelancer extends Person {
	private String customer;

	@Override
	public String toString() {
		return "Freelancer [customer=" + customer + ", toString()=" + super.toString() + "]";
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Freelancer(String lastname, String firstname) {
		super(lastname, firstname);
	}
}
