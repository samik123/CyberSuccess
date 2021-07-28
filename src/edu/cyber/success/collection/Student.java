package edu.cyber.success.collection;

public class Student {

	private int rollNo;
	private String name;

	//default constructor
	public Student(){

	}

	//parametarised constructor
	public Student(int rollNo, String name) {
		//super();
		this.rollNo = rollNo;
		this.name = name;
	}

	//getter for roll no
	public int getRollNo() {
		return rollNo;
	}

	//setter for roll no
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	//getter for name
	public String getName() {
		return name;
	}

	//setter for name
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [Roll no =" + rollNo + ", Name=" + name + "]";
	}



}
