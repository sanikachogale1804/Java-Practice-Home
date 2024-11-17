package Inheritance;

public class MultiLeveleinheritanceMain {
	
	public static void main(String[] args) {
		
		Person p=new Person("sanika", 20);
		System.out.println(p.name+p.age);
		
		Employee e=new Employee("sanika", 20, "manager");
		System.out.println(e.name+e.age+e.jobTitle);
		
		Manager m=new Manager("Sanika", 20, "manage", 800000);
		System.out.println(m.name+m.age+m.jobTitle+m.salary);
		
		p.displaypersonalInfo();
		e.displaypersonalInfo();
		e.displayEmployeeInfo();
		m.displayManagerInfo();
		m.displaypersonalInfo();
		m.displayEmployeeInfo();
	}

}
