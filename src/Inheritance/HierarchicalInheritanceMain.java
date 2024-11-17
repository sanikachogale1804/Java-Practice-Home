package Inheritance;

public class HierarchicalInheritanceMain {
	
	public static void main(String[] args) {
		
		Circle c=new Circle("blue", 5.8);
		System.out.println(c.calculateArea());
		
		Rectangle r=new Rectangle("red", 10, 5);
		System.out.println(r.AreaOfRectangle());
		
	}
}
