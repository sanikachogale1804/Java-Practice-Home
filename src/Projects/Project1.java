package Projects;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Project1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		TreeSet<Product> products=new TreeSet<Product>((p1,p2)->p2.getId()-p1.getId());
		
		products.add(new Product(101,"mobile",90000));
		products.add(new Product(102,"Laptop",68000));
		products.add(new Product(103,"HeadPhone",4000));
		products.add(new Product(104,"WashingMachine",50000));
		products.add(new Product(105,"Tv",100000));
		System.out.println(products);
	   
		System.out.println("Enter number");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("a for asc and b for dec");
			char ch = sc.next().charAt(0);
			if(ch=='a')
			{
				TreeSet<Product> asc=new TreeSet<Product>((p1,p2)->p1.getId()-p2.getId());
				System.out.println(products);
			}
			else if(ch=='b')
			{
				TreeSet<Product> dec=new TreeSet<Product>((p1,p2)->p2.getId()-p1.getId());
				System.out.println(products);
			}
			else
			{
				System.out.println("Invalid entry");
			}
			
		case 2:
			System.out.println("a for a-z  and b for z-a");
			char ch2=sc.next().charAt(0);
			if(ch2=='a')
			{
				TreeSet<Product> asc=new TreeSet<Product>((p1,p2)->p1.getName().compareTo(p2.getName()));
				System.out.println(products);
			}
			else if(ch2=='b')
			{
                TreeSet<Product> dec=new TreeSet<Product>((p1,p2)->p2.getName().compareTo(p1.getName()));
                System.out.println(products);
			}
			else
			{
				System.out.println("Invalid Entry");
			}
		case 3:
			System.out.println("a.low to high and b.high to low");
			char ch3=sc.next().charAt(0);
			if(ch3=='a')
			{
				TreeSet<Product> asc=new TreeSet<Product>((p1,p2)->p1.getPrice()-p2.getPrice());
				System.out.println(products);
			}
		}
			
	}
	
}
