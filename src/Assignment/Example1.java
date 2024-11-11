package Assignment;

import java.util.Scanner;

public class Example1 {
	static int n=153;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<100 || n>999)
		{
			System.out.println("Invalid number");
		}
		else
		{
			int originalNumber = n;
			int sum = 0;
			
			while(n>0)
			{
				int digit=n%10;
				sum+=Math.pow(digit,3);
				n/=10;
			}
			
			if(sum==originalNumber)
			{
				System.out.println("Armstrong ");
			}
			else
			{
				System.out.println("Non-armstrong");
			}
		}
	}

}
