package com.mit;

public class Student {
	private String student_name;
	private int student_rollno;
	private int student_class;
	private String student_course;
	
	public Student() {
		student_name = "xxxxx";
		student_rollno = 0000;
		student_class = 510;
		student_course = "Core";
	}
	public Student(int rollno, String name, int classes, String course) {
		student_name = name;
		student_rollno = rollno;
		student_class = classes;
		student_course = course;
	}
	
	
	public void setStudentname(String name){
		student_name = name;
	}
	public void setStudentrollno(int rollno){
		student_rollno = rollno;
	}
	public void setStudentclass(int classes){
		student_class = classes;
	}
	public void setStudentcourse(String course){
		student_course = course;
	}
	public void showStudent() {
		System.out.println("Student Details: "+ student_name+" "+student_rollno+" "+student_class);
	}

}
