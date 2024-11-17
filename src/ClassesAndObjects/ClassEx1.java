package ClassesAndObjects;

public class ClassEx1 {
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.id=101;
		s.name="sanika";
		System.out.println(s.id);
		System.out.println(s.id=101);
		System.out.println(s.name);
		
		Student s2 = new Student();
		System.out.println(s2.subtraction(30,20));
	}

}
