package ClassesAndObjects;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		
		
		Employee e1=new Employee(101, "sanika", 60000);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
	
		Employee e2=new Employee();
		e2.setEmployeeDetails(102, "sneha", 50000);
		
		
	}

}
