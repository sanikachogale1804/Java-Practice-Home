package Loop;

import java.util.Scanner;

public class PracticeExample1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal amount: ");
		double P = sc.nextDouble();
		System.out.println("Enter rate of Interest");
		double R = sc.nextDouble();
		System.out.println("Time");
		double T = sc.nextDouble();
		
		double simpleIntereset=P*R*T/100;
		System.out.println(simpleIntereset);
		
	}

}
