package LearnCollection;

import java.util.ArrayList;

public class ListExample2 {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(101,"Laptop",40000));
		products.add(new Product(102,"mobile",68000));
		products.add(new Product(103,"headphones",6000));
		
		System.out.println(products);
		for(Product p:products)
		{
			if(p.getprice()<40000)
			{
				System.out.println(p.getprice());
			}
		}
		
		for(Product p2:products)
		{
			if(p2.getName().startsWith("L"))
			{
				System.out.println(p2.getName());
			}
		}
		
	}
	
}
