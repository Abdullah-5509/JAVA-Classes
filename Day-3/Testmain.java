package com.mit;

public class Testmain {
	public static void main(String[] args) {
		HRsystem employee1 = new HRsystem();
		employee1.showEmployee();
		employee1.setSalary(2344);
		
		HRsystem employee2 = new HRsystem();
		employee2.setName("LoL");
		employee2.setSalary(500000);
		employee2.setID(3);
		employee2.showEmployee();
		
		Student student1 = new Student();
		student1.showStudent();
		student1.setStudentname("Abdullah");
		student1.setStudentrollno(123);
		student1.setStudentclass(010);
	}

}
