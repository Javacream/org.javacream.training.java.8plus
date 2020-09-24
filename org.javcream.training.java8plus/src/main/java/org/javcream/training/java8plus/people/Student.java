package org.javcream.training.java8plus.people;

public class Student extends Person {
	private String university;
	
	public Student(String lastname, String firstname, Address address, String university) {
		super(lastname, firstname, address);
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

}
