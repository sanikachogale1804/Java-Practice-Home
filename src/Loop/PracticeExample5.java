package Loop;

import java.util.Scanner;

//perfect or not
public class PracticeExample5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<=0)
		{
			System.out.println("Not perfectt");
		}
		
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		
		if(sum==n) {
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not perfect number");
		}
	}
	
}
