package org.college;

public class Student extends Dept {
	
	public void studentName() {
		
		System.out.println("Student Name: Jagan");
		
	}
	
	public void studentDept() {
		
		System.out.println("Student Department: IT");
		
	}
	
	public void studentId() {
		
		System.out.println("Student ID: AB9876");
		
	}

	public static void main(String[] args) {
		
		Student stud=new Student();
		
		stud.collegeName();
		
		stud.collegeCode();
		
		stud.collegeRank();
		
		stud.hostelName();
		
		stud.deptName();
		
		stud.studentName();
		
		stud.studentDept();
		
		stud.studentId();

	}

}
