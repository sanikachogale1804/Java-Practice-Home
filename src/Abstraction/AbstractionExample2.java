package Abstraction;

abstract class Animal
{
	abstract void sound();
}

class Dog extends Animal
{
	void sound()
	{
		System.out.println("bho-bho");
	}
}

class Cat extends Animal
{
	void sound()
	{
		System.out.println("meow-meow");
	}
}
public class AbstractionExample2 {
	
	public static void main(String[] args) {
		
		Animal dog=new Dog();
		dog.sound();
		
		Animal cat=new Cat();
		cat.sound();
		
		Cat cat1=new Cat();
		cat1.sound();
		
		new Dog().sound();;
	}

}
