package org.javacream.training.java._8plus.people;

public class Student extends Person {

	private String university;

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Student(String lastname, String firstname, Address address) {
		super(lastname, firstname, address);
		// TODO Auto-generated constructor stub
	}

	public Student(String lastname, String firstname) {
		super(lastname, firstname);
		// TODO Auto-generated constructor stub
	}
}
