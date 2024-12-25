package Loop;

import java.util.Scanner;

public class PracticeExample11 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		if(num<100 && num>999)
		{
			System.out.println("invalid number");
		}
		else
		{
			int originalNumber=num;
			double sum=0;
			
			while(num>0)
			{
				int digit=num%10;
				sum+=Math.pow(digit, 3);
				num=num/10; 
			}
			
			if(sum==originalNumber)
			{
				System.out.println("armstrong");
			}
			else
			{
				System.out.println("not armstrong");
			}
		}
		
		
		
	}
	
}
