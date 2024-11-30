package StreamApi;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Example10 {
	
	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<Employee>();
	   employees.add(new Employee(101,'P'));
	   employees.add(new Employee(102,'P'));
	   employees.add(new Employee(103,'P'));
	   
	   System.out.println(employees);
	   
	  boolean ans= employees.stream().allMatch((n)->n.getEmployeeAttendance()=='P');
	  System.out.println(ans);
	}
	

}
