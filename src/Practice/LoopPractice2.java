package Practice;

import java.util.Scanner;

public class LoopPractice2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<100 || n>999)
		{
			System.out.println("Enter valid three digit number");
		}
		else
		{
			int originalNumber=n;
			int sum=0;
			
			while(n>0)
			{
				int digit=n%10;
				sum+=Math.pow(digit, 3);
				n/=10;
			}
			if(sum==originalNumber)
			{
				System.out.println("Armstrong");
			}
			else
			{
				System.out.println("Not armstrong");
			}
			
		}
	}

}