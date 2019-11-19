package org.javacream.training.java._8plus.people;

public class Student extends Person {

	private University university;

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public Student(String lastname, String firstname, Address address) {
		super(lastname, firstname, address);
	}

	public Student(String lastname, String firstname) {
		super(lastname, firstname);
	}
}
