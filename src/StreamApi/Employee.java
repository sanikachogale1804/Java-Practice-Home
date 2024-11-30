package StreamApi;

import java.util.ArrayList;

public class Employee {
	
	int employeeId;
	char employeeAttendance;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public char getEmployeeAttendance() {
		return employeeAttendance;
	}
	public void setEmployeeAttendance(char employeeAttendance) {
		this.employeeAttendance = employeeAttendance;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeAttendance=" + employeeAttendance + "]";
	}
	public Employee(int employeeId, char employeeAttendance) {
		super();
		this.employeeId = employeeId;
		this.employeeAttendance = employeeAttendance;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
