package Loop;

import java.util.Scanner;

public class PracticeExample2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the basic of salary");
	double basicSalary = sc.nextDouble();
	
	double dietAllowance=basicSalary*0.20;
	double HouseRentAllowance=basicSalary*0.30;
	
	double grossSalary=basicSalary+dietAllowance*HouseRentAllowance;
	System.out.println(grossSalary);
	
}

}
