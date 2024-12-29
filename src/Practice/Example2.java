package Practice;

import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+",");
			}
		}
	}
		public static boolean isPrime(int num)
		{
			if(num<=1)
			{
				return false;
			}
			
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
			return true;
	}
}


