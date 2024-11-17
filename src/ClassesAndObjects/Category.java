package ClassesAndObjects;

import java.lang.reflect.Constructor;

public class Category {
	
	int id;
	String name;
	
	//non-parameterized constructor
	Category()
	{
		System.out.println("Object will created:");
	}

	Category(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	Category(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	Category(int id)
	{
	this.id=id;	
	}
}
