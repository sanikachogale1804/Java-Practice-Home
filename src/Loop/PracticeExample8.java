package Loop;

import java.util.Scanner;

public class PracticeExample8 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
		
	}
		
		public static boolean isPrime(int n)
		{
			if(n<=1)
			{
				return false;
			}
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		}
	}
		
	

