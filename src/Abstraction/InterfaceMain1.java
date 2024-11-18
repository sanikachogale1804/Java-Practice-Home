package Abstraction;

public class InterfaceMain1 {
	
	public static void main(String[] args) {
	
		Vehicle car=new car();
		car.start();
		car.stop();
		car.displayInfo();
		
		Vehicle bike=new Bike();
		bike.start();
	}

}
