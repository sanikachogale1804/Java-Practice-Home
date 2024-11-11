package ClassesAndObjects;

public class ClassEx1 {
	
	public static void main(String[] args) {
		
		Student s= new Student();
		s.studentDetails();
		
		System.out.println(s.square(7));
		
		Student s2 = new Student();
		System.out.println(s2.cube(9));
		
		System.out.println(s.id=(1));
		s.name="sanika";
		System.out.println(s.name);
		
		Student s3 = new Student();
		System.out.println(s3.areaOfSquare(10, 10));
		
	}

}
