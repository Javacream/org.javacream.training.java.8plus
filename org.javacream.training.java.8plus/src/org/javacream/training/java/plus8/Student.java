package org.javacream.training.java.plus8;

public class Student extends Person {

	private String university;

	public Student(String lastname, String firstname, String university) {
		super(lastname, firstname);
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [university=" + university + ", toString()=" + super.toString() + "]";
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
}
