package LearnCollection;

import java.util.ArrayList;

public class ListExample2 {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(101,"Laptop",60000));
		products.add(new Product(102,"mobile",68000));
		products.add(new Product(103,"headphones",6000));
		
		System.out.println(products);
	}
	
}
