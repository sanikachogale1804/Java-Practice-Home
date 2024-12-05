package FunctionalIntarface;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
	
	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1,"mitali gurav","HR",50000));
		employees.add(new Employee(2,"riya chogale","Marketing",70000));
		employees.add(new Employee(3,"tushar jadhav","Marketing",60000));
		employees.add(new Employee(4,"vedant wadal","IT",80000));
		
		employees.forEach(employee->System.out.println(employee));
	}

}
