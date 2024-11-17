package Inheritance;

public class Employee extends Person{

	String jobTitle;
	
	Employee()
	{
		
	}
	
	Employee(String name,int age,String jobTitle)
	{
		this.jobTitle=jobTitle;
	}
	
	void displayEmployeeInfo()
	{
		System.out.println("Employees Info:"+jobTitle);
	}
	
	
}
