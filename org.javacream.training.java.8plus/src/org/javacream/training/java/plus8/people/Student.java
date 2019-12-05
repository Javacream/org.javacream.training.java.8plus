package org.javacream.training.java.plus8.people;

public class Student extends Person {

	private University university;

	public Student(String lastname, String firstname, University university) {
		super(lastname, firstname);
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [university=" + university + ", toString()=" + super.toString() + "]";
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
}
