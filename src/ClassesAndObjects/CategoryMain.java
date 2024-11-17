package ClassesAndObjects;

public class CategoryMain {
	
	public static void main(String[] args) {
		
		new Category();
		
		Category c = new Category("cloths", 102);
		System.out.println(c.name);
		System.out.println(c.id);
		
		Category c2=new Category(101, "electronics");
		System.out.println(c2.id);
		System.out.println(c2.name);
		System.out.println(c2.id + c2.name);
		
		Category c3=new Category(5561);
	    System.out.println(c3.id);
		
	}

}
