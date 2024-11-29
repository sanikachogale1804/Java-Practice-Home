package LearnCollection;

import java.util.TreeMap;

public class MapExamplePractice3 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,Product> products = new TreeMap<Integer, Product>((p1,p2)->p2-p1);
		products.put(101, new Product(101,"mobile",70000));
		products.put(102, new Product(102,"laptop",90000));
		products.put(99, new Product(99,"tablet",40000));
		
		System.out.println(products);
		System.out.println(products.get(102));
		
		Product product = products.get(102);
		System.out.println(product.getName());
		System.out.println(product.getprice());
		
	}

}
