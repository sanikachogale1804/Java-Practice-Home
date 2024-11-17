package Inheritance;

public class Person {

	String name;
	int age;
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void displaypersonalInfo()
	{
		System.out.println("person info:"+name + age);
	}
	
}
 