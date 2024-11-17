package Inheritance;

public class SingleInheritanceMain {
	
	public static void main(String[] args) {
		
		Car c=new Car("Car", "Porsche", "petrol");
		System.out.println(c.make);
		System.out.println(c.model);
		System.out.println(c.FuelType);
		c.startEngine();
	}

}
