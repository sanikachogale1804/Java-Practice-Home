package Loop;

import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits:");
		int num = sc.nextInt();
		int a=num;
		int rev=0;
		int rem=0;
		
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Given ");
	}

}
