package org.javacream.training.java.plus8.people;

public class Freelancer extends Person {

	public Freelancer(String lastname, String firstname) {
		super(lastname, firstname);
	}

	private Double salary;

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
