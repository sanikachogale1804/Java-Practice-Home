package ClassesAndObjects;

public class Employee {
	
	int id;
	String name;
	int salary;
	
	Employee()
	{
		
	}
	
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	void setEmployeeDetails(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
}
