package Encapulation;

public class ENCP1 {
	
	public static void main(String[] args) {
		
		Category c=new Category();
		c.setId(101);
		c.setName("Clothes");
		
		System.out.println(c.getId());
		System.out.println(c.getName());
	}

}
