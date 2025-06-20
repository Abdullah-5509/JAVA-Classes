package com.mit;

public class HRsystem {
	
	private int employee_number;
	private String employee_name;
	private double employee_salary;
	
	public HRsystem () {
		this.employee_name = "Abdullah";
		this.employee_number = 5509;
		this.employee_salary = 100000;
	}
	
	public HRsystem(int number, String name, double salary) {
		employee_number = number;
		employee_name = name;
		employee_salary = salary;
	}
	
	public void showEmployee() {
		System.out.println("Emplyee: " +employee_number+" "+employee_name+" "+employee_salary);
	}
	public void setSalary(double salary) {
		employee_salary =salary;
	}
	public void setName(String name) {
		employee_name = name;
		
		
	}
	public void setID(int number) {
		employee_number = number;
	}
	
	public static void main(String[] args) {
		HRsystem employee = new HRsystem();
		employee.showEmployee();
		employee.employee_number = 2;
		employee.showEmployee();
		
	}

}
