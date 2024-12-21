package Loop;

import java.util.Scanner;

public class PracticeExample3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 digit number");
		int num = sc.nextInt();
	
		if(num>=100 && num<=1000)
		{
			int hundred=num/100;
			int tens=(num/10)%10;
			int ones=num%10;
			
			int sum=hundred+tens+ones;
			System.out.println("sum is"+sum);
		}
		
	}

}
