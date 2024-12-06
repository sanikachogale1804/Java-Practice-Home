package Encapulation;

public class Employee {
	
	private int id;
	private String name;
	
	Employee()
	{
		
	}
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	
	public void setName()
	{
		
	}
}


