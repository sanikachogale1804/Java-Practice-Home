package Loop;

import java.util.Scanner;

public class ForLoopEx4 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digits");
		int num = sc.nextInt();
		int rev=0,rem,temp;
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
			System.out.println(temp+"palindrom ");
		else
			System.out.println(temp+"Not palindrom");
		
	}

}
