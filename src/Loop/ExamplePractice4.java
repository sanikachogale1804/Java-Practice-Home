package Loop;

import java.util.Scanner;

public class ExamplePractice4 {

	//armstrong or not
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three digit number:");
		int num = sc.nextInt();
		
		if(num>100 || num<999)
		{
			System.out.println("Enter valid three digit number:");
		}
		
		
	}
	
}
