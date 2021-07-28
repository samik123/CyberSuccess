package edu.cyber.success.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudentDemo {

	public static void main(String[] args) {

		List<Student> listStudent  = new ArrayList<Student>(10);

		Student stu1 = new Student(1001,"Akshay");
		listStudent.add(stu1);

		Student stu2 = new Student(1002,"Pranali");
		listStudent.add(stu2);

		Student stu3 = new Student(1003,"Santosh");
		listStudent.add(stu3);

		Student stu4 = new Student(1004,"Prashant");
		listStudent.add(stu4);

		Student stu5 = new Student(1005,"Priya");
		listStudent.add(stu5);
		
		
//read
		for(Student studentObj : listStudent){
			//System.out.println("Roll No :"+studentObj.getRollNo()+" Name:"+studentObj.getName());
			System.out.println(studentObj);
		}

	}

}
