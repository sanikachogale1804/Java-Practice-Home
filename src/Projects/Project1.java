package Projects;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Project1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		TreeSet<Product> products=new TreeSet<Product>((p1,p2)->p1.getId()-p2.getId());
		
		products.add(new Product(101,"mobile",90000));
		products.add(new Product(102,"Laptop",68000));
		products.add(new Product(103,"HeadPhone",4000));
		products.add(new Product(104,"WashingMachine",50000));
		products.add(new Product(105,"Tv",100000));
		System.out.println("Products List:");
	    System.out.println(products);
		
	   
		System.out.println("Enter number for sorting option: 1,2,3");
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("a for asc and b for dec");
			char ch = sc.next().charAt(0);
			if(ch=='a')
			{
				TreeSet<Product> sortbyIdAsc=new TreeSet<Product>((p1,p2)->p1.getId()-p2.getId());
				sortbyIdAsc.addAll(products);
				System.out.println(sortbyIdAsc);
			}
			else if(ch=='b')
			{
				TreeSet<Product> sortbyIdDsc=new TreeSet<Product>((p1,p2)->p2.getId()-p1.getId());
				sortbyIdDsc.addAll(products);
				System.out.println(sortbyIdDsc);
			}
			else
			{
				System.out.println("Invalid entry");
			}
			break;
			
		case 2:
			System.out.println("a for a-z  and b for z-a");
			char ch2=sc.next().charAt(0);
			if(ch2=='a')
			{
				TreeSet<Product> AtoZ=new TreeSet<Product>((p1,p2)->p1.getName().compareTo(p2.getName()));
				AtoZ.addAll(products);
				System.out.println(AtoZ);
			}
			else if(ch2=='b')
			{
                TreeSet<Product> ZtoA=new TreeSet<Product>((p1,p2)->p2.getName().compareTo(p1.getName()));
                ZtoA.addAll(products);
                System.out.println(ZtoA);
			}
			else
			{
				System.out.println("Invalid Entry");
			}
			break;
			
		case 3:
			System.out.println("a.low to high and b.high to low");
			char ch3=sc.next().charAt(0);
			if(ch3=='a')
			{
				TreeSet<Product> LowToHigh=new TreeSet<Product>((p1,p2)->p1.getPrice()-p2.getPrice());
				LowToHigh.addAll(products);
				System.out.println(LowToHigh);
			}
			else if(ch3=='b')
			{
				TreeSet<Product> HighToLow=new TreeSet<Product>((p1,p2)->p2.getPrice()-p1.getPrice());
				HighToLow.addAll(products);
				System.out.println(HighToLow);
			}
		}
			
	}
	
}
