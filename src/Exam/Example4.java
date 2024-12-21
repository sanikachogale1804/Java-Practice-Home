package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Example4 {

	public static boolean isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				numbers.add(i);
			}
		}
		for (int i = 0; i < numbers.size(); i += 3) {
			System.out.println(numbers.get(i));
		}	

	}
}
