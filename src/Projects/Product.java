package Projects;

import java.util.Comparator;
//public class Product implements Comparable<Product>{
public class Product implements Comparator<Product>{

	private int id;
	private String name;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return 0;
	}
//	@Override
//	public int compareTo(Product o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
	
}
