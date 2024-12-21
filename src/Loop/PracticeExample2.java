package Loop;

import java.util.Scanner;

public class PracticeExample2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the basic of salary");
	double basicSalary = sc.nextDouble();
	
	double dietAllowance=0.20*basicSalary;
	double HouseRentAllowance=0.30*basicSalary;
	
	double grossSalary=basicSalary+dietAllowance+HouseRentAllowance;
	System.out.println(grossSalary);
	
}

}
