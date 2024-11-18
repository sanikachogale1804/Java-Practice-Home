package Abstraction;

public class InterfaceMain1 {
	
	public static void main(String[] args) {
	
		Vehicle car=new car();
		car.start();
		car.stop();
		car.displayInfo();
		
		Vehicle bike=new Bike();
		bike.start();
		bike.stop();
		
		//anonymous inner class
		Vehicle Truck=new Vehicle() {
			public void start()
			{
				System.out.println("truck started");
			}
			public void stop()
			{
				System.out.println("truck stopped");
			}
		};
		Truck.start();
		Truck.stop();
		
		
	}

}
