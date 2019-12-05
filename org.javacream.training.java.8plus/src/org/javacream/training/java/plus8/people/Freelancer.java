package org.javacream.training.java.plus8.people;

public class Freelancer extends Person {

	public Freelancer(String lastname, String firstname) {
		super(lastname, firstname);
	}

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
