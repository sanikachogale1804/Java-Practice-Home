package Inheritance;

public class Manager extends Employee{

	int salary;
	
	Manager(String name,int age,String jobTitle,int salary)
	{
		this.salary=salary;
	}
	
	void displayManagerInfo()
	{
		System.out.println("Manager Info");
	}
}
